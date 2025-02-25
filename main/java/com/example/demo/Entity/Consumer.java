package com.example.demo.Entity;



import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
@Component
public class Consumer { 
	@Id
    private String consumerid;
	private String name;
	private String cardnumber;
	private String address;
	private String expirydate;
	private String password;
	private String usertype;
	
	
	public String getConsumerid() {
		return consumerid;
	}
	public void setConsumerid(String consumerid) {
		this.consumerid = consumerid;
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
		return "Consumer [consumerid=" + consumerid + ", name=" + name + ", cardnumber=" + cardnumber
				+ ", address=" + address + ", expirydate=" + expirydate + ", password=" + password + ", usertype="
				+ usertype + "]";
	}
	public Consumer(String consumerid, String name, String cardnumber, String address,
			String expirydate, String password, String usertype) {
		super();
		
		this.consumerid = consumerid;
		this.name = name;
		this.cardnumber = cardnumber;
		this.address = address;
		this.expirydate = expirydate;
		this.password = password;
		this.usertype = usertype;
	}
	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
