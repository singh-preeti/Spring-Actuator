package com.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/act")
public class HelloController {

	@GetMapping("/hello")
	public String hello()
	{
		return "Hello Developer";
	}
}
