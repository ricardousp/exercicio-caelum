package br.com.caelum.tdd.exercicio6;

public class FreteSP implements Frete {

	@Override
	public double calcula(Compra compra) {
		if (compra.getItens().size() <= 3) {
			return 10.00;
		} else
			return 17.00;
	}

}
