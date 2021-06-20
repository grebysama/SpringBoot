package pkg.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import pkg.beans.Pessoa;
import pkg.beans.Projeto;
import pkg.controllers.PessoaController;

@SuppressWarnings("serial")
public class CadastrarProjetoPanel extends JPanel implements ActionListener{
	
	private JLabel lNome;
	private JLabel lDataInicio;
	private JLabel lDataPrevisaoFim;
	private JLabel lDataFim;
	private JLabel lDescricao;
	private JLabel lStatus;
	private JLabel lOrcamento;
	private JLabel lRisco;
	private JLabel lGerente;
	private JLabel lMembros;
	
	
	
	private JTextField tfNome;
	private JTextField tfDataInicio;
	private JTextField tfDataPrevisaoFim;
	private JTextField tfDataFim;
	private JTextField tfDescricao;
	private JComboBox<String> cbStatus;
	private JFormattedTextField tfOrcamento;
	private JComboBox<String> cbRisco;
	private JComboBox<Pessoa> cbGerente;
	private JList<Pessoa> jListMembros;
	
	private JButton btSalvar;
	
	public CadastrarProjetoPanel() {
		
		GridLayout grid = new GridLayout(20, 2, 1, 1);
		
		this.setLayout(grid);
		
		lNome = new JLabel("Nome:");
		lDataInicio = new JLabel("Data de Início:");
		lDataPrevisaoFim = new JLabel("Previsão de Término");
		lDataFim = new JLabel("Data de Finalização:");
		lDescricao = new JLabel("Descrição:");
		lStatus = new JLabel("Status:");
		lOrcamento = new JLabel("Orçamento:");
		lRisco = new JLabel("Risco:");
		lGerente = new JLabel("Gerente:");
		lMembros = new JLabel("Membros:");
		
		tfNome = new JTextField();
		tfDataInicio = new JTextField();
		tfDataPrevisaoFim = new JTextField();
		tfDataFim = new JTextField();
		tfDescricao = new JTextField();
		
		String[] statusItens = {"Em análise", "Análise realizada", "Análise aprovada", "Iniciado", "Planejado", "Em andamento", "Encerrado", "Cancelado"};
		cbStatus = new JComboBox<String>(statusItens) ;
		tfOrcamento = new JFormattedTextField();

		String[] riscoItens = {"Baixo", "Médio", "Alto"};
		cbRisco = new JComboBox<String>(riscoItens);
		
		PessoaController pessoaController = new PessoaController();
		List<Pessoa> resultadoGerente = new ArrayList<Pessoa>();
		
		try {
			resultadoGerente = pessoaController.getFuncionarios();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showInputDialog(null, "Algo deu errado ao buscar funcionários. Tenha certeza que cadastrou algum! :P");
			
			return;
		}
		
		List<Pessoa> listGerentes = new ArrayList<Pessoa>();
		
		for(int i = 0; i < resultadoGerente.size(); i++) {
			
			listGerentes.add(resultadoGerente.get(i));
			
		}
		
		Pessoa[] arrayGerentes = new Pessoa[resultadoGerente.size()];
		
		
		//TODO
		
		for(int i = 0; i < listGerentes.size(); i++) {
			arrayGerentes[i] = resultadoGerente.get(i);
//			System.out.println(listGerentes.get(i).toString());
			
		}
		
		List<Pessoa> resultadoMembro = new ArrayList<Pessoa>();
		
		try {
			resultadoMembro = pessoaController.getPessoas();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showInputDialog(null, "Algo deu errado ao buscar pessoas. Tenha certeza que cadastrou alguma! :P");
			
			return;
		}
		
		List<Pessoa> listMembros = new ArrayList<Pessoa>();
		
		for(int i = 0; i < resultadoMembro.size(); i++) {
			
			listMembros.add(resultadoMembro.get(i));
			
		}
		
		Pessoa[] arrayMembros = new Pessoa[resultadoMembro.size()];
		
		
		//TODO
		
		for(int i = 0; i < listMembros.size(); i++) {
			arrayMembros[i] = resultadoMembro.get(i);
			
		}
		
		cbGerente = new JComboBox<Pessoa>(arrayGerentes);
		
		jListMembros = new JList<Pessoa>(arrayMembros);

		JScrollPane scroll = new JScrollPane(jListMembros);
		
		btSalvar = new JButton("Salvar");
		
		this.add(lNome);
		this.add(tfNome);
		
		this.add(lDataInicio);
		this.add(tfDataInicio);
		
		this.add(lDataPrevisaoFim);
		this.add(tfDataPrevisaoFim);
		
		this.add(lDataFim);
		this.add(tfDataFim);
		
		this.add(lDescricao);
		this.add(tfDescricao);
		
		this.add(lStatus);
		this.add(cbStatus);
		
		this.add(lOrcamento);
		this.add(tfOrcamento);
		
		this.add(lRisco);
		this.add(cbRisco);
		
		this.add(lGerente);
		this.add(cbGerente);
		
		this.add(lMembros);
		this.add(scroll);
		
//		this.add(new JLabel(""));
//		this.add(new JLabel(""));
//		
//		this.add(new JLabel(""));
//		this.add(new JLabel(""));
//		
//		this.add(new JLabel(""));
//		this.add(new JLabel(""));
//		
//		this.add(new JLabel(""));
//		this.add(new JLabel(""));
//		
//		this.add(new JLabel(""));
//		this.add(new JLabel(""));
//		
//		this.add(new JLabel(""));
//		this.add(new JLabel(""));
//		
//		this.add(new JLabel(""));
//		this.add(new JLabel(""));
//		
//		this.add(new JLabel(""));
//		this.add(new JLabel(""));
//		
//		this.add(new JLabel(""));
//		this.add(new JLabel(""));
		
		this.add(new JLabel(""));
		this.add(btSalvar);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(btSalvar)) {
			
			Projeto projeto = new Projeto();
			
			projeto.setNome(tfNome.getText());
			
			
			
		}
		
		// TODO Auto-generated method stub
		
	}

}
