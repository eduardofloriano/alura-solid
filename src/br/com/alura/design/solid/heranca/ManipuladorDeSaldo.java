package br.com.alura.design.solid.heranca;

public class ManipuladorDeSaldo {

	private double saldo;
	
	public ManipuladorDeSaldo(double valorSaldo){
		this.saldo = valorSaldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void rende(double valor) {
		this.saldo *= valor;
	}

}
