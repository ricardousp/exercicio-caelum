package br.com.caelum.tdd.exercicio6;

public class FreteOutros implements Frete{

	@Override
	public double calcula(Compra compra) {
		return 25.00;
	}

}
