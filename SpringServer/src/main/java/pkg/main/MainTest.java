package pkg.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import pkg.beans.Pessoa;
import pkg.persistence.SessionPessoa;

public class MainTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Pessoa p = new Pessoa();
		
		SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date = simpleFormat.parse("1989-01-10");
		
		p.setNome("Jozefino");
		p.setCpf("54123456");
		p.setFuncionario(true);
		p.setDataNascimento(date);
		
		JOptionPane.showMessageDialog(null, p.getDataNascimento());
		
		SessionPessoa session = new SessionPessoa();
		
		session.addPessoa(p);
		
		
		

	}

}
