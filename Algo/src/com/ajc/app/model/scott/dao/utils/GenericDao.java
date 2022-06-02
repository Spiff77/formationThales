package com.ajc.app.model.scott.dao.utils;

import java.util.List;

public interface GenericDao<K,T> {
	  	public List<T> findAll();
	    public T findById(K id);
	    public void insert(T obj);
	    public void update(T obj);
	    public void deleteById(K id);
	    public void delete(T obj);
}
