package com.basant.hello.server.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class HelloServerResource {

	@GetMapping("/getMessage")
	public String getMessage() {
		return "Welcome to Eureak Server Registry , invoked server getMeesage() end point ";
	}

}
