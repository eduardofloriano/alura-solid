package br.com.alura.design.solid.acoplamento;

public class NotaFiscalDao implements AcaoAposGerarNotaFiscal {
	
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("salva nf no banco");
	}
}
