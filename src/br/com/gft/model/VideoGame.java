package br.com.gft.model;

import br.gft.com.interfaces.Impostos;

public class VideoGame extends Produto implements Impostos {
	private String marca;
	private String modelo;
	private boolean isUsado;

	public VideoGame(String nome, double preço, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preço, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	public VideoGame() {

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public double calculaImposto() {
		double imp;
		if (isUsado == true) {
			imp = this.getPreço() * 0.25;
			System.out.println("imposto " + this.getMarca() + " " + this.getModelo() + "usado R$ " + imp);
		} else {
			imp = this.getPreço() * 0.45;
			System.out.println("imposto " + this.getMarca() + " " + this.getModelo() + "usado R$ " + imp);

		}
		return imp;
	}

}
