package pkg.main;

import javax.swing.JFrame;

import pkg.view.MainView;

public class MainApp{
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		JOptionPane.showConfirmDialog(null, new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		
		MainView app = new MainView();
		
		app.setBounds(80, 80, 860, 900);
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		app.setVisible(true);
		
//		Connector conn = new Connector();
		
//		try {
//			conn.getData("");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}



}
