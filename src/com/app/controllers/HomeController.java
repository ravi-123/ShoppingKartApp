package com.app.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.app.enums.Gender;
import com.app.pojo.Role;
import com.app.pojo.User;
import com.app.services.UserService;

@Controller
public class HomeController {
	@Resource
	private UserService userService;
	
	public HomeController() {
		System.out.println("in home controller constr");	
	}

	// req handling method
	@RequestMapping(value="/home5",method=RequestMethod.GET)
	public ModelAndView sayHello() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		User u1 = new User();
		u1.setAge(10);
		u1.setAlternateContactNo("7777777777");
		u1.setContactNo("7777777777");
		try {
			u1.setDob(sdf.parse("05/06/1991"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		u1.setEmail("abc@gmail.com");
		u1.setName("ravi");
//		u1.setRole(Role.USER);
		u1.setSex(Gender.MALE);		
		userService.addUser(u1);
		System.out.println(u1);
		u1 = null;
		u1 = userService.getUser(1);
		System.out.println("after get from db, user="+u1);
    	return new ModelAndView("index","user",u1);
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
