package br.com.alura.design.solid.coesao;

public class CalculadoraDeSalario {
    
	public double calcula(Funcionario funcionario) {
		return funcionario.getCargo().getRegraDescontoSalarial().calcula(funcionario);
    }


}