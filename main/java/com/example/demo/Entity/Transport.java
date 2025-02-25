package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transport {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)

	private Integer sno;
	private String vehiclenumber;
	private String ownername;
	private String contact;
	private String delivery;
	private String date;
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getVehiclenumber() {
		return vehiclenumber;
	}
	public void setVehiclenumber(String vehiclenumber) {
		this.vehiclenumber = vehiclenumber;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Transport [sno=" + sno + ", vehiclenumber=" + vehiclenumber + ", ownername=" + ownername + ", contact="
				+ contact + ", delivery=" + delivery + ", date=" + date + "]";
	}
	public Transport(Integer sno, String vehiclenumber, String ownername, String contact, String delivery,
			String date) {
		super();
		this.sno = sno;
		this.vehiclenumber = vehiclenumber;
		this.ownername = ownername;
		this.contact = contact;
		this.delivery = delivery;
		this.date = date;
	}
	public Transport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
