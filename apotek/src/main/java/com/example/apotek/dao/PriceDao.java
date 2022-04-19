package com.example.apotek.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.apotek.model.Price;

@Repository
public class PriceDao {

	@Autowired
	EntityManager em;
	
	public Price add(Price price) throws Exception {
		em.persist(price);
		return price;
	}
}
