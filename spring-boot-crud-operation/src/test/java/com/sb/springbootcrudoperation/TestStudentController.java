package com.sb.springbootcrudoperation;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.internal.util.privilegedactions.GetDeclaredFields;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sb.springbootcrudoperation.controller.StudentController;
import com.sb.springbootcrudoperation.model.Students;
import com.sb.springbootcrudoperation.repository.StudentsRepository;

@WebMvcTest(StudentController.class)
public class TestStudentController {

	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private ObjectMapper om;
	
	@MockBean
	private StudentsRepository repo;
	
	public void getAllStudentsTest() throws Exception {
		List<Students> ls= new ArrayList<>();
		ls.add(new Students(10, "Joseph", "Sixth", "70"));
		ls.add(new Students(20, "Joshua", "Seventh", "80"));
		
		Mockito.when(repo.findAll()).thenReturn(ls);
		
		String url = "/student";
		
		//mockMvc.perform(get(url)).andExpect(status().isOk());
		
		//MvcResult mr= mockMvc.perform(get(urlTemplate:"/student")).andExpect(content().string(expectedContent: "");
				//).isOk()).andReturn();
	}

	/*private RequestBuilder get(String url) {
		// TODO Auto-generated method stub
		return null;
	}*/
}
