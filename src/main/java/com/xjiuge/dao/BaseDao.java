package com.xjiuge.dao;

import java.io.Serializable;
import java.util.List;


public interface BaseDao<T> {

	
	public int save(T t);
	
	public List<T> findByPorperty(Object ... str);
	
	public T get(Serializable id);
	
	public void delete(Serializable id);
	
	public void update(T entity);
}
