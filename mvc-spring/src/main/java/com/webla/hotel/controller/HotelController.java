package com.webla.hotel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HotelController {
	
	@RequestMapping("/billing")
	@ResponseBody
	public List<String> getBillingDetails() {
		List<String> responses = new ArrayList<>();
		responses.add("Ok. Please take it from billing desk");
		responses.add(getDineIndetails());
		responses.add(pickOrder());

		return responses;
	}
	
	
	@RequestMapping("/dinein")
	@ResponseBody
	public String getDineIndetails() {
		return "Your reservation is successfull.. Table 10 is your dineing table";
	}
	
	
	@RequestMapping("/takeaway")
	@ResponseBody
	public String pickOrder() {
		return "Your parcel is ready .. Parcel no 12111";
	}
}
