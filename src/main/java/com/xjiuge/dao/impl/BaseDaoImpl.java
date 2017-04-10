package com.xjiuge.dao.impl;


import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xjiuge.dao.BaseDao;
@Transactional
public class BaseDaoImpl<T> implements BaseDao<T> {

	private Class<T> entityClass;
	
@SuppressWarnings("unchecked")
public BaseDaoImpl(){
	 entityClass =(Class<T>) ((ParameterizedType) getClass().getGenericSuperclass
			 ()).getActualTypeArguments()[0];
}

	final String save = "_insert"; 
	final String where = "_selectByWhere";
	final String getbyid = "_getById";
	final String delete = "_delete";
	final String update = "_update";
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	@Override
	public int save(T entity) {
		String CRUD_SAVE = entityClass.getSimpleName()+save;
		if(sessionTemplate==null){
			System.out.println("null");
		}
		return sessionTemplate.insert(CRUD_SAVE, entity);
	}

	@Override
	public List<T> findByPorperty(Object... str) {
		Map map = new HashMap();
		for (int i = 0; i < str.length; i=i+2) {
			map.put(str[i], str[i+1]);
		}
		return selectByWhere(map);
	}

	
	private List<T> selectByWhere(Map map){
		String CRUD_SELECTBYWHERE = entityClass.getSimpleName()+where;
		return sessionTemplate.selectList(CRUD_SELECTBYWHERE, map);
	}

	@Override
	public T get(Serializable id) {
		String CRUD_GETBYID = entityClass.getSimpleName()+getbyid;
		
		return sessionTemplate.selectOne(CRUD_GETBYID, id);
	}

	@Override
	public void delete(Serializable id) {
		String CRUD_DELETE = entityClass.getSimpleName()+delete;
		sessionTemplate.delete(CRUD_DELETE, id);
	}

	@Override
	public void update(T entity) {
		String CRUD_UPDATE = entityClass.getSimpleName()+update;
		sessionTemplate.update(CRUD_UPDATE, entity);
	}
}
