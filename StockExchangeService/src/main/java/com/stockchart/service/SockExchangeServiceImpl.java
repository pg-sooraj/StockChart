package com.stockchart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stockchart.dao.StockExchangeDao;
import com.stockchart.entity.StockExchange;

@Service
public class SockExchangeServiceImpl implements StockExchangeService {
	
	private StockExchangeDao stockExchangeDao;
	
	public SockExchangeServiceImpl(StockExchangeDao stockExchangeDao) {
		super();
		this.stockExchangeDao = stockExchangeDao;
	}

	@Override
	@Transactional
	public StockExchange addStockExchange(StockExchange stockExchange) {
		return stockExchangeDao.saveAndFlush(stockExchange);
	}

	@Override
	@Transactional
	public List<StockExchange> findAllStockExchange() {
		return stockExchangeDao.findAll();
	}

	@Override
	@Transactional
	public Optional<StockExchange> findStockExchangeById(Integer stockExchangeId) {
		return stockExchangeDao.findById(stockExchangeId);
	}

	@Override
	@Transactional
	public StockExchange updateStockExchange(StockExchange stockExchange) {
		stockExchangeDao.deleteById(stockExchange.getStockExchangeId());
		return stockExchangeDao.saveAndFlush(stockExchange);
	}

	@Override
	@Transactional
	public void deleteStockExchange(StockExchange stockExchange) {
		stockExchangeDao.deleteById(stockExchange.getStockExchangeId());
	}
}
