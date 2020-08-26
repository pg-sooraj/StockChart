package com.stockchart.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockchart.entity.Company;
import com.stockchart.service.CompanySectorService;

@RestController
@RequestMapping("/company")
public class CompanyController {
	
	private CompanySectorService companySectorService;

	public CompanyController(CompanySectorService companySectorService) {
		super();
		this.companySectorService = companySectorService;
	}
	
	@PostMapping(value = "/addCompany")
    public ResponseEntity<Company> addGiftOrder(@RequestBody Company company) {
		return new ResponseEntity<>(companySectorService.addCompany(company), HttpStatus.OK);
	}
	
	
}
