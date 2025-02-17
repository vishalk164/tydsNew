package com.tyds;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@GetMapping
	public String home() {
		return "Application running 1";
		
	}

	@GetMapping("api1")
	public String home2() {
		return "Application running 2";
		
	}
	
	@GetMapping("api2/new")
	public String home3() {
		return "Application running 3";
		
	}
	
	@GetMapping("api3")
	public String home4() {
		return "Application running 4 .";
		
	}
}
