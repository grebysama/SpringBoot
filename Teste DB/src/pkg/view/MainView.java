package pkg.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuKeyEvent;

@SuppressWarnings("serial")
public class MainView extends JFrame implements ActionListener{
	private JMenuBar menuBar;
	private JMenu menuArquivo;
	private JMenu menuCadastro;
	private JMenuItem menuCadastroPessoa;
	private JMenuItem menuCadastroProjeto;
	private JMenu menuPesquisar;
	private JMenuItem menuArquivoFechar;
	
	
	
	public MainView() {
	
		menuBar = new JMenuBar();
		
		menuArquivo = new JMenu("Arquivo");
		menuArquivoFechar = new JMenuItem("Fechar");
		menuBar.add(menuArquivo);
		menuArquivo.add(menuArquivoFechar);
		menuArquivoFechar.addActionListener(this);
		
		menuCadastro = new JMenu("Cadastrar");
		menuBar.add(menuCadastro);
		menuCadastroPessoa = new JMenuItem("Pessoa");
		menuCadastro.add(menuCadastroPessoa);
		menuCadastroProjeto = new JMenuItem("Projeto");
		menuCadastro.add(menuCadastroProjeto);
		
		menuCadastroPessoa.addActionListener(this);
		menuCadastroProjeto.addActionListener(this);
		
		
		
		
		this.setJMenuBar(menuBar);
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == menuArquivoFechar) {
			this.setVisible(false);
		}
		
		if (e.getSource() == menuCadastroPessoa) {
//			CadastrarPessoaPanel panel = new CadastrarPessoaPanel();
			
			this.setContentPane(new CadastrarPessoaPanel());
			this.setVisible(true);
		}
		
		if (e.getSource() == menuCadastroProjeto) {
//			CadastrarProjetoPanel panel = new CadastrarProjetoPanel();
			this.setContentPane(menuCadastroProjeto);
			
			this.setContentPane(new CadastrarProjetoPanel());
			this.setVisible(true);
		}
		
	}

}
