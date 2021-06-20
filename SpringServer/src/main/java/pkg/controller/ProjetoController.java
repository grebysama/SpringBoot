package pkg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import pkg.beans.Pessoa;
import pkg.beans.Projeto;
import pkg.persistence.SessionProjeto;

@Controller
public class ProjetoController {
	
	SessionProjeto sessionProjeto;
	
	public ProjetoController() {
		// TODO Auto-generated constructor stub
		sessionProjeto = new SessionProjeto();
	}

	@PostMapping("/addProjeto")
	@ResponseBody
	public boolean addProjeto(@RequestBody Projeto projeto) {
		boolean isOkay = false;
		
		sessionProjeto.addProjeto(projeto);
		
		return isOkay;
	}
	
}
