package com.stockchart.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ipo")
public class IPO {
	private Integer ipoId;
	private Integer companyId;
	private Integer stockExchangeId;
	private Double pricePerShare;
	private Integer totalNumberOfShares;
	private String remarks;

}
