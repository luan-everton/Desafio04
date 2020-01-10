package br.com.gft.model;

import br.gft.com.interfaces.Impostos;

public class Livro extends Produto implements Impostos {
	private String autor;
	private String tema;
	private int qtdPag;

	public Livro(String nome, double preço, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preço, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}

	public Livro() {

	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	@Override
	public double calculaImposto() {
		double imp;
		if (tema.equals("educativo")) {
			imp = 0;
			System.out.println("Livro educativo não tem imposto " + this.getNome());
		} else {
			imp = this.getPreço() * 0.10;
			System.out.println("R$" + this.getPreço() + " de impostos sobre o livro " + this.getNome());

		}
		return imp;
	}

}
