package br.com.caelum.tdd.frete;

import br.com.caelum.tdd.beans.Compra;

public class FreteOutros implements Frete{

	@Override
	public double calcula(Compra compra) {
		return 25.00;
	}

}
