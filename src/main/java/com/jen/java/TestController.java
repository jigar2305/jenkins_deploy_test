package com.jen.java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {
	
	@GetMapping("/")
	public Object test() {
		
		return "hello welcome";
	}

}
