package pkg.controller;

import java.util.ArrayList;
import java.util.List;

//import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import pkg.beans.Pessoa;
import pkg.persistence.SessionPessoa;

@Controller
public class PessoaController {
	
	private SessionPessoa sessionPessoa;
	
	public PessoaController() {
		
		sessionPessoa = new SessionPessoa();
		
	}
	
	@PostMapping("/addPessoa")
	@ResponseBody
	public boolean addPessoa(@RequestBody Pessoa pessoa) {
		boolean isOkay = false;
		
		sessionPessoa.addPessoa(pessoa);
		
		return isOkay;
	}
	
	@PostMapping("/getFuncionarios")
	@ResponseBody
	public List<Pessoa> getFuncionarios() {
		List<Pessoa> listFuncionarios = new ArrayList<Pessoa>();
		
		listFuncionarios = sessionPessoa.getFuncionarios();
		
		return listFuncionarios;
	}
	
	@PostMapping("/getPessoas")
	@ResponseBody
	public List<Pessoa> getPessoas() {
		List<Pessoa> listFuncionarios = new ArrayList<Pessoa>();
		
		listFuncionarios = sessionPessoa.getPessoas();
		
		return listFuncionarios;
	}
}
