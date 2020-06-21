package com.subrutin.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.subrutin.springmvc.domain.Employee;


@Controller
public class EmployeeController {

	private List<Employee> employee = new ArrayList<Employee>();

	public EmployeeController() {
		employee.add(new Employee("1","Tedy Tri Saputro","Indonesia"));
		employee.add(new Employee("2","Elon Musk","USA"));
		employee.add(new Employee("3","Larry Page","USA"));
	}
	
	@RequestMapping("employee")
	public ModelAndView list(Model model) {
		ModelAndView mav = new ModelAndView("list");
		model.addAttribute(employee);
		return mav;
	}
	
}
