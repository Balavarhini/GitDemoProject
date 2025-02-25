package com.example.demo.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Worker {
 @Id
 private String idnumber;
 private String name;
 private String designation;
 private String department;
 private String dob;
 private String mobile;
 private String password;
public String getIdnumber() {
	return idnumber;
}
public void setIdnumber(String idnumber) {
	this.idnumber = idnumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Worker [idnumber=" + idnumber + ", name=" + name + ", designation=" + designation + ", department="
			+ department + ", dob=" + dob + ", mobile=" + mobile + ", password=" + password + "]";
}
public Worker(String idnumber, String name, String designation, String department, String dob, String mobile,
		String password) {
	super();
	this.idnumber = idnumber;
	this.name = name;
	this.designation = designation;
	this.department = department;
	this.dob = dob;
	this.mobile = mobile;
	this.password = password;
}
public Worker() {
	super();
	// TODO Auto-generated constructor stub
}

}
