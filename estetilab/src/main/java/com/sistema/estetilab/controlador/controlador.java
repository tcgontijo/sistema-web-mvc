package com.sistema.estetilab.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controlador {

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	/**************************
	 ** CRUD - PROCEDIMENTOS **
	 **************************/
	@RequestMapping("/procedimentos")
	public String read() {
		return "CRUD-procedimentos/read";
	}
	@RequestMapping("/procedimentos/edit")
	public String createupdate() {
		return "CRUD-procedimentos/createupdate";
	}
	/**************************
	 ** CRUD - CADASTRAR CLIENTES **
	 **************************/
	@RequestMapping("/cadastrarcliente")
	public String add() {
		return "CRUD-cadastrarCliente/add";
	}
	@RequestMapping("/editarcliente")
	public String edit() {
		return "CRUD-cadastrarCliente/edit";
	}
}
