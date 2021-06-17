package pkg.beans;

import java.util.Date;

public class Pessoa {
	
	private long id;
	private String nome;
	private Date dataNascimento;
	private String cpf;
	private boolean funcionario;
	
	public Pessoa() {
		
		nome = "";
		dataNascimento = new Date();
		cpf = "";
		funcionario = false;
		
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public boolean isFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(boolean funcionario) {
		this.funcionario = funcionario;
	}
	
	

}
