package pkg.beans;

import java.util.Date;

public class Projeto {
	
	private long id;
	private String nome;
	private Date dataInicio;
	private Date dataPrevisao;
	private Date dataFim;
	private String descricao;
	private String status;
	private double orcamento;
	private String risco;
	private Pessoa gerente;
	
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
	
	public Date getDataInicio() {
		return dataInicio;
	}
	
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public Date getDataPrevisao() {
		return dataPrevisao;
	}
	
	public void setDataPrevisao(Date dataPrevisao) {
		this.dataPrevisao = dataPrevisao;
	}
	
	public Date getDataFim() {
		return dataFim;
	}
	
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public double getOrcamento() {
		return orcamento;
	}
	
	public void setOrcamento(double orcamento) {
		this.orcamento = orcamento;
	}
	
	public String getRisco() {
		return risco;
	}
	
	public void setRisco(String risco) {
		this.risco = risco;
	}
	
	public Pessoa getGerente() {
		return gerente;
	}
	
	public void setGerente(Pessoa gerente) {
		this.gerente = gerente;
	}

}
