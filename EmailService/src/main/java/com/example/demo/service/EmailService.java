package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.EmailOtp;
import com.example.demo.repository.EmailOtpRepository;

@Service
public class EmailService {
	
	@Autowired
	private EmailOtpRepository emailOtpRepository;
	
	

	public String addEmailOtp(EmailOtp emailOtp) {
		EmailOtp emailOtp1=emailOtpRepository.save(emailOtp);
		
		if(emailOtp1 !=null) {
			return "emailotp saved successfully";
		}
		
		return "Something went wrong";
	}
	
	public List<EmailOtp> getEmailOtpByEmail(String email) {
		List<EmailOtp> obj=emailOtpRepository.findByEmail(email);
	     
		
		return obj;
	}
	
}
