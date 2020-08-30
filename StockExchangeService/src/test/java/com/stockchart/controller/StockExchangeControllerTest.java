package com.stockchart.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.stockchart.service.StockExchangeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringRestApiTestApplication.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@WebMvcTest(StockExchangeController.class)
class StockExchangeControllerTest {
	
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private StockExchangeService stockExchangeService;
	
	@Test
	void addNewStockExchange() {
		
	}
	
	@Test
	void addExistingStockExchange() {
		
	}
	
	@Test
	void getAllStockExchange() throws Exception{
		when(stockExchangeService.retrieveAllItems())
		.thenReturn(Arrays.asList(new Item(2, "Item2", 10, 10), new Item(3, "Item3", 20, 20)));
		
		RequestBuilder request = MockMvcRequestBuilders.get("/stockExchange/all").accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(request).andExpect(status().isOk())
		.andExpect(content().json("[{\"stockExchangeId\":1,\"stockExchangeName\":\"BSE\",\"stockExchangeBrief\":\"Bombay Stock Exchange\",\"stockExchangeAddress\":\"Dalal Street, Mumbai\",\"remarks\":\"Established in 1875\"},{\"stockExchangeId\":2,\"stockExchangeName\":\"NSE\",\"stockExchangeBrief\":\"National Stock Exchange of India\",\"stockExchangeAddress\":\" Mumbai, India\",\"remarks\":\"Established in 1992\"}]")).andReturn();
	}
	
//	@Test
//	void getExistingStockExchange() {
//		
//		RequestBuilder request = MockMvcRequestBuilders.get("/stockExchange/" + 1).accept(MediaType.APPLICATION_JSON);
//		
//		MvcResult result = mockMvc.perform(request)
//				.andExpect(status().isOk())
//				.andExpect(content().json("{\"id\": 1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}")).andReturn();
//	}
	
	@Test
	void getNonExistingStockExchange() {
		
	}
	
	@Test
	void updateExistingStockExchange() {
		
	}
	
	@Test
	void updateNonExistingStockExchange() {
		
	}
	
	@Test
	void deleteExistingStockExchange() {
		
	}
	
	@Test
	void deleteNonExistingStockExchange() {
		
	}
}
