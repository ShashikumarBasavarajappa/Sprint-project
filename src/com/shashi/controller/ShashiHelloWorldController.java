package com.shashi.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
 * Author Shashikumar JAKKALI
 */

@Controller
public class ShashiHelloWorldController{

	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		System.out.println("hhhhhhhhhh.....................................................................");
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
				return new ModelAndView("welcome", "message", message);		
	}
	
}
