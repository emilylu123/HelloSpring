package com.emilylu123.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @ResponseBody
// @Controller
// == @RestController
@RestController
public class HelloController {


	@RequestMapping("/hello")
	public String handle01(){
		return "Hello, Spring Boot 2!";
	}
}
