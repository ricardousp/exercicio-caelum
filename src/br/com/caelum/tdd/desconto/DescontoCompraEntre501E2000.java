package br.com.caelum.tdd.desconto;

import br.com.caelum.tdd.beans.Compra;

public class DescontoCompraEntre501E2000 implements Desconto{

	@Override
	public double calcula(Compra compra) {		
		return compra.getValor()*0.10;
	}

}
