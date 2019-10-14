package com.example.demo.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	private static final Logger LOG = LoggerFactory.getLogger(DemoController.class);

	
	@GetMapping("/testMethod")
	public String testMethod(HttpServletRequest request) {
		InetAddress address = null ;
		try {
			address = InetAddress.getLocalHost();
			LOG.info(address.getHostAddress());

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			LOG.error(e.getMessage());

		}
		
		
		return "response ip: " + address.getHostAddress() +"flag-32";
	}
	
}

