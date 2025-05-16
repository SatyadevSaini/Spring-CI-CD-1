package com.satya.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class StudentRequest {
	
	@NotBlank
	@Size(min = 3 , max = 50)
	private String name;
	@NotBlank
	@Size(min = 3 , max = 100)
	private String department;
	@NotBlank
	@Size(min =1)
	private int rollno;

}
