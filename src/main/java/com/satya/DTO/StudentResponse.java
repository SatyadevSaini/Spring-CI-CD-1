package com.satya.DTO;

public class StudentResponse {
	
	private int id;
	private String name;
	private String department;
	private String rollno;
	public StudentResponse(int id, String name, String department, String rollno) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.rollno = rollno;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public String getRollno() {
		return rollno;
	}

}
