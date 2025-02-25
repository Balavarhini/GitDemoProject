package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bill {

	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer sno;
	private String consumerid;
	private String products;
	private String price;
	private String orderid;
	private String location;
	private String date;
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getConsumerid() {
		return consumerid;
	}
	public void setConsumerid(String consumerid) {
		this.consumerid = consumerid;
	}
	public String getProducts() {
		return products;
	}
	public void setProducts(String products) {
		this.products = products;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Bill [sno=" + sno + ", consumerid=" + consumerid + ", products=" + products + ", price=" + price
				+ ", orderid=" + orderid + ", location=" + location + ", date=" + date + "]";
	}
	public Bill(Integer sno, String consumerid, String products, String price, String orderid, String location,
			String date) {
		super();
		this.sno = sno;
		this.consumerid = consumerid;
		this.products = products;
		this.price = price;
		this.orderid = orderid;
		this.location = location;
		this.date = date;
	}
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
