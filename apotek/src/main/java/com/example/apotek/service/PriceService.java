package com.example.apotek.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apotek.dao.PriceDao;
import com.example.apotek.model.Price;

@Service
public class PriceService {

	@Autowired
	private PriceDao priceDao;
	
	@Transactional
	public Price add(Price price) throws Exception {
		return priceDao.add(price);
	}
}
