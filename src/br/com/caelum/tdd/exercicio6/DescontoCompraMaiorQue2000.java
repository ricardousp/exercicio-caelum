package br.com.caelum.tdd.exercicio6;

public class DescontoCompraMaiorQue2000 implements Desconto{

	@Override
	public double calcula(Compra compra) {		
		return compra.getValor()*1.15;
	}

}
