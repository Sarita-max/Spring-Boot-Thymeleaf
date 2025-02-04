package com.sb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeThymeleafController {

	@GetMapping({"/","/hello"})
	public String welcome(@RequestParam(value="name",defaultValue = "world",required = true) String name,Model model)
	{
		model.addAttribute("name", name);
		return "hello";
	}
}
