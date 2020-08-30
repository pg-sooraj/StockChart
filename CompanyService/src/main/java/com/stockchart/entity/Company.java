package com.stockchart.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="company")
public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="company_id")
	private Integer companyId;
	@Column(name="company_name")
	private String companyName;
	private String turnover;
	private String ceo;
	@OneToMany(targetEntity=Director.class, fetch = FetchType.LAZY)
	private List<Director> boardOfDirectors;
	@ManyToOne(targetEntity=Sector.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "sector_id")
	private Sector sector;
	private String brief;
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTurnover() {
		return turnover;
	}
	public void setTurnover(String turnover) {
		this.turnover = turnover;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public List<Director> getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOfDirectors(List<Director> boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	public Sector getSector() {
		return sector;
	}
	public void setSector(Sector sector) {
		this.sector = sector;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public Company(Integer companyId, String companyName, String turnover, String ceo, List<Director> boardOfDirectors,
			Sector sector, String brief) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.turnover = turnover;
		this.ceo = ceo;
		this.boardOfDirectors = boardOfDirectors;
		this.sector = sector;
		this.brief = brief;
	}
	public Company() {
		super();
	}
}
