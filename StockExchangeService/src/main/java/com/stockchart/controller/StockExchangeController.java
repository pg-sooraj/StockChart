package com.stockchart.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockchart.entity.StockExchange;
import com.stockchart.service.StockExchangeService;

@RestController
@RequestMapping(value="/stockExchange")
public class StockExchangeController {
	
	private StockExchangeService stockExchangeService;

	public StockExchangeController(StockExchangeService stockExchangeService) {
		super();
		this.stockExchangeService = stockExchangeService;
	}
	
	@PostMapping(value = "/addStockExchange")
    public ResponseEntity<StockExchange> addGiftOrder(@RequestBody StockExchange stockExchange) {
		return new ResponseEntity<>(stockExchangeService.add(giftCardOrderDetails), HttpStatus.OK);
	}
}
