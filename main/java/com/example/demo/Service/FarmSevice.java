package com.example.demo.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Admin;
import com.example.demo.Entity.Bill;
import com.example.demo.Entity.Consumer;
import com.example.demo.Entity.Stock;
import com.example.demo.Entity.Supplier;
import com.example.demo.Entity.Supply;
import com.example.demo.Entity.Transport;
import com.example.demo.Entity.Worker;
import com.example.demo.Repository.AdminRepo;
import com.example.demo.Repository.ConsumerRepo;
import com.example.demo.Repository.OrderRepo;
import com.example.demo.Repository.StockRepo;
import com.example.demo.Repository.SupplierRepo;
import com.example.demo.Repository.SupplyRepo;
import com.example.demo.Repository.TransportRepo;
import com.example.demo.Repository.WorkerRepo;



@Service
public class FarmSevice {
	@Autowired
	ConsumerRepo cr;
    @Autowired
    SupplierRepo sr;
    @Autowired
    AdminRepo ar;
    @Autowired
    WorkerRepo wr;
    
	public boolean cuslogin(String consumerid, String password) {
		boolean b=false;
		try{
			Consumer c1=cr.getById(consumerid);
			if(consumerid.equals(c1.getConsumerid()) && password.equals(c1.getPassword())){
				b=true;//equals check the value
			}
			else {
				b=false;
			}
		
		return b;
		
	}
		catch(Exception e) {
			b=false;
		}
           return b;
}

	public boolean supplogin(String supplierid, String password) {
		 boolean b=false;
		 try {
			 Supplier s1=sr.getById(supplierid);
			 if(supplierid.equals(s1.getSupplierid())&& password.equals(s1.getPassword())) {
				 b=true;
			 }
			 else {
				 b=false;
			 }
			 return b;
		 }
		 catch(Exception e) {
			 b=false;
		 }
		
		return b;
	}

	public boolean adminlog(String adminid, String password) {
		boolean b=false;
		 try {
			 Admin a1=ar.getById(adminid);
			 if(adminid.equals(a1.getAdminid())&& password.equals(a1.getPassword())) {
				 b=true;
			 }
			 else {
				 b=false;
			 }
			 return b;
		 }
		 catch(Exception e) {
			 b=false;
		 }
		
		return b;
	}

	public boolean worklog(String workerid, String password) {
		boolean b=false;
		 try {
			 Worker w1=wr.getById(workerid);
			 if(workerid.equals(w1.getIdnumber())&& password.equals(w1.getPassword())) {
				 b=true;
			 }
			 else {
				 b=false;
			 }
			 return b;
		 }
		 catch(Exception e) {
			 b=false;
		 }
		
		return b;
	}

	public List<Consumer> consum() {
		return cr.findAll();
	}

	public List<Supplier> suplist() {
		return sr.findAll();
	}
    @Autowired 
    TransportRepo tr;
	public List<Transport> translist() {
		// TODO Auto-generated method stub
		return tr.findAll();
	}
    
	@Autowired 
	OrderRepo br;
	public List<Bill> billlist() {
		return br.findAll();
	}

	@Autowired
	SupplyRepo sr2;
	public List<Supply> supplylist() {
		// TODO Auto-generated method stub
		return sr2.findAll();
	}

	@Autowired
	StockRepo st;
	public List<Stock> stoklist() {
		// TODO Auto-generated method stub
		return st.findAll();
	}

	public Consumer getById(String consumerid) {
		return cr.getById(consumerid);
	}


	public boolean deleteConsumer(String consumerid) {
		boolean b=false;
		try {
			cr.deleteById(consumerid);
		}
		catch(Exception e) {
			b=true;
		}
		return b;
	}
	
	public Supplier getById1(String supplierid) {
		return sr.getById(supplierid);
	}

	public boolean deleteSupplier(String supplierid) {
		boolean b=false;
		try {
			sr.deleteById(supplierid);
		}
		catch(Exception e) {
			b=true;
		}
		return b;
	}
		
	}
