package com.sb.springbootcrudoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sb.springbootcrudoperation.model.Students;
import com.sb.springbootcrudoperation.service.StudentsService;

@RestController
public class StudentController {
	
	@Autowired
	StudentsService ss;
	
	@PostMapping("/studs")  
	private int saveStudent(@RequestBody Students students)   
	{  
		System.out.println("inside save student method");
	ss.saveOrUpdate(students);  
	return students.getId();  
	}
	
	@GetMapping("/student")
	private List<Students> getAllStudents()
	{
		System.out.println("inside get all student method");
		return ss.getAllStudents();
	}
	
	@GetMapping("/student/{id}")
	private Students getStudents(@PathVariable("id") int id)
	{
		System.out.println("inside get student byt Id method");
		return ss.getStudentsById(id);
	}
	
	@DeleteMapping("/student/{id}")
		private void deleteStudents(@PathVariable("id") int id)   
		{  
		System.out.println("inside get delete method");
		ss.delete(id);  
	} 

	@PutMapping("/students")  
	private Students update(@RequestBody Students students)   
	{  
		System.out.println("inside upadte student method");
	ss.saveOrUpdate(students);  
	return students;  
	}
}
