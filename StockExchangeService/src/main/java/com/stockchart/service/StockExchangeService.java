package com.stockchart.service;

import java.util.List;
import java.util.Optional;

import com.stockchart.entity.StockExchange;

public interface StockExchangeService {
	
	public StockExchange addStockExchange(StockExchange stockExchange);
	public List<StockExchange> findAllStockExchange();
	public Optional<StockExchange> findStockExchangeById(Integer stockExchangeId);
	public StockExchange updateStockExchange(StockExchange stockExchange);
	public void deleteStockExchange(StockExchange stockExchange);
}
