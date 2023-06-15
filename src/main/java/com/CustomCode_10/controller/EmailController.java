package com.CustomCode_10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CustomCode_10.util.EmailService;

@Controller
public class EmailController {

	@Autowired
	private EmailService emailService;

	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("email") String email, ModelMap modelMap) {

		modelMap.addAttribute("email", email);
		return "composeEmail";
	}

	@RequestMapping("/send")
	public String composeEmail(@RequestParam("sendTo") String to, @RequestParam("subject") String sub,
			@RequestParam("emailBody") String emailBody, ModelMap modelMap) {
		emailService.sendEmail(to, sub, emailBody);

		return "composeEmail";
	}

	@RequestMapping("/sendEmailTo")
	public String sendEmailTo(@RequestParam("email") String email, ModelMap modelMap) {
		modelMap.addAttribute("email", email);
		return "composeEmail2";
	}
	
	@RequestMapping("/sendTo")
	public String composeEmailTo(@RequestParam("sendTo") String to, @RequestParam("subject") String sub,
			@RequestParam("emailBody") String emailBody, ModelMap modelMap) {
		emailService.sendEmail(to, sub, emailBody);

		return "composeEmail2";
}
}