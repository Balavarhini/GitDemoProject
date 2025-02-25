package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {

	@Id
	private String adminid;
	private String name;
	private String department;
	private String password;
	private String usertype;
	public String getAdminid() {
		return adminid;
	}
	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	@Override
	public String toString() {
		return "Admin [adminid=" + adminid + ", name=" + name + ", department=" + department + ", password=" + password
				+ ", usertype=" + usertype + "]";
	}
	public Admin(String adminid, String name, String department, String password, String usertype) {
		super();
		this.adminid = adminid;
		this.name = name;
		this.department = department;
		this.password = password;
		this.usertype = usertype;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
