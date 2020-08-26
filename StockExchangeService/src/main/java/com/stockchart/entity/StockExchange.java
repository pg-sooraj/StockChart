package com.stockchart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stock_exchange")
public class StockExchange {
	@Id
	@Column(name="stock_exchange_id")
	private Integer stockExchangeId;
	@Column(name="stock_exchange_name")
	private String stockExchangeName;
	@Column(name="stock_exchange_brief")
	private String stockExchangeBrief;
	@Column(name="stock_exchange_address")
	private Address stockExchangeAddress;
	@Column(name="remarks")
	private String remarks;
	public Integer getStockExchangeId() {
		return stockExchangeId;
	}
	public void setStockExchangeId(Integer stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}
	public String getStockExchangeName() {
		return stockExchangeName;
	}
	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}
	public String getStockExchangeBrief() {
		return stockExchangeBrief;
	}
	public void setStockExchangeBrief(String stockExchangeBrief) {
		this.stockExchangeBrief = stockExchangeBrief;
	}
	public Address getStockExchangeAddress() {
		return stockExchangeAddress;
	}
	public void setStockExchangeAddress(Address stockExchangeAddress) {
		this.stockExchangeAddress = stockExchangeAddress;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public StockExchange(Integer stockExchangeId, String stockExchangeName, String stockExchangeBrief,
			Address stockExchangeAddress, String remarks) {
		super();
		this.stockExchangeId = stockExchangeId;
		this.stockExchangeName = stockExchangeName;
		this.stockExchangeBrief = stockExchangeBrief;
		this.stockExchangeAddress = stockExchangeAddress;
		this.remarks = remarks;
	}
	public StockExchange() {
		super();
	}
}
