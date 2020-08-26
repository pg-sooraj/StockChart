package com.stockchart.service;

import java.util.List;

import com.stockchart.entity.Company;
import com.stockchart.entity.Sector;

public interface CompanySectorService {
	public Company addCompany(Company company);
	public Company getCompanyById(Integer companyId);
	public List<Company> getCompanyBySector(Integer sectorId);
	public List<Company> getAllCompany();
	public Company updateCompany(Company company);
	public void deleteCompany(Company company);
	
	public Sector addSector(Sector sector);
	public void deleteSector(Sector sector);
	
}
