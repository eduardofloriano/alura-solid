package br.com.alura.design.solid.heranca;

import java.util.List;

public class ProcessadorDeInvestimentos {

	  public static void main(String[] args) {

	        for (ContaComum conta : contasDoBanco()) {
	            conta.rende();

	            System.out.println("Novo Saldo:");
	            System.out.println(conta.getSaldo());
	        }
	    }

	private static List<ContaComum> contasDoBanco() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
