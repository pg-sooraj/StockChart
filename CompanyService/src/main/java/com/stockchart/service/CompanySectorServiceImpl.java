package com.stockchart.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.stockchart.dao.CompanyDao;
import com.stockchart.dao.SectorDao;
import com.stockchart.entity.Company;
import com.stockchart.entity.Sector;

@Service
public class CompanySectorServiceImpl implements CompanySectorService {
	
	private CompanyDao companyDao;
	private SectorDao sectorDao;
	
	public CompanySectorServiceImpl(CompanyDao companyDao, SectorDao sectorDao) {
		super();
		this.companyDao = companyDao;
		this.sectorDao = sectorDao;
	}

	@Override
	@Transactional
	public Company addCompany(Company company) {
		return companyDao.saveAndFlush(company);
	}

	@Override
	@Transactional
	public Company getCompanyById(Integer companyId) {
		return companyDao.getOne(companyId);
	}

	@Override
	@Transactional
	public List<Company> getCompanyBySector(Integer sectorId) {
		return null;
	}

	@Override
	@Transactional
	public List<Company> getAllCompany() {
		return companyDao.findAll();
	}

	@Override
	@Transactional
	public Company updateCompany(Company company) {
		Integer companyId = company.getCompanyId();
		companyDao.deleteById(companyId);
		return companyDao.saveAndFlush(company);
	}

	@Override
	@Transactional
	public void deleteCompany(Company company) {
		companyDao.delete(company);
	}

	@Override
	@Transactional
	public Sector addSector(Sector sector) {
		return sectorDao.saveAndFlush(sector);
	}

	@Override
	@Transactional
	public void deleteSector(Sector sector) {
		sectorDao.delete(sector);
	}
}
