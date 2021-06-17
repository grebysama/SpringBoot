package pkg.view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class MenuBar extends JMenuBar {
	
	private JMenu menuArquivo;
	private JMenu menuCadastro;
	private JMenu menuPesquisar;
	
	public MenuBar() {
		
		menuArquivo = new JMenu("Arquivo");
		JMenuItem menuArquivoFechar = new JMenuItem(""); 
		
	}
	
}
