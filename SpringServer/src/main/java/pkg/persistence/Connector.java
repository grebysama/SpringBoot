package pkg.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import pkg.beans.Pessoa;

public class Connector {
	
	private Connection conn;
	
	public Connector() {
		// TODO Auto-generated constructor stub
		
		String url = "jdbc:postgresql://localhost/dbgenerica";
		Properties props = new Properties();
		props.setProperty("user","postgres");
		props.setProperty("password","admin");
		
		try {
			conn = DriverManager.getConnection(url, props);
		} catch (SQLException e) {
			System.out.println("Erro de conexão!");
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
//	public void getData(String selectQuery) throws SQLException {
//		
//		Statement st = conn.createStatement();
//		ResultSet rs = st.executeQuery("SELECT * FROM pessoa");
//		while (rs.next())
//		{
//		    System.out.print("Column 2 returned ");
//		    System.out.println(rs.getString(2));
//		}
//		rs.close();
//		st.close();
//		
//	}
	
	public List<Pessoa> getPessoaData(String selectQuery) throws SQLException {
		List<Pessoa> listData = new ArrayList<Pessoa>();
		
//		int numeroResultados = 0;
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(selectQuery);
		while (rs.next())
		{
//			List<String> listSingleData = new ArrayList<String>();
			System.out.println(rs.getString(2) + " | " + rs.getString(4));
			Pessoa p = new Pessoa();
			p.setId(rs.getLong(1));
			p.setNome(rs.getString(2));
			p.setDataNascimento(rs.getString(3));
			p.setCpf(rs.getString(4));
			p.setFuncionario(rs.getBoolean(5));
			
			listData.add(p);
			
//			for(int i = 0; i < numeroDeCampos; i++) {
//				
//				listSingleData.add(rs.getString(i+1));
////				listData.add(numeroResultados, listSingleData);
//			}
			
//			numeroResultados++;
//		    System.out.print("Column 2 returned ");
//		    System.out.println(rs.getString(2));
		}
		rs.close();
		st.close();
		
		return listData;
	}
	
	public void addData(String insertQuery) throws SQLException {
		
		Statement st = conn.createStatement();
		st.execute(insertQuery);
//		while (rs.next())
//		{
//		    System.out.print("Column 2 returned ");
//		    System.out.println(rs.getString(2));
//		}
//		rs.close();
		
		st.close();
		
	}

}
