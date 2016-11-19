package com.app.controllers;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	public HomeController() {
		System.out.println("in home controller constr");
	}

	// req handling method
	@RequestMapping("/home")
	public ModelAndView sayHello() {
		System.out.println("in Home");
//		return new ModelAndView("index","userName","ravi");
		Map<String,Object> m1 = new HashMap<>();
		m1.put("userName", "Manish");
		m1.put("contact", "7775069659");
		return new ModelAndView("index",m1);
	}
	// req handling method
	@RequestMapping("/hello1")
	public ModelAndView sayHello1() {
		System.out.println("in sayHello1");
		//ModelAndView(String logViewName,String modelAttrName,Object attrValue)
		return new ModelAndView("index", "abc", new Date());
	}

	// req handling method
	@RequestMapping("/hello2")
	public String sayHello2(Model map) {
		System.out.println("in sayHello2 "+map);
		//map.addAttribute("date",new Date())
		map.addAttribute(new Date());
		map.addAttribute("my_list", Arrays.asList(10,20,30));
		map.addAttribute(Arrays.asList(1.2,3.4,5.6));
		System.out.println("populated map "+map);
		return "index";
	}

	@RequestMapping("/hello3")
	@ResponseBody
	public String sayHello3(Model map) {
		System.out.println("in sayHello2 "+map);
		//map.addAttribute("date",new Date())
		map.addAttribute(new Date());
		map.addAttribute("my_list", Arrays.asList(10,20,30));
		map.addAttribute(Arrays.asList(1.2,3.4,5.6));
		System.out.println("populated map "+map);
		return "welcome as response body";
	}



}
