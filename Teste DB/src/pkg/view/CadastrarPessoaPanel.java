package pkg.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

import pkg.beans.Pessoa;
import pkg.controllers.PessoaController;

@SuppressWarnings("serial")
public class CadastrarPessoaPanel extends JPanel implements ActionListener{
	private JLabel lNome;
	private JLabel lDataNascimento;
	private JLabel lCPF;
	private JLabel lFuncionario;
	
	private JTextField tfNome;
	private JTextField tfDataNascimento;
	private JTextField tfCPF;
	private JCheckBox ckFuncionario;
	
	private JButton btSalvar;
	
	public CadastrarPessoaPanel() {
		
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
		
		btSalvar.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(btSalvar)) {
			
			Pessoa p = new Pessoa();
			
			SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
			
			Date date = new Date();
			
			try {
				date = simpleFormat.parse(tfDataNascimento.getText());
				simpleFormat = new SimpleDateFormat("yyyy-MM-dd");
				JOptionPane.showMessageDialog(null, simpleFormat.format(date));
				
			} catch (ParseException e1) {
				
				JOptionPane.showMessageDialog(null, "Data de nascimento em formato errado, deve ser \"dd/MM/yyyy\"");
				
				e1.printStackTrace();
				return;
			}
			
			p.setNome(tfNome.getText());
			p.setCpf(tfCPF.getText());
			p.setFuncionario(ckFuncionario.isSelected());
			simpleFormat = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println("1989-01-10");
			p.setDataNascimento("1989-01-10");
			
			PessoaController pessoaController = new PessoaController();
			
			/*
			 * if(!pessoaController.addPessoa(p)) {
			 * 
			 * JOptionPane.showMessageDialog(null, "Erro ao cadastrar pessoa"); return; }
			 */
			
			try {
				pessoaController.addPessoa(p);
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, "Erro na persistência");
				e1.printStackTrace();
				
				return;
			}
			
		}
		
	}
	
}
