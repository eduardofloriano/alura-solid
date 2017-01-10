package br.com.alura.design.solid.encapsulamento;

import java.util.List;

public class Fatura {

	private List<Pagamento> pagamentos;
	private Double valor;
	private boolean pago;

	public Fatura() {
	}

	public Fatura(List<Pagamento> pagamentos, Double valor) {
		this.pagamentos = pagamentos;
		this.valor = valor;
	}

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public void adicionaPagamento(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
	}

	public boolean isPago(){
		return this.pago;
	}
	public void processaPagamento() {
		double total = 0;
		for (Pagamento pagamento : pagamentos) {
			total += pagamento.getValor();
			if (total >= this.valor) {
				this.pago = true;
			}
		}

	}

}
