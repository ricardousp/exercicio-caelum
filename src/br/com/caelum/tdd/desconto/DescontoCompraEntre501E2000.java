package br.com.caelum.tdd.desconto;

import br.com.caelum.tdd.Compra;

public class DescontoCompraEntre501E2000 implements Desconto{

	@Override
	public double calcula(Compra compra) {		
		return compra.getValor()*1.10;
	}

}
