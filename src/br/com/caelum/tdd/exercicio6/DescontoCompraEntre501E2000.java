package br.com.caelum.tdd.exercicio6;

public class DescontoCompraEntre501E2000 implements Desconto{

	@Override
	public double calcula(Compra compra) {		
		return compra.getValor()*1.10;
	}

}
