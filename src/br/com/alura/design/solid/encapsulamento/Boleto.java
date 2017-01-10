package br.com.alura.design.solid.encapsulamento;

public class Boleto {

	public Double valor;

	public Boleto(Double valor) {
		this.valor = valor;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
}
