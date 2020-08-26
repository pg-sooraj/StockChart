package com.stockchart.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="directors")
public class Director {
	
	private Integer directorId;
	private String directorName;
	public Integer getDirectorId() {
		return directorId;
	}
	public void setDirectorId(Integer directorId) {
		this.directorId = directorId;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public Director(Integer directorId, String directorName) {
		super();
		this.directorId = directorId;
		this.directorName = directorName;
	}
	public Director() {
		super();
	}
}
