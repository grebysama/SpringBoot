package pkg.beans;

public class Pessoa {
	
	private long id;
	private String nome;
	private String dataNascimento;
	private String cpf;
	private boolean funcionario;
	
	public Pessoa() {
		
		nome = "";
		dataNascimento = "";
		cpf = "";
		funcionario = false;
		
	}
	
	
	
	public Pessoa(String nome, String dataNascimento, String cpf, boolean funcionario) {
		this.nome = nome;
		this.dataNascimento = "";
		this.cpf = cpf;
		this.funcionario = funcionario;
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
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
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
	
	public String personToJSON() {
		
		return "{\"nome\":\""+this.getNome()+
				"\",\"dataNascimento\":\""+
				this.getDataNascimento()+
				"\",\"cpf\":\""+
				this.getCpf()+
				"\",\"funcionario\":\""+
				this.isFuncionario()+"\"}";
		
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getId() + "|" + this.getNome();
	}
	
	
	
	

}
