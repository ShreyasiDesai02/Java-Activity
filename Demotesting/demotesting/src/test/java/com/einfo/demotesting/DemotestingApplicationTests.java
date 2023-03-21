package com.einfo.demotesting;

import static org.hamcrest.CoreMatchers.containsString;
//import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class DemotestingApplicationTests {
	
	@Autowired 
	MockMvc mm;
	
	@Test
	void testController() throws Exception {
		mm.perform(get("/home")).andExpect(status().isOk());
	}
	
	@Test
	void negativeController() throws Exception {
		mm.perform(get("/index1")).andExpect(status().isNotFound());
	}
	
	@Test
	void Checkvalue() throws Exception {
		mm.perform(get("/index")).andExpect(content().string(containsString("hi")));
	}

}
