package com.chio.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chio.user.domain.Flight;

@Controller
public class FlightServiceController {

	@Autowired
	private FlightClient flightClient;
	
	@RequestMapping("/myTrips")
    public String myTrips(Model model) {
		Flight flight = flightClient.getFlight();
		System.out.println("Flight: " + flight.getName());
		return "myTrips";
    }
}
