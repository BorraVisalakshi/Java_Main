package com.aep.itmp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

	@Autowired
	EmployeeRepo repo;

	@RequestMapping("/")
	public String details() {

		return "LoginPage";

	}

	@RequestMapping("/details")
	public String details(Employee employee) {

		repo.save(employee);
		return "LoginPage";

	}

	@RequestMapping("/getdetails")
	public String getdetails() {

		return "View";

	}

	@PostMapping("/getdetails")
	public ModelAndView viewDetails(@RequestParam int SID)

	{
		ModelAndView mv = new ModelAndView("retrieve");
		Employee employee = repo.findById(SID).orElse(null);
		mv.addObject(employee);
		return mv;

	}

}
