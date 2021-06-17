package pkg.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import pkg.beans.Pessoa;
import pkg.persistence.SessionPessoa;

public class PessoaController {
	
	private ArrayList<Pessoa> pessoaList;
	private SessionPessoa sessionPessoa;
	
	public PessoaController() {
		
		pessoaList = new ArrayList<Pessoa>();
		sessionPessoa = new SessionPessoa();
		
	}
	
	
	public boolean addPessoa(Pessoa pessoa) {
		boolean isOkay = false;
		
//		String query = 
		
		sessionPessoa.addPessoa(pessoa);
		
		
		return isOkay;
	}
}
