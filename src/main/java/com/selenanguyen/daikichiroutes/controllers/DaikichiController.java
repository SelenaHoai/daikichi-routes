package com.selenanguyen.daikichiroutes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	
	// http://localhost:8080/daikichi
	@GetMapping("/")
	public String welcome() {
		return "Welcome!";
	}
	
	// http://localhost:8080/daikichi/today
	@GetMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	// http://localhost:8080/daikichi/tomorrow
	@GetMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be oopen to new ideas!";
	}

}
