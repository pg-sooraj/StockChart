package com.stockchart.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockchart.entity.StockExchange;
import com.stockchart.exception.StockExchangeNotFoundException;
import com.stockchart.service.StockExchangeService;

@RestController
@RequestMapping(value="/stockExchange")
public class StockExchangeController {
	
	private StockExchangeService stockExchangeService;

	public StockExchangeController(StockExchangeService stockExchangeService) {
		super();
		this.stockExchangeService = stockExchangeService;
	}
	
	@PostMapping(value = "/add")
    public ResponseEntity<StockExchange> addStockExchange(@RequestBody StockExchange stockExchange) {
		return new ResponseEntity<>(stockExchangeService.addStockExchange(stockExchange), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{stockExchangeId}")
    public ResponseEntity<StockExchange> getStockExchange(@PathVariable("stockExchangeId") Integer stockExchangeId) throws StockExchangeNotFoundException{
		StockExchange stockExchange = stockExchangeService.findStockExchangeById(stockExchangeId);
		return new ResponseEntity<>(stockExchange, HttpStatus.OK);
	}
	
	@GetMapping(value = "/all")
    public ResponseEntity<List<StockExchange>> getAllStockExchange() {
		return new ResponseEntity<>(stockExchangeService.findAllStockExchange(), HttpStatus.OK);
	}
	
	@PutMapping(value = "/update")
    public ResponseEntity<StockExchange> updateStockExchange(@RequestBody StockExchange stockExchange) {
		return new ResponseEntity<>(stockExchangeService.updateStockExchange(stockExchange), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{stockExchangeId}")
    public ResponseEntity<Void> deleteStockExchange(@PathVariable("stockExchangeId") Integer stockExchangeId) throws StockExchangeNotFoundException {
		stockExchangeService.deleteStockExchangeById(stockExchangeId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
