package com.example.demo.dto;

import com.example.demo.entity.Department;

public class AssignRequest {
	private Department department;

	public AssignRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AssignRequest(Department department) {
		super();
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "AssignRequest [department=" + department + "]";
	}
	
	
}
