package br.com.gft.model;

public abstract class Produto {
	private String nome;
	private double pre�o;
	private int qtd;

	public Produto() {

	}

	public Produto(String nome, double pre�o, int qtd) {

		this.nome = nome;
		this.pre�o = pre�o;
		this.qtd = qtd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

}
