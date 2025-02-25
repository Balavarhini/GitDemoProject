package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stock {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)

	private Integer sno;
	private String productid;
	private String name;
	private String price;
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Stock [sno=" + sno + ", productid=" + productid + ", name=" + name + ", price=" + price + "]";
	}
	public Stock(Integer sno, String productid, String name, String price) {
		super();
		this.sno = sno;
		this.productid = productid;
		this.name = name;
		this.price = price;
	}
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
