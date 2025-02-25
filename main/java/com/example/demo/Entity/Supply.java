package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Supply {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)

	private Integer sno;
	private String partyname;
	private String supplierid;
	private String type;
	private String quantity;
	private String supplyid;
	private String date;
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getPartyname() {
		return partyname;
	}
	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}
	public String getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(String supplierid) {
		this.supplierid = supplierid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getSupplyid() {
		return supplyid;
	}
	public void setSupplyid(String supplyid) {
		this.supplyid = supplyid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Supply [sno=" + sno + ", partyname=" + partyname + ", supplierid=" + supplierid + ", type=" + type
				+ ", quantity=" + quantity + ", supplyid=" + supplyid + ", date=" + date + "]";
	}
	public Supply(Integer sno, String partyname, String supplierid, String type, String quantity, String supplyid,
			String date) {
		super();
		this.sno = sno;
		this.partyname = partyname;
		this.supplierid = supplierid;
		this.type = type;
		this.quantity = quantity;
		this.supplyid = supplyid;
		this.date = date;
	}
	public Supply() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
