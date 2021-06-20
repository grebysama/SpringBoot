package pkg.persistence;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pkg.beans.Pessoa;

public class SessionPessoa {
	
	Connector conn;
	
	public SessionPessoa() {

		conn = new Connector();
		
	}
	
	
	public boolean addPessoa(Pessoa pessoa) {
		boolean isOkay = false;
		
//		SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("pundinzin = "+pessoa.getDataNascimento());
		try {
			conn.addData("INSERT INTO public.pessoa(nome, datanascimento, cpf, funcionario) VALUES ('"+
						pessoa.getNome()+"', '" + 
						pessoa.getDataNascimento() +"', '"+
						pessoa.getCpf() + "', '" +pessoa.isFuncionario() + "')");
			
			isOkay = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return isOkay;
		}
		
		return isOkay;
		
	}
	
	public List<Pessoa> getFuncionarios(){
		List<Pessoa> listPessoas = new ArrayList<Pessoa>();
		
		try {
			listPessoas = conn.getPessoaData("SELECT * FROM pessoa WHERE funcionario=true");
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
//		System.out.println("listSQLPessoas = "+listSQLPessoas.toString());
		
//		for(int i = 0; i < listSQLPessoas.size(); i++) {
//			
//			Pessoa p = new Pessoa();
//			
//			p.setId(Integer.getInteger(listSQLPessoas.get(i).get(0)));
//			p.setNome(listSQLPessoas.get(i).get(1));
//			p.setDataNascimento(listSQLPessoas.get(i).get(2));
//			p.setCpf(listSQLPessoas.get(i).get(3));
//			p.setFuncionario(Boolean.getBoolean(listSQLPessoas.get(i).get(5)));
//			
//			listPessoa.add(p);
//			
//		}
		
		return listPessoas;
	}
	
	public List<Pessoa> getPessoas(){
		List<Pessoa> listPessoas = new ArrayList<Pessoa>();
		
		try {
			listPessoas = conn.getPessoaData("SELECT * FROM pessoa");
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
//		System.out.println("listSQLPessoas = "+listSQLPessoas.toString());
		
//		for(int i = 0; i < listSQLPessoas.size(); i++) {
//			
//			Pessoa p = new Pessoa();
//			
//			p.setId(Integer.getInteger(listSQLPessoas.get(i).get(0)));
//			p.setNome(listSQLPessoas.get(i).get(1));
//			p.setDataNascimento(listSQLPessoas.get(i).get(2));
//			p.setCpf(listSQLPessoas.get(i).get(3));
//			p.setFuncionario(Boolean.getBoolean(listSQLPessoas.get(i).get(5)));
//			
//			listPessoa.add(p);
//			
//		}
		
		return listPessoas;
	}

}
