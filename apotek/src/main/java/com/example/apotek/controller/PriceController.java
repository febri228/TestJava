package com.example.apotek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apotek.model.Price;
import com.example.apotek.service.PriceService;

@RestController
@RequestMapping("price")
public class PriceController {
	
	@Autowired
	private PriceService priceService;
	
	@PostMapping
	public ResponseEntity<?> insert(@RequestBody Price price) throws Exception {
		return ResponseEntity.ok(priceService.add(price));
	}
}
