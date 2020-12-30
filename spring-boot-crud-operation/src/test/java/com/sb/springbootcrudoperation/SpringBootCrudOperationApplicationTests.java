package com.sb.springbootcrudoperation;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.sb.springbootcrudoperation.model.Students;
import com.sb.springbootcrudoperation.repository.StudentsRepository;
import com.sb.springbootcrudoperation.service.StudentsService;

//@RunWith(SpringRunner.classs)
@SpringBootTest
class SpringBootCrudOperationApplicationTests {

	//@Test
	void contextLoads() { 
	}
	@Autowired
	private StudentsService ss;
	
	@MockBean
	private StudentsRepository sr;

	public void getStudentsTest() {
		//when(sr.findAll()).thanReturn(ss.of(new Students(10, "Joseph", "Sixth", "70")))
	}
}
