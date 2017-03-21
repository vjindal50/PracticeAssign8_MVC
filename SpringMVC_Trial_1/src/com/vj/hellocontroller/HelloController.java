package com.vj.hellocontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController{

	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse respone) throws Exception{
		
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage","HI, this is 1st MVC");
		
		return modelandview;
	}
	
}
