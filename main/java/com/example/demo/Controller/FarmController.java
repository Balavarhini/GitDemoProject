package com.example.demo.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Entity.Admin;
import com.example.demo.Entity.Consumer;
import com.example.demo.Entity.Bill;
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
import com.example.demo.Service.FarmSevice;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class FarmController {
	@Autowired 
	ConsumerRepo cr;
	@Autowired
	FarmSevice fs;
	@Autowired
	SupplierRepo sr;
	@Autowired 
	AdminRepo ar;
	@Autowired
	WorkerRepo wr;
	
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("home");
	}
	
//	@RequestMapping("/")
//	public ModelAndView index() {
//	return new ModelAndView("index");
//	}	
	
	@RequestMapping("/index")
	public ModelAndView index1() {
	return new ModelAndView("index");
	}
	
	@RequestMapping("/consumerregister")
	public ModelAndView cusreg() {
		return new ModelAndView("consumerregister");
	}
	
	@RequestMapping(value="consumerreg",method=RequestMethod.POST)
	public ModelAndView conreg(HttpServletRequest req) {
		ModelAndView mv=new ModelAndView();
	    String consumerid=req.getParameter("consumerid");
		String password=req.getParameter("password");
		String name=req.getParameter("name");
		String cardnumber=req.getParameter("cardnumber");
		String address=req.getParameter("address");
		String expirydate=req.getParameter("expirydate");
		
		if(cr.existsById(consumerid)) {
			mv.setViewName("consumerregister");
			mv.addObject("errorMessage","this user already exists...");
			return mv;
		}
		try {
		Consumer c1=new Consumer(consumerid,name,cardnumber,address,expirydate,password,"Consumer");
		cr.save(c1);
		mv.setViewName("orderproducts");
		mv.addObject("successMessage","Consumer Register Successfully");
		mv.addObject("consumerid",consumerid);

		}
		catch(Exception e) {
		    mv=new ModelAndView("error");
		    mv.addObject("errorMessage","There was an error"+e.getMessage());
		}
		return mv;
	}
	
	@RequestMapping("/consumerlogin")
	public ModelAndView conslog() {
		return new ModelAndView("consumerlogin");
	}
	
	@RequestMapping("consumerloginn")
	public ModelAndView conlog(HttpServletRequest req, @RequestParam String consumerid,@RequestParam String password) {
		ModelAndView mv=new ModelAndView("consumerloginn");
		boolean a=fs.cuslogin(consumerid,password);
		if(a) {
			mv=new ModelAndView("orderproducts");
			mv.addObject("consumerid",consumerid);
		}
		else {
			mv=new ModelAndView("consumerlogin");
			mv.addObject("error", "Invalid credentials. Please try again.");
		}
		return mv;
	}
       
	@RequestMapping("/supplierregister")
	public ModelAndView supreg() {
		return new ModelAndView("supplierregister");
	}
	
	@RequestMapping(value="supreg",method=RequestMethod.POST)
	public ModelAndView suppreg(HttpServletRequest req) {
		ModelAndView mv=new ModelAndView();
	    String supplierid=req.getParameter("supplierid");
		String password=req.getParameter("password");
		String name=req.getParameter("name");
		String cardnumber=req.getParameter("cardnumber");
		String address=req.getParameter("address");
		String expirydate=req.getParameter("expirydate");
		
		if(sr.existsById(supplierid)) {
			mv.setViewName("supplierregister");
			mv.addObject("errorMessage","this user already exists...");
			return mv;
		}
		try {
		Supplier s1=new Supplier(supplierid,name,cardnumber,address,expirydate,password,"Supplier");
		sr.save(s1);
		mv.setViewName("supplyproduct");
		mv.addObject("successMessage","Supplier Register Successfully");
		mv.addObject("supplierid",supplierid);

		}
		catch(Exception e) {
		    mv=new ModelAndView("error");
		    mv.addObject("errorMessage","There was an error"+e.getMessage());
		}
		return mv;
	}
	
	@RequestMapping("/supplierlogin")
	public ModelAndView suppllog() {
	return new ModelAndView("supplierlogin");
	}
	
	@RequestMapping("supplierloginn")
	public ModelAndView suplog(HttpServletRequest req, @RequestParam String supplierid,@RequestParam String password) {
		ModelAndView mv=new ModelAndView("supplierloginn");
		boolean a=fs.supplogin(supplierid,password);
		if(a) {
			mv=new ModelAndView("supplyproduct");
			mv.addObject("supplierid",supplierid);

		}
		else {
			mv=new ModelAndView("supplierlogin");
			mv.addObject("error", "Invalid credentials. Please try again.");

		}
		return mv;
	}

	@RequestMapping("/adminregister")
	public ModelAndView adreg() {
		return new ModelAndView("adminregister");
	}
	
	@RequestMapping(value="adminregistry",method=RequestMethod.POST)
    public ModelAndView  addreg(HttpServletRequest req) {
		ModelAndView mv=new ModelAndView();
		String adminid=req.getParameter("adminid");
		String password=req.getParameter("password");
	    String name=req.getParameter("name");
	    String department=req.getParameter("department");
	    if(ar.existsById(adminid)) {
			mv.setViewName("adminregister");
			mv.addObject("errorMessage","this user already exists...");
			return mv;
		}
	    try {
	    Admin a1= new Admin(adminid,name,department,password,"Admin");
	    ar.save(a1);
	    mv.setViewName("adminone");
		mv.addObject("successMessage","Admin Register Successfully");
		}
		catch(Exception e) {
	
			mv=new ModelAndView("error");
		    mv.addObject("errorMessage","There was an error"+e.getMessage());
		}
		return mv;
	}
	@RequestMapping("/adminlogin")
	public ModelAndView adllog() {
	return new ModelAndView("adminlogin");
	}
	
	@RequestMapping("adminloginn")
	public ModelAndView adlog(HttpServletRequest req, @RequestParam String adminid,@RequestParam String password) {
		ModelAndView mv=new ModelAndView("adminloginn");
		boolean a=fs.adminlog(adminid,password);
		if(a) {
			mv=new ModelAndView("adminone");
		}
		else {
			mv=new ModelAndView("adminlogin");
		}
		return mv;
	}
	
	@RequestMapping("/workerregister")
	public ModelAndView workreg() {
		return new ModelAndView("workerregister");
	}
	
	@RequestMapping(value="workerregistry",method=RequestMethod.POST)
    public ModelAndView  addworker(HttpServletRequest req) {
		ModelAndView mv=new ModelAndView();
		String workerid=req.getParameter("workerid");
		String name=req.getParameter("name");
	    String designation=req.getParameter("designation");
	    String department=req.getParameter("department");
	    String dob=req.getParameter("dateofbirth");
	    String number=req.getParameter("number");
	    String password=req.getParameter("password");
	    if(wr.existsById(workerid)) {
			mv.setViewName("workerregister");
			mv.addObject("errorMessage","this user already exists...");
			return mv;
		}
	    try {
	    Worker w1= new Worker(workerid,name,designation,department,dob,number,password);
	    wr.save(w1);
	    mv.setViewName("success");
		mv.addObject("successMessage","Worker Register Successfully");
		}
		catch(Exception e) {
		    mv=new ModelAndView("error");
		    mv.addObject("errorMessage","There was an error"+e.getMessage());
		}
		return mv;
	}
	@RequestMapping("/workerlogin")
	public ModelAndView worklog() {
	return new ModelAndView("workerlogin");
	}
	
	@RequestMapping("workerloginn")
	public ModelAndView workllog(HttpServletRequest req, @RequestParam String workerid,@RequestParam String password) {
		ModelAndView mv=new ModelAndView("workerloginn");
		boolean a=fs.worklog(workerid,password);
		if(a) {
			mv=new ModelAndView("worker");
		}
		else {
			mv=new ModelAndView("workerlogin");
		}
		return mv;
	}
	@RequestMapping("admin")
	public ModelAndView admin() {
		return new ModelAndView("admin");
	}
	@RequestMapping("stockregister")
	public ModelAndView stk() {
	return new ModelAndView("stockregister");	
	}
	@Autowired 
	StockRepo str;
	@RequestMapping(value="stockregistry",method=RequestMethod.POST)
    public ModelAndView  addstock(HttpServletRequest req) {
		ModelAndView mv=null;
		String productid=req.getParameter("productid");
		String name=req.getParameter("name");
	    String price=req.getParameter("price");
	    
	    Stock s2= new Stock(0,productid,name,price);
	    str.save(s2);
		try {
			mv=new ModelAndView("success");
			return mv;
		}
		catch(Exception e) {
		    mv=new ModelAndView("error");
		}
		return mv;
	}
	
	@RequestMapping("/consumerlist")
    public ModelAndView conslist() {
		List<Consumer>li=fs.consum();
		ModelAndView mv=new ModelAndView("consumerlist");
		mv.addObject("consu",li);
		return mv;
	}
	@RequestMapping("/supplierlist")
    public ModelAndView supplist() {
		List<Supplier>li=fs.suplist();
		ModelAndView mv=new ModelAndView("supplierlist");
		mv.addObject("supply",li);
		return mv;
	}
	
	@RequestMapping("/transportregister")
	public ModelAndView transport() {
		return  new ModelAndView("transportregister");
	}
	
	@Autowired 
	TransportRepo tr;
	@RequestMapping(value="transportreg",method=RequestMethod.POST)
    public ModelAndView  addtrans(HttpServletRequest req) {
		ModelAndView mv=null;
		String Vehicle=req.getParameter("vnumber");
		String name=req.getParameter("name");
	    String number=req.getParameter("contact");
	    String delivery=req.getParameter("delivery");
	    String date=req.getParameter("date");
	    
	    Transport t1= new Transport(0,Vehicle,name,number,delivery,date);
	    tr.save(t1);
		try {
			List<Transport>li=fs.translist();
			ModelAndView mv1=new ModelAndView("translist");
			mv1.addObject("trans",li);
			return mv1;
		}
		catch(Exception e) {
		    mv=new ModelAndView("error");
		}
		return mv;
	}
	
	@RequestMapping("/translist")
    public ModelAndView translist() {
		List<Transport>li=fs.translist();
		ModelAndView mv=new ModelAndView("translist");
		mv.addObject("trans",li);
		return mv;
	}
	@RequestMapping("/orderproducts")
	public ModelAndView orderpro() {
		return new ModelAndView ("orderproducts");
	}
	@Autowired
	OrderRepo ord;
	@RequestMapping(value="orderpro",method=RequestMethod.POST)
	public ModelAndView orderprod(HttpServletRequest req) {
		ModelAndView mv=null;
		String consumerid=req.getParameter("consumerid");
		String products=req.getParameter("products");
		String price=req.getParameter("totalAmount");
		String orderid=req.getParameter("orderid");
		String location=req.getParameter("location");
		String date=req.getParameter("date");
		
		Bill o1=new Bill(0,consumerid,products,price,orderid,location,date);
		ord.save(o1);
			try {
				mv=new ModelAndView("success");
				return mv;
			}
			catch(Exception e) {
			    mv=new ModelAndView("error");
			}
			return mv;
	}
	@RequestMapping("/billist")
    public ModelAndView billlist() {
		List<Bill>li=fs.billlist();
		ModelAndView mv=new ModelAndView("billist");
		mv.addObject("bill",li);
		return mv;
	}
	
	@RequestMapping("/supplyproduct")
	public ModelAndView supplyPro() {
		return new ModelAndView("supplyproduct");
	}
	
	@Autowired
	SupplyRepo sr2;
	@RequestMapping(value="productsupply",method=RequestMethod.POST)
	public ModelAndView supplyprod(HttpServletRequest req) {
		ModelAndView mv=null;
		String partyname=req.getParameter("partyname");
		String Supplierid=req.getParameter("supplierid");
		String Type=req.getParameter("type");
		String Qty=req.getParameter("qty");
		String SupplyId=req.getParameter("supplyid");
		String date=req.getParameter("date");

		
		Supply s2=new Supply(0,partyname,Supplierid,Type,Qty,SupplyId,date);
		sr2.save(s2);
			try {
				mv=new ModelAndView("success");
				return mv;
			}
			catch(Exception e) {
			    mv=new ModelAndView("error");
			}
			return mv;
	}
	@RequestMapping("/supplylist")
    public ModelAndView supplylist() {
		List<Supply>li=fs.supplylist();
		ModelAndView mv=new ModelAndView("supplylist");
		mv.addObject("supply",li);
		return mv;
	}
	
	@RequestMapping("stocklist")
    public ModelAndView stocklist() {
		List<Stock>li=fs.stoklist();
		ModelAndView mv=new ModelAndView("stocklist");
		mv.addObject("sto",li);
		return mv;
	}
	
	@RequestMapping("/consumer")
	public ModelAndView consumer() {
		return new ModelAndView("consumer");
	}
	
	@RequestMapping("/supplier")
	public ModelAndView suppliers() {
		return new ModelAndView("supplier");
   }
	
	@RequestMapping("/worker")
	public ModelAndView work() {
		return new ModelAndView("worker");
	}
	@RequestMapping("/adminone")
	public ModelAndView adminone() {
		return new ModelAndView("adminone");
	
	}
	
	@RequestMapping("/updateConsumer")
	public ModelAndView upcard(HttpServletRequest req,@RequestParam String consumerid) {
		ModelAndView mv=new ModelAndView("updateConsumer");
		Consumer c1=fs.getById(consumerid);
		mv.addObject("consumer",c1);
		return mv;
	}
	
	@RequestMapping(value="updatecards",method=RequestMethod.POST)
	public ModelAndView updatecard(HttpServletRequest req) {
		ModelAndView mv=null;
		String consumerid=req.getParameter("consumerid");
		String password=req.getParameter("password");
		String name=req.getParameter("name");
		String cardnumber=req.getParameter("cardnumber");
		String address=req.getParameter("address");
		String expirydate=req.getParameter("expirydate");
		
		Consumer c1=new Consumer(consumerid,name,cardnumber,address,expirydate,password,"Consumer");
		try {
			cr.save(c1);
			List<Consumer>li=fs.consum();
			ModelAndView mv1=new ModelAndView("consumerlist");
			mv1.addObject("consu",li);
			return mv1;
			}
		 catch(Exception e) {
			 mv=new ModelAndView("error");
		 }
		return mv;
	}
	
	@RequestMapping(value="deleteConsumer",method=RequestMethod.GET)
    public ModelAndView deleteconsume(HttpServletRequest req) {
    	ModelAndView mv=null;
    	String consumerid=req.getParameter("consumerid");
    	try {
    		fs.deleteConsumer(consumerid);
    		List<Consumer>li=fs.consum();
			ModelAndView mv1=new ModelAndView("consumerlist");
			mv1.addObject("consu",li);
			return mv1;
			}
		 catch(Exception e) {
		 mv=new ModelAndView("error");
		 }
    	return mv;
	}
	
	@RequestMapping("/updateSupplier")
	public ModelAndView upcardsup(HttpServletRequest req,@RequestParam String supplierid) {
		ModelAndView mv=new ModelAndView("updateSupplier");
		Supplier s1=fs.getById1(supplierid);
		mv.addObject("supply",s1);
		return mv;
	}
	
	@RequestMapping(value="updatesuppliercard",method=RequestMethod.POST)
	public ModelAndView updatecards(HttpServletRequest req) {
		ModelAndView mv=null;
		String supplierid=req.getParameter("supplierid");
		String password=req.getParameter("password");
		String name=req.getParameter("name");
		String cardnumber=req.getParameter("cardnumber");
		String address=req.getParameter("address");
		String expirydate=req.getParameter("expirydate");
		
		Supplier s1=new Supplier(supplierid,name,cardnumber,address,expirydate,password,"Supplier");
		try {
			sr.save(s1);
			List<Supplier>li=fs.suplist();
			ModelAndView mv1=new ModelAndView("supplierlist");
			mv1.addObject("supply",li);
			return mv1;
			}
		 catch(Exception e) {
			 mv=new ModelAndView("error");
		 }
		return mv;
	}
	
	@RequestMapping(value="deleteSupplier",method=RequestMethod.GET)
    public ModelAndView deletesupplier(HttpServletRequest req) {
    	ModelAndView mv=null;
    	String supplierid=req.getParameter("supplierid");
    	try {
    		fs.deleteSupplier(supplierid);
    		List<Supplier>li=fs.suplist();
			ModelAndView mv1=new ModelAndView("supplierlist");
			mv1.addObject("supply",li);
			return mv1;
			}
		 catch(Exception e) {
		 mv=new ModelAndView("error");
		 }
    	return mv;
	}
	
	@RequestMapping(value="searchconsumer",method=RequestMethod.POST)
	public ModelAndView search(HttpServletRequest req) {
		ModelAndView mv=new ModelAndView();
		String name=req.getParameter("search");
		List<Bill>cons=ord.findByConsumerid(name);
		if(!cons.isEmpty()) {
			mv.addObject("con",cons);
			mv.setViewName("consumerhistory");
		}
		else {
			mv.addObject("errorMessage","No History found from " + name);
			mv.setViewName("orderproducts");
		}
		return mv;
	}
	
	@RequestMapping(value="searchsupplier",method=RequestMethod.POST)
	public ModelAndView search1(HttpServletRequest req) {
		ModelAndView mv=new ModelAndView();
		String name=req.getParameter("search");
		List<Supply>cons=sr2.findBySupplierid(name);
		if(!cons.isEmpty()) {
			mv.addObject("con",cons);
			mv.setViewName("supplierhistory");
		}
		else {
			mv.addObject("errorMessage","No History found from " + name);
			mv.setViewName("supplyproduct");
		}
		return mv;
	}
	
	@RequestMapping("about")
	public ModelAndView abt() {
		return new ModelAndView("about");
	}
	
	@RequestMapping("contact")
	public ModelAndView cont() {
		return new ModelAndView("contact");
	}
	@RequestMapping("privacy")
	public ModelAndView ser() {
		return new ModelAndView("privacy");
	}
	
	@RequestMapping("disclaimer")
	public ModelAndView dis() {
		return new ModelAndView("disclaimer");
	}
	
	@RequestMapping("service")
	public ModelAndView serv() {
		return new ModelAndView("service");
	}
	
	@RequestMapping("career")
	public ModelAndView car() {
		return new ModelAndView("career");
	}
}
