package com.xjiuge.service;

import java.io.Serializable;
import java.util.List;

import com.xjiuge.bean.User;

public interface BaseService<T> {

	/**
	 * 增
	 */
	public int save(T entity);
	/**
	 * 查list
	 */
	
	List<T> findByPorperty(Object...str);
	/**
	 * 查entity
	 */
	T get(Serializable id);
	/**
	 * 改
	 */
	void update(T entity);
	/**
	 * 删
	 */
	void delete (Serializable id);
}
