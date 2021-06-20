package pkg.persistence;

import java.sql.SQLException;
import java.text.SimpleDateFormat;

import pkg.beans.Projeto;

public class SessionProjeto {
	
	Connector conn;
	
	public SessionProjeto() {
		
		conn = new Connector();
		
	}
	
	public boolean addProjeto(Projeto projeto) {
		boolean isOkay = false;
		
		SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(projeto.toSQLInsert());
		
		try {
			conn.addData(projeto.toSQLInsert());
			
			isOkay = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return isOkay;
		}
		
		return isOkay;
		
	}

}
