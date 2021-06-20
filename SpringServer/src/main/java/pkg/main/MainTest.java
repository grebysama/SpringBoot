package pkg.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import pkg.beans.Pessoa;
import pkg.beans.Projeto;
import pkg.controller.ProjetoController;
import pkg.persistence.SessionPessoa;

public class MainTest {
	
	private static void testeAddPessoa() throws ParseException {
		
		Pessoa p = new Pessoa();
		
		SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date date = simpleFormat.parse("10/01/1989");
		
		p.setNome("Pazuzu");
		p.setCpf("654123");
		p.setFuncionario(true);
		p.setDataNascimento("2985-10-25");
		
		JOptionPane.showMessageDialog(null, p.getDataNascimento());
		
		SessionPessoa session = new SessionPessoa();
		
		session.addPessoa(p);
		
	}
	
	private static void testeAddProjeto() throws ParseException {
		
		Projeto p = new Projeto();
		
		SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date date = simpleFormat.parse("10/01/1989");
		
		p.setNome("Pazuzu");
		
		Pessoa gerente = new Pessoa();
		
		gerente.setId(2);
		
		ProjetoController controller = new ProjetoController();
		
		controller.addProjeto(p);
		
	}
	

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		
		
		

	}

}
