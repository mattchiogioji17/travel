package com.flight.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flight.service.domain.Flight;

@RestController
public class MainController {

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello() {
		return "Hello flight service";
	}
	
	@RequestMapping(value="/flights", method=RequestMethod.GET)
	public Flight test() {
		
		Flight flight = new Flight();
		flight.setId(1);
		flight.setName("Matt");
		
		return flight;
	}
	
	
}


