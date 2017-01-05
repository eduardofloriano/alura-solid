package br.com.alura.design.solid.acoplamento;import java.util.ArrayList;
import java.util.List;

public class GeradorDeNotaFiscal {

	private List<AcaoAposGerarNotaFiscal> listaAcaoAposGerarNotaFiscal;
	
	public GeradorDeNotaFiscal(List<AcaoAposGerarNotaFiscal> lista) {
		listaAcaoAposGerarNotaFiscal = lista;
	}
	
	public GeradorDeNotaFiscal(){
		this.listaAcaoAposGerarNotaFiscal = new ArrayList<AcaoAposGerarNotaFiscal>();
	}

	public void adicionaAcaoAposGerarNota(AcaoAposGerarNotaFiscal acao){
		this.listaAcaoAposGerarNotaFiscal.add(acao);
	}
	
	public NotaFiscal gera(Fatura fatura) {

		double valor = fatura.getValorMensal();

		NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

		for(AcaoAposGerarNotaFiscal acao : listaAcaoAposGerarNotaFiscal){
			acao.executa(nf);
		}
		
		return nf;
	}

	private double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}
}
