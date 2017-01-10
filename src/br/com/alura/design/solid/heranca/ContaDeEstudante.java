package br.com.alura.design.solid.heranca;

public class ContaDeEstudante{

	private ManipuladorDeSaldo m;

	public ContaDeEstudante() {
		m = new ManipuladorDeSaldo(0.0);
	}

	public void deposita(double valor) {
		m.deposita(valor);
	}

	public double getSaldo() {
		return m.getSaldo();
	}

	public void rende() {
		m.rende(1.0);
	}
	
}
