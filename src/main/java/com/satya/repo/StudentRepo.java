package com.satya.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.satya.bean.Student;

@Repository
public interface StudentRepo extends  JpaRepository<Student, Integer> {

}
