package com.moose.friday;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/max")
public class MooseRestingController {
	
	@GetMapping
	public String sayit()
	{
		return "hello chocco dude rocks with maven";
	}
	

}
