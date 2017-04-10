package com.xjiuge.service;

import java.io.Serializable;
import java.util.List;

import com.xjiuge.bean.User;

public interface BaseService<T> {

	/**
	 * ��
	 */
	public int save(T entity);
	/**
	 * ��list
	 */
	
	List<T> findByPorperty(Object...str);
	/**
	 * ��entity
	 */
	T get(Serializable id);
	/**
	 * ��
	 */
	void update(T entity);
	/**
	 * ɾ
	 */
	void delete (Serializable id);
}
