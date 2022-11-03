package com.webla.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HotelController {
	
	@RequestMapping("/billing")
	@ResponseBody
	public String getBillingDetails() {
		return "Ok. Please take it from billing desk";
	}
//CTRL+D	

	@RequestMapping("/dinein")
	//@ResponseBody
	public String getDineIndetails() {
		return "dinein";
	}
	
	
	@RequestMapping("/takeaway")
	@ResponseBody
	public String pickOrder() {
		return "Your parcel is ready .. Parcel no 12111";
	}
}
