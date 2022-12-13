package com.luciuswong.interfacesegregation.service;

import com.luciuswong.interfacesegregation.entity.Entity;

public interface PersistenceService<T extends Entity> {
	public void save(T entity);
	public void delete(T entity);
	public T findById(Long id);
}
