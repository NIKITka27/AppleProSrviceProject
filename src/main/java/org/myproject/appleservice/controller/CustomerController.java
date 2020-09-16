package org.myproject.appleservice.controller;

import org.myproject.appleservice.Repository.CustomerRepository;
import org.myproject.appleservice.model.Customer;
import org.myproject.appleservice.model.Role;
import org.myproject.appleservice.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;
import java.util.Collections;

@Controller
@RequestMapping("/")
@SessionAttributes("customer")
@Transactional
public class CustomerController {

	@Autowired
	CustomerRepository customerRepository ;

	@PostMapping("/login")
	public String loginCustomer(@Valid Customer customer){

		return "home";
	}


	@RequestMapping(value = { "/newuser" }, method = RequestMethod.GET)
	public String newCustomer(ModelMap model) {
		Customer customer =  new Customer();
		model.addAttribute("customer", customer);
		return "reg";
	}

	@RequestMapping(value = { "/newuser" }, method = RequestMethod.POST)
	public String saveUser(@Valid Customer customer, BindingResult result, ModelMap model) {

		Customer customerFromDb = customerRepository.findByEmail(customer.getEmail());
		if (customerFromDb != null) {
			return "reg";
		}

		customer.isActive(true);
		customer.setRoles(Collections.singleton(Role.USER));

		customerRepository.save(customer);

		model.addAttribute("success",
				"Customer " + customer.getFirstName() + " " + customer.getLastName() + " registered successfully");

		// return "success";
		return "registrationsuccess";
	}
}