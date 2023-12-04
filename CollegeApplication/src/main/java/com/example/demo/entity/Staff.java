package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Staff {
	@Id
	private Integer id;

	@Column(name = "sname")
	private String name;


	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name +  "]";
	}

}
