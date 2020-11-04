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
	@RequestMapping("/procedview")
	public String read() {
		return "CRUD-procedimentos/read";
	}
	@RequestMapping("/procededit")
	public String createupdate() {
		return "CRUD-procedimentos/createupdate";
	}
	/**************************
	 ** CRUD - CADASTRAR CLIENTES **
	 **************************/
	@RequestMapping("/cadastrarcliente")
	public String add() {
		return "CRUD-cadastrarClientes/add";
	}
	@RequestMapping("/editarcliente")
	public String edit() {
		return "CRUD-cadastrarClientes/edit";
	}
}
