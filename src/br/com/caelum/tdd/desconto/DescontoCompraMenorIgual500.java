package br.com.caelum.tdd.desconto;

import br.com.caelum.tdd.Compra;

public class DescontoCompraMenorIgual500 implements Desconto{
		
	@Override
	public double calcula(Compra compra) {		
		return compra.getValor()*0.05;
	}

}
