package br.com.alura.design.solid.dip;

public class CalculadoraDePrecos {

	
	private TabelaDePreco tabelaDePreco;
	private TabelaDeFrete tabelaDeFrete;

	public CalculadoraDePrecos(TabelaDePreco tabelaDePreco, TabelaDeFrete tabelaDeFrete){
		this.tabelaDePreco = tabelaDePreco;
		this.tabelaDeFrete = tabelaDeFrete;
		
	}
	
	public double calcula(Compra produto) {

		double desconto = tabelaDePreco.aplicaDesconto(produto.getValor());
		double frete = tabelaDeFrete.aplicaFrete(produto.getCidade());

		return produto.getValor() * (1 - desconto) + frete;
	}
}
