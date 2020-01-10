package br.com.gft.model;

import java.util.List;

public class Loja {
	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {

		this.nome = nome;
		this.cnpj = cnpj;
		Livros = livros;
		VideoGames = videoGames;
	}

	public Loja() {

	}

	public void listaLivros() {

	}

	public void listaVideoGames() {

	}

	public double calculaPatrimonio() {
		return 0;

	}

	private String nome;
	private String cnpj;
	private List<Livro> Livros;
	private List<VideoGame> VideoGames;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return Livros;
	}

	public void setLivros(List<Livro> livros) {
		Livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return VideoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		VideoGames = videoGames;
	}

}
