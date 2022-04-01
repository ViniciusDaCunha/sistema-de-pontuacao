package entities;

public class Funcionário {

	private String nome;
	private Integer independencia;
	private Integer produtividade;
	private Integer pontualidade;
	private Integer regrasConv;
	private Integer regrasCasa;
	private Integer soma;

	public Funcionário() {
	}

	public Funcionário(String nome, Integer independencia, Integer produtividade, Integer pontualidade,
			Integer regrasConv, Integer regrasCasa, Integer soma) {
		this.nome = nome;
		this.independencia = independencia;
		this.produtividade = produtividade;
		this.pontualidade = pontualidade;
		this.regrasConv = regrasConv;
		this.regrasCasa = regrasCasa;
		this.soma = soma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIndependencia() {
		return independencia;
	}

	public void setIndependencia(Integer independencia) {
		this.independencia = independencia;
	}

	public Integer getProdutividade() {
		return produtividade;
	}

	public void setProdutividade(Integer produtividade) {
		this.produtividade = produtividade;
	}

	public Integer getPontualidade() {
		return pontualidade;
	}

	public void setPontualidade(Integer pontualidade) {
		this.pontualidade = pontualidade;
	}

	public Integer getRegrasConv() {
		return regrasConv;
	}

	public void setRegrasConv(Integer regrasConv) {
		this.regrasConv = regrasConv;
	}

	public Integer getRegrasCasa() {
		return regrasCasa;
	}

	public void setRegrasCasa(Integer regrasCasa) {
		this.regrasCasa = regrasCasa;
	}

	public Integer getSoma() {
		return soma;
	}

	public void setSoma(Integer soma) {
		this.soma = soma;
	}

	public Integer somaBonificacao() {
		return soma += independencia + produtividade + pontualidade + regrasConv + regrasCasa;
	}

	public String toString() {
		return "Funcionário: " + nome + ", " + "pontuação: " + soma;
	}
	
}

