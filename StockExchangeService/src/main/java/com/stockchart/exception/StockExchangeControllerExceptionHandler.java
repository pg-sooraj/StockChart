package com.stockchart.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StockExchangeControllerExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<StockExchangeErrorResponse> handleException(StockExchangeNotFoundException senfe){
		StockExchangeErrorResponse stockExchangeErrorResponse= new StockExchangeErrorResponse( 
	    		  senfe.getMessage(), HttpStatus.NOT_FOUND.value(), System.currentTimeMillis());
		return new ResponseEntity<StockExchangeErrorResponse>(stockExchangeErrorResponse, HttpStatus.NOT_FOUND);
		}
}
