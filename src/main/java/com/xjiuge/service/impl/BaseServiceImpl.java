package com.xjiuge.service.impl;


import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.xjiuge.bean.User;
import com.xjiuge.dao.BaseDao;
import com.xjiuge.service.BaseService;


@Transactional
public class BaseServiceImpl<T> implements BaseService<T> {

	
	protected BaseDao<T> baseDao;
	@Autowired
	public void setBaseDao(BaseDao<T> baseDao) {
		this.baseDao = baseDao;
	}
	@Override
	public int save(T t) {
		return this.baseDao.save(t);
	}
	@Override
	public List<T> findByPorperty(Object... str) {
		
		return this.baseDao.findByPorperty(str);
	}
	@Override
	public T get(Serializable id) {
		
		return this.baseDao.get(id);
	}
	@Override
	public void update(T entity) {
		this.baseDao.update(entity);
	}
	@Override
	public void delete(Serializable id) {
		this.baseDao.delete(id);
	}

}
