package br.com.caelum.tdd.exercicio6;

public class CalculoFinal {
	
	private FreteFactory fabricaFretes;
	private DescontoFactory fabricaDesconto;

	public CalculoFinal(FreteFactory fabricaFretes, DescontoFactory fabricaDesconto){
		this.fabricaFretes = fabricaFretes;
		this.fabricaDesconto = fabricaDesconto;
	}	

	public double calcula(Compra compra){
		double valorCompra = compra.getValor();
		double ValorFrete = fabricaFretes.cria(compra).calcula(compra);
		double ValorDesconto = fabricaDesconto.cria(compra).calcula(compra);
		return valorCompra + ValorFrete - ValorDesconto;
	}

}
