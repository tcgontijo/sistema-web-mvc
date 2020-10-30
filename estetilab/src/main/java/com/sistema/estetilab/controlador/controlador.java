package com.sistema.estetilab.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controlador {

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/procedimentos")
	public String procedimentos() {
		return "procedimentos";
	}

}
