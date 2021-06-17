package pkg.session;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Connector {
	private Connection conn;
	
	public Connector() {
		// TODO Auto-generated constructor stub
		
		String url = "jdbc:postgresql://localhost/dbgenerica";
		Properties props = new Properties();
		props.setProperty("user","postgres");
		props.setProperty("password","admin");
//		props.setProperty("ssl","true");
		
		
		try {
			conn = DriverManager.getConnection(url, props);
		} catch (SQLException e) {
			System.out.println("Erro de conexão!");
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void getData(String selectQuery) throws SQLException {
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM pessoa");
		while (rs.next())
		{
		    System.out.print("Column 2 returned ");
		    System.out.println(rs.getString(2));
		}
		rs.close();
		st.close();
		
	}

}
