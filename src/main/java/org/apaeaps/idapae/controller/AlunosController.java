package org.apaeaps.idapae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alunos")
public class AlunosController {
	@GetMapping
	public String teste() {
		return "/alunos/formulario";
	}
}
