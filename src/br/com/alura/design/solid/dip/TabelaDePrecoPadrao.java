package br.com.alura.design.solid.dip;

public class TabelaDePrecoPadrao implements TabelaDePreco {
	
	@Override
	public double aplicaDesconto(double valor) {
		if (valor > 5000)
			return 0.03;
		if (valor > 1000)
			return 0.05;
		return 0;
	}
}
