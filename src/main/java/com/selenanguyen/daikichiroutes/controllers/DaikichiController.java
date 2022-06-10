package com.selenanguyen.daikichiroutes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping("/travel/{pathLocation}")
	public String path(@PathVariable("pathLocation")String name) {
		return "Congratulations! You will soon travel to " + name;
	}
	
	@RequestMapping("/lotto/{pathNumber}")
	public String path(@PathVariable("pathNumber")Integer number) {
		if(number % 2==0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers.";
		}else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
		
	}
	

}
