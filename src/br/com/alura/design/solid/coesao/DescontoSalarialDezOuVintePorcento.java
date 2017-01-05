package br.com.alura.design.solid.coesao;

public class DescontoSalarialDezOuVintePorcento implements DescontoSalarial{
	
	@Override
	public double calcula(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.8;
        }
        else {
            return funcionario.getSalarioBase() * 0.9;
        }
    }

}
