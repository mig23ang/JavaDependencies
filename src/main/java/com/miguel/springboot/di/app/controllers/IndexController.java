package com.miguel.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.miguel.springboot.di.app.service.IServicioPrincipal;
import com.miguel.springboot.di.app.service.ServicioPrincipal;

@Controller
public class IndexController {
	
	@Autowired
	private IServicioPrincipal servicio;
	
	@GetMapping({"" ,"/", "index"})
	public String index(Model model) {
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}
	
	
}
