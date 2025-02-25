package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Supplier {
	@Id
	private String supplierid;
	private String name;
	private String cardnumber;
	private String address;
	private String expirydate;
	private String password;
	private String usertype;
	
	public String getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(String supplierid) {
		this.supplierid = supplierid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
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
		return "Supplier [supplierid=" + supplierid + ", name=" + name + ", cardnumber=" + cardnumber
				+ ", address=" + address + ", expirydate=" + expirydate + ", password=" + password + ", usertype="
				+ usertype + "]";
	}
	public Supplier(String supplierid, String name, String cardnumber, String address, String expirydate,
			String password, String usertype) {
		super();
		
		this.supplierid = supplierid;
		this.name = name;
		this.cardnumber = cardnumber;
		this.address = address;
		this.expirydate = expirydate;
		this.password = password;
		this.usertype = usertype;
	}
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
