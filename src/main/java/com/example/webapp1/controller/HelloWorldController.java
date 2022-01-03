package com.example.webapp1.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
	public String sayHello() {
		return "Hello, This app is created for Demo purpose by ESSPL DU CAPABILITY TEAM. TESTING"
			+
			"\n"
			+
			"This app has been deployed using Pipeline (v0.3)"
			+
			"\n";
	}

}
