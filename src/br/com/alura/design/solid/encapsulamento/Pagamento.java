package br.com.alura.design.solid.encapsulamento;

public class Pagamento {

	
	private Double valor;
	private MeioDePagamento meioDePagamento;
	
	
	public Pagamento(Double valor, MeioDePagamento meioDePagamento) {
		this.valor = valor;
		this.meioDePagamento = meioDePagamento;
	}
	
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public MeioDePagamento getMeioDePagamento() {
		return meioDePagamento;
	}
	public void setMeioDePagamento(MeioDePagamento meioDePagamento) {
		this.meioDePagamento = meioDePagamento;
	}
	
	
}
