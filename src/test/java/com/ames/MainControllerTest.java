package com.ames;

import com.ames.controller.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
public class MainControllerTest {
	
	@InjectMocks
	private MainController mainController;
	
	private MockMvc mockMvc;
	
	@Before
	public void setUp()throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(mainController)
                .build();
	}
	
	@Test
	public void testHome() throws Exception {
		
        mockMvc.perform(get("/ames"))
        .andExpect(status().isOk())
        .andExpect(content().string("Hello, Welcome to AEMS home page!"));
        
	}
	
	@Test
	public void tyestGetToken() throws Exception {
		
        mockMvc.perform(get("/ames/tocken"))
        .andExpect(status().isOk())
        .andExpect(content().string("777"));
        
	}
	
	
}
