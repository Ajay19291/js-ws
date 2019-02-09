package com.jandarbar.ws.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class GenericServiceImpl<T>
{
	@Autowired
	JpaRepository<T, Long> repository;
	
	public List<T> getAll()
	{
		return repository.findAll();
	}
	
	public T getById(Long id)
	{
		return repository.findById(id).orElse(null);
	}

	public T save(T t)
	{
		return repository.save(t);
	}
	
	public T update(T t)
	{
		return repository.save(t);
	}
}
