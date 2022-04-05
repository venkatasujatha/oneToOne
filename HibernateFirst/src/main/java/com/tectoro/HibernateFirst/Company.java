package com.tectoro.HibernateFirst;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.criteria.Fetch;

@Entity
public class Company 
{	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Emp_id_details")
	
	private Employee Empid;
	
	public Company(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Company(Employee empid) {
		super();
		Empid = empid;
	}
	public Employee getEmpid() {
		return Empid;
	}
	public void setEmpid(Employee empid) {
		Empid = empid;
	}
		
}
