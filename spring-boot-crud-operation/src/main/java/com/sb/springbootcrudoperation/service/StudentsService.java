package com.sb.springbootcrudoperation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.springbootcrudoperation.model.Students;
import com.sb.springbootcrudoperation.repository.StudentsRepository;

@Service
public class StudentsService {

	@Autowired
	StudentsRepository br;
	
	public List<Students> getAllStudents()   
	{  
	List<Students> students = new ArrayList<Students>();  
	br.findAll().forEach(Students1 -> students.add(Students1));  
	return students;  
	}  
	
	public Students getStudentsById(int id)   
	{  
	return br.findById(id).get();  
	}  
	
	public void saveOrUpdate(Students students)   
	{  
	br.save(students);  
	}  
	
	public void delete(int id)   
	{  
	br.deleteById(id);  
	}  

	public void update(Students students, int id)   
	{  
	br.save(students);  
	}  
}
