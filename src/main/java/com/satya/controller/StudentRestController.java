package com.satya.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.satya.bean.Student;
import com.satya.service.StudentService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/")
public class StudentRestController {
	
	
	@Autowired
	StudentService service;
	
	@PostMapping("post")
	public ResponseEntity<Student>  post(@RequestBody Student student){
	return	new ResponseEntity<Student> (service.create(student) , HttpStatus.CREATED );
	}
	
	@GetMapping("get")
	public ResponseEntity<List<Student>> getMethodName() {
		return ResponseEntity.ok(service.get());
	}
	
	@PutMapping("update/{id}")
	public ResponseEntity<Student> update(@RequestBody Student student , @PathVariable("id") int id){
		return ResponseEntity.ok(service.update(student, id));
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") int id){
		service.delete(id);
		return ResponseEntity.ok().build();
	}
	
	
  
	
}
