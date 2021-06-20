package pkg.main;

import java.io.IOException;

import pkg.beans.Pessoa;
import pkg.beans.Projeto;
import pkg.controllers.PessoaController;
import pkg.controllers.ProjetoController;

public class MainTestes {
	
	private static void testeAddProjeto() {
		
		Projeto p = new Projeto();
		
		p.setNome("Projeto");
		
		Pessoa gerente = new Pessoa();
		
		gerente.setId(2);
		
		p.setGerente(gerente);
		
		ProjetoController controller = new ProjetoController();
		
		try {
			controller.addPessoa(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void testeAddPessoa() {
		
		PessoaController pessoaController = new PessoaController();
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Gregory Zanon");
		pessoa.setDataNascimento("1989-01-10");
		pessoa.setCpf("1987456");
		pessoa.setFuncionario(true);
		
		try {
			pessoaController.addPessoa(pessoa);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testeAddProjeto();

	}

}
