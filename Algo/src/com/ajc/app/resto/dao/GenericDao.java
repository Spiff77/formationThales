package com.ajc.app.resto.dao;

import java.util.List;

public interface GenericDao<K, T> {
	public List<T> findAll();
	public T findOne(K id);
	public void delete(K id);
	public void update(T object);
	public void add(T object);
}