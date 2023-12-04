package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "id")
	private Integer id;
	@Column(name = "deptName")
	private String deptName;

	@OneToMany(targetEntity =Staff.class , cascade = CascadeType.ALL)
	@JoinColumn(name="staff_dept",referencedColumnName = "id")
	private List<Staff> staffs;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(Integer id, String deptName, List<Staff> staffs) {
		super();
		this.id = id;
		this.deptName = deptName;
		this.staffs = staffs;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Staff> getStaffs() {
		return staffs;
	}

	public void setStaffs(List<Staff> staffs) {
		this.staffs = staffs;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", deptName=" + deptName + ", staffs=" + staffs + "]";
	}

}
