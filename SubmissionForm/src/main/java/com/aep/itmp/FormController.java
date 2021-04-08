package com.aep.itmp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FormController {
	@Autowired
	CustomerRepo repo;
	
	@RequestMapping("/")
	public String details() {
		
		return "edureka";
		
	}
	@RequestMapping("/details")
	public String details(Customers customers) {
		
		repo.save(customers);
		return "edureka";
		
	}
	@RequestMapping("/getdetails")
	public String getdetails() {
		
		return "ViewCustomers";
		
	}

	@PostMapping("/getdetails")
	public ModelAndView viewDetails(@RequestParam int cid) 
	
	{
		ModelAndView mv = new ModelAndView("retrieve");
		Customers customers = repo.findById(cid).orElse(null);
		mv.addObject(customers);
		return mv;
		
	}
	@RequestMapping("/customers")
	@ResponseBody
	public List<Customers> getCustomers() {
		
		return repo.findAll();
		
	}
	@RequestMapping("/customers/{cid}")
	@ResponseBody
	public Optional<Customers> getCustomers1(@PathVariable("cid") int cid) {
		
		return repo.findById(cid);
		
	}
	@DeleteMapping("/customers/{cid}")
	public Customers getCustomers2(@PathVariable("cid") int cid) {
		Customers cust = repo.getOne(cid);
		repo.delete(cust);
		return cust;
		
	}
	
}
