package com.einfo.demotesting;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.einfo.demotesting.Model.Memeber;
import com.einfo.demotesting.Repo.MemberRepository;

@WebMvcTest
@ExtendWith(MockitoExtension.class)
public class DemoTest {
	
	@Autowired
	MockMvc mm;
	
	@MockBean //mocking the bean object of existing thing
	MemberRepository mr;//given
	
	@Test
	public void testhome() throws Exception {
		mm.perform(get("/home")).andExpect(status().isOk());
	}
	
	@Test
	public void testRepoClass() throws Exception{
		//given
		//when
		//then phases
		when(mr.getmemberByEmail("shreyasi@12.com")).thenReturn(new Memeber("Shreyasi@12.com","Shreyasi", "34567","f")); // when id is same return the input given here
	}
	

}
 