package com.sb.springbootcrudoperation;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.sb.springbootcrudoperation.model.Students;
import com.sb.springbootcrudoperation.repository.StudentsRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class TestStudent {

	/*@Autowired
	private StudentsRepository repo;
	
	@Test
	public void testsaveStudent() {
		Students s=new Students(10, "Tim", "Fifth", "50");
		Students savedstudent=  repo.save(s);
		
		assertNotNull(s);           //not working
	}*/
}
