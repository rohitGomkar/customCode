package com.CustomCode_10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CustomCode_10.dto.CustomerData;
import com.CustomCode_10.entities.Customer;
import com.CustomCode_10.services.CustomerService;
import com.CustomCode_10.util.EmailService;

@Controller
public class CustomerController {

	@Autowired
	private EmailService emailService;

	@Autowired
	CustomerService customerService;

	@RequestMapping("/saveCustomer")
	public String saveCustomerPage() {
		return "saveCustomer";
	}

	@RequestMapping("/saveCustomerData")
	public String saveCustomerData(@ModelAttribute("customer") Customer customer, ModelMap modelMap) {
		customerService.saveCustomer(customer);
		modelMap.addAttribute("msg", "Record saved Successfuly");
		emailService.sendEmail("sameergomkar2001@gmail.com", "Welcome", "Record Saved");
		return "saveCustomer";
	}

	@RequestMapping("/getCustomerData")
	public String getAllCustomer(ModelMap modelMap) {
		List<Customer> customer = customerService.getCustomer();
		modelMap.addAttribute("customer", customer);
		return "showCustomer";

	}

	@RequestMapping("/delete")
	public String deleteById(@RequestParam("id") Long id, ModelMap modelMap) {
		customerService.deleteById(id);
		List<Customer> customer = customerService.getCustomer();
		modelMap.addAttribute("customer", customer);
		return "showCustomer";
	}

	@RequestMapping("/update")
	public String updateCustomerById(@RequestParam("id") long id, ModelMap modelMap) {
		Customer customer = customerService.updateCustomer(id);
		modelMap.addAttribute("customer", customer);
		return "updateCustomer";
	}

	@RequestMapping("/updateCustomerData")
	public String updateCustomerData(CustomerData customerData, ModelMap modelMap) {
		Customer customer = new Customer();
		customer.setId(customerData.getId());
		customer.setFirstname(customerData.getFirstname());
		customer.setLastname(customerData.getLastname());
		customer.setCity(customerData.getCity());
		customer.setMobile(customerData.getMobile());
		customer.setEmail(customerData.getEmail());
		customer.setLeadsource(customerData.getLeadsource());

		customerService.saveCustomer(customer);
		List<Customer> customerData1 = customerService.getCustomer();
		modelMap.addAttribute("customer", customerData1);
		return "showCustomer";
	}

	@RequestMapping("/customerInfo")
	public String customerInfo(@RequestParam("id") long id, ModelMap modelMap) {
		Customer customer = customerService.getCustomerInfo(id);
		modelMap.addAttribute("customer", customer);
		return "customerInfo";

	}

}
