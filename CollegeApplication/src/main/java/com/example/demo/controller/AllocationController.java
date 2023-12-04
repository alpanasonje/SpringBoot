package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AssignRequest;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.repository.StaffRepository;

@RestController
public class AllocationController {
	@Autowired
	private DepartmentRepository departmentRepo;
	@Autowired
	private StaffRepository staffRepo;

	@PostMapping("/assignstaff")
	public Department Assign(@RequestBody AssignRequest request) {
		return departmentRepo.save(request.getDepartment());
	}
	
	@GetMapping("/findAllDepartments")
	public List<Department> findAllDepartments()
	{
		return departmentRepo.findAll();
	}
	
	
}
