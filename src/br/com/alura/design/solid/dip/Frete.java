package br.com.alura.design.solid.dip;

public class Frete implements TabelaDeFrete {
	
	@Override
	public double aplicaFrete(String cidade) {
		if ("SAO PAULO".equals(cidade.toUpperCase())) {
			return 15;
		}
		return 30;
	}

}
