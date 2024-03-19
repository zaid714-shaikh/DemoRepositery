package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

	@GetMapping(value = "/")
	public String getMSg() {
		return "Welcome TO Exponent";
	}

}
