package pkg.persistence;

import java.sql.SQLException;
import java.text.SimpleDateFormat;

import pkg.beans.Pessoa;

public class SessionPessoa {
	
	Connector conn = new Connector();
	
	public boolean addPessoa(Pessoa pessoa) {
		boolean isOkay = false;
		
		SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			conn.addData("INSERT INTO public.pessoa(nome, datanascimento, cpf, funcionario) VALUES ('"+
						pessoa.getNome()+"', '" + 
						new SimpleDateFormat("yyyy-MM-dd").format(pessoa.getDataNascimento()) +"', '"+
						pessoa.getCpf() + "', '" +pessoa.isFuncionario() + "')");
			
			isOkay = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return isOkay;
		
	}

}
