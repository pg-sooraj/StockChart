package com.stockchart.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="sector")
public class Sector {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sector_id")
	private Integer sectorId;
	@Column(name="sector_name")
	private String sectorName;
	@OneToMany(targetEntity=Company.class, fetch = FetchType.LAZY)
	private List<Company> company;
	public Integer getSectorId() {
		return sectorId;
	}
	public void setSectorId(Integer sectorId) {
		this.sectorId = sectorId;
	}
	public String getSectorName() {
		return sectorName;
	}
	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}
	public List<Company> getCompany() {
		return company;
	}
	public void setCompany(List<Company> company) {
		this.company = company;
	}
	public Sector(Integer sectorId, String sectorName, List<Company> company) {
		super();
		this.sectorId = sectorId;
		this.sectorName = sectorName;
		this.company = company;
	}
	public Sector() {
		super();
	}
}
