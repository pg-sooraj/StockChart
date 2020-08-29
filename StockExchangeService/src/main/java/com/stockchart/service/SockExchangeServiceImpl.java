package com.stockchart.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stockchart.dao.StockExchangeDao;
import com.stockchart.entity.StockExchange;
import com.stockchart.exception.StockExchangeNotFoundException;

@Service
public class SockExchangeServiceImpl implements StockExchangeService {
	
	private StockExchangeDao stockExchangeDao;
	private final String  message = "Requested stock exchange not found";
	
	public SockExchangeServiceImpl(StockExchangeDao stockExchangeDao) {
		super();
		this.stockExchangeDao = stockExchangeDao;
	}

	@Override
	@Transactional
	public StockExchange addStockExchange(StockExchange stockExchange) {
		return stockExchangeDao.save(stockExchange);
	}

	@Override
	@Transactional
	public List<StockExchange> findAllStockExchange() {
		return stockExchangeDao.findAll();
	}

	@Override
	@Transactional
	public StockExchange findStockExchangeById(Integer stockExchangeId) throws StockExchangeNotFoundException {
		if(!stockExchangeDao.existsById(stockExchangeId)) {
			throw new StockExchangeNotFoundException(message);
		}
		return stockExchangeDao.findById(stockExchangeId).get();
	}

	@Override
	@Transactional
	public StockExchange updateStockExchange(StockExchange stockExchange) {
		stockExchangeDao.deleteById(stockExchange.getStockExchangeId());
		return stockExchangeDao.save(stockExchange);
	}

	@Override
	@Transactional
	public void deleteStockExchangeById(Integer stockExchangeId) throws StockExchangeNotFoundException {
		if(!stockExchangeDao.existsById(stockExchangeId)) {
			throw new StockExchangeNotFoundException(message);
		}
		stockExchangeDao.deleteById(stockExchangeId);
	}
}
