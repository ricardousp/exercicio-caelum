package br.com.caelum.tdd.exercicio6;

public class DescontoCompraMenorIgual500 implements Desconto{
		
	@Override
	public double calcula(Compra compra) {		
		return compra.getValor()*1.05;
	}

}
