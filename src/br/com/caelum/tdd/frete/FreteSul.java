package br.com.caelum.tdd.frete;

import br.com.caelum.tdd.Compra;

public class FreteSul implements Frete{

	@Override
	public double calcula(Compra compra) {		
		return 22.00;
	}

}
