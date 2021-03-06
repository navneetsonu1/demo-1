package com.example.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping(value = "/{n1}/{n2}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String test(@PathVariable int n1, @PathVariable int n2) {
		return Integer.toString(n1+n2);
	}

}
