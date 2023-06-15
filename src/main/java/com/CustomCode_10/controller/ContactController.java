package com.CustomCode_10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CustomCode_10.dto.ContactData;
import com.CustomCode_10.dto.CustomerData;
import com.CustomCode_10.entities.Contact;
import com.CustomCode_10.entities.Customer;
import com.CustomCode_10.services.ContactService;
import com.CustomCode_10.services.CustomerService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/contact")
	public String saveContact(ContactData contactData,ModelMap modelMap) {
		Contact contact = new Contact();
		contact.setId(contactData.getId());
		contact.setFirstname(contactData.getFirstname());
		contact.setLastname(contactData.getLastname());
		contact.setCity(contactData.getCity());
		contact.setEmail(contactData.getEmail());
		contact.setMobile(contactData.getMobile());
		contact.setLeadsource(contactData.getLeadsource());
		
		contactService.saveContact(contact);
		customerService.deleteById(contactData.getId());
		modelMap.addAttribute("msg", "Customers are converted to sales are saved..");
		
		return "saveContact";	
	}
	
	@RequestMapping("/getContacts")
	public String getAllContacts(ModelMap modelMap) {
		List<Contact> contact = contactService.getAllContact();
		modelMap.addAttribute("contact", contact);
		return "getContacts";
	}
	
	@RequestMapping("/deleteContacts")
	public String deleteById(@RequestParam("id") Long id, ModelMap modelMap) {
		contactService.deleteById(id);
		List<Contact> contact = contactService.getAllContact();
		modelMap.addAttribute("contact", contact);
		return "getContacts";
		
}
	
	@RequestMapping("/updateContacts")
	public String updateContactById(@RequestParam("id") long id, ModelMap modelMap) {
		Contact contact = contactService.updateContact(id);
		modelMap.addAttribute("contact", contact);
		return "updateContacts";
	}
	@RequestMapping("/updateContactsData")
	public String updateContactsData(ContactData contactData, ModelMap modelMap) {
		Contact contact1 = new Contact();
		contact1.setId(contactData.getId());
		contact1.setFirstname(contactData.getFirstname());
		contact1.setLastname(contactData.getLastname());
		contact1.setCity(contactData.getCity());
		contact1.setMobile(contactData.getMobile());
		contact1.setEmail(contactData.getEmail());
		contact1.setLeadsource(contactData.getLeadsource());

		contactService.saveContact(contact1);
		List<Contact> contact = contactService.getAllContact();
		modelMap.addAttribute("contact", contact);
		return "getContacts";
	}
	@RequestMapping("/contactInfo")
	public String contyactInfo(@RequestParam("id") long id, ModelMap modelMap) {
		Contact contact = contactService.getContactInfo(id);
		modelMap.addAttribute("contact", contact);
		return "contactInfo";
	}
}