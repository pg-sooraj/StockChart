package com.stockchart.service;

import java.util.List;

import com.stockchart.entity.StockExchange;
import com.stockchart.exception.StockExchangeNotFoundException;

public interface StockExchangeService {
	
	public StockExchange addStockExchange(StockExchange stockExchange);
	public List<StockExchange> findAllStockExchange();
	public StockExchange findStockExchangeById(Integer stockExchangeId) throws StockExchangeNotFoundException;
	public StockExchange updateStockExchange(StockExchange stockExchange);
	public void deleteStockExchangeById(Integer stockExchangeId) throws StockExchangeNotFoundException;
}
