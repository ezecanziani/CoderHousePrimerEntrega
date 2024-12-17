package com.coderhouse.dao;

import org.springframework.stereotype.Service;

import com.coderhouse.entity.Client;
import com.coderhouse.entity.Products;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class DaoFactory {

	@PersistenceContext
	private EntityManager ec;
	
	@Transactional
	public void persisirClient(Client client) {
		ec.persist(client);
	}
	
	@Transactional
	public void persisirProductos(Products products) {
		ec.persist(products);
	}
	
}
