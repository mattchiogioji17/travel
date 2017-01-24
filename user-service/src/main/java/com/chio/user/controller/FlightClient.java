package com.chio.user.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chio.user.domain.Flight;

@FeignClient("flight-service")
public interface FlightClient {

	@RequestMapping(value = "/flights", method = RequestMethod.GET)
	Flight getFlight();

}
