package com.CustomCode_10.util;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender mailSender;
	
	
	@Override
	public void sendEmail(String to, String sub, String emailBody) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("gomkarrohit7@gmail.com");
		message.setTo(to);
		message.setSubject(sub);
		message.setText(emailBody);
		mailSender.send(message);
		
	}
}
