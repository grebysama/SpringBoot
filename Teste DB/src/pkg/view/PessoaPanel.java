package pkg.view;

import java.awt.GridLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class PessoaPanel extends JPanel{
	private JLabel lNome;
	private JLabel lDataNascimento;
	private JLabel lCPF;
	private JLabel lFuncionario;
	
	private JTextField tfNome;
	private JTextField tfDataNascimento;
	private JTextField tfCPF;
	private JCheckBox ckFuncionario;
	
	private JButton btSalvar;
	
	public PessoaPanel() {
		
		GridLayout grid = new GridLayout(8, 2, 1, 1);
		
		this.setLayout(grid);
		this.setSize(300, 480);
		
		lNome = new JLabel("Nome:");
		lDataNascimento = new JLabel("Data de Nascimento:");
		lCPF = new JLabel("CPF:");
		lFuncionario = new JLabel("Funcionário: ");
		
		tfNome = new JTextField();
		tfDataNascimento = new JTextField();
		tfCPF = new JTextField();
		ckFuncionario = new JCheckBox();
		btSalvar = new JButton("Salvar");
		
		this.add(lNome);
		this.add(tfNome);
		
		this.add(lDataNascimento);
		this.add(tfDataNascimento);
		
		this.add(lCPF);
		this.add(tfCPF);
		
		this.add(lFuncionario);
		this.add(ckFuncionario);
		
		this.add(new JLabel());
		this.add(btSalvar);
		
	}
	
}
