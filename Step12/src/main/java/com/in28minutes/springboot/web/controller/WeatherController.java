package com.in28minutes.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.springboot.web.service.WeatherService;

@Controller
@SessionAttributes("city")
public class WeatherController {
	
	@Autowired
	WeatherService service;
	
	static Boolean  flag;
	
	@RequestMapping(value="/weather", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model){
		
		
		return "weather";
		
		
	}
	
	@RequestMapping(value="/weather", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String city){
		
		String data = service.getData(city);
		
		if (data==null) {
			model.put("errorMessage", "no data found");
			return "weather";
		}
		
		model.put("cityname", city);	
		model.put("data", data);	
		return "weather";
	}

}
