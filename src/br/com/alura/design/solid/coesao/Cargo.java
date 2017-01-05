package br.com.alura.design.solid.coesao;

public enum Cargo {

	DESENVOLVERDOR (new DescontoSalarialDezOuVintePorcento()),
	DBA (new DescontoSalarialQuinzeOuVinteCincoPorcento()),
	TESTER (new DescontoSalarialQuinzeOuVinteCincoPorcento());
	
	DescontoSalarial desconto;
	
	private Cargo(DescontoSalarial desconto){
		this.desconto = desconto;
	}
	
	public DescontoSalarial getRegraDescontoSalarial(){
		return desconto;
	}
	
}
