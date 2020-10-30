package com.sistema.estetilab.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controlador {

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	//CRUD - PROCEDIMENTOS
	
	@RequestMapping("/procedimentos")
	public String read() {
		return "CRUD-procedimentos/read";
	}
	@RequestMapping("/procedimentos/editar")
	public String update() {
		return "CRUD-procedimentos/update";
	}
	@RequestMapping("/procedimentos/adicionar")
	public String create() {
		return "CRUD-procedimentos/create";
	}
	@RequestMapping("/procedimentos/deletar")
	public String delete() {
		return "CRUD-procedimentos/delete";
	}
	


}
