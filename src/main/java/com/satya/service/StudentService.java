package com.satya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satya.bean.Student;
import com.satya.exception.ResourceNotFoundException;
import com.satya.repo.StudentRepo;

import jakarta.transaction.Transactional;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo repo;
	
	public Student create(Student student) {
	return	repo.save(student);
		
	}
	public List<Student> get(){
		return repo.findAll();
	}
	
	@Transactional
	public Student update(Student student , int id) {
		//find by id then update student 
		Student student2  = repo.findById(id)
				.orElseThrow( () -> new ResourceNotFoundException("Resouce Not Found")) ;
		          student2.setDepartment(student.getDepartment());
		          student2.setName(student.getName());
		          student2.setRollno(student2.getRollno());
       
		          return student2;
	}
	
	public void delete(int id) {
		Student student = repo.findById(id).
				orElseThrow(() -> new ResourceNotFoundException("Resouce Not Found"));
		       repo.delete(student);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
