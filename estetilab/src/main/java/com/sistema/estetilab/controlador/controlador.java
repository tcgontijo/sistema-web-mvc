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
		return "CRUD-procedimentos/readproced";
	}
	@RequestMapping("/procededit")
	public String createupdate() {
		return "CRUD-procedimentos/uptproced";
	}
	@RequestMapping("/procedadd")
	public String create_proced() {
		return "CRUD-procedimentos/crtproced";
	}
	
	/*********************
	 ** CRUD - CLIENTES **
	 *********************/
	@RequestMapping("/cadastrarcliente")
	public String add() {
		return "CRUD-cadastrarClientes/add";
	}
	@RequestMapping("/editarcliente")
	public String edit() {
		return "CRUD-cadastrarClientes/edit";
	}
	@RequestMapping("/mostrarcliente")
	public String view() {
		return "CRUD-cadastrarClientes/listagemClientes";
	}
	/*************************
	 ** CRUD - AGENDAMENTOS **
	 *************************/
	@RequestMapping("/agenda")
	public String agenda() {
		return "CRUD-agendamentos/lista";
	}
	@RequestMapping("/agendaedit")
	public String agendaedit() {
		return "CRUD-agendamentos/book";
	}
}
