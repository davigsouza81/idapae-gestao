package org.apaeaps.idapae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IDAPAEController {

	@GetMapping
	public ModelAndView inicio() {
		ModelAndView modelAndView = new ModelAndView("/index");
		modelAndView.addObject("isInicio", true);
		
		return modelAndView;
	}
	
	@PostMapping
	public ModelAndView home() {
		return new ModelAndView("index :: conteudo");
	}
}
