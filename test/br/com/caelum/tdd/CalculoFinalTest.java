package br.com.caelum.tdd;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.tdd.desconto.DescontoFactory;
import br.com.caelum.tdd.frete.FreteFactory;

public class CalculoFinalTest {

	private CalculoFinal calculoFinal;
	private FreteFactory fabricaFretes;
	private DescontoFactory fabricaDesconto;
	
	@Before
	public void setUp() {
		fabricaFretes = new FreteFactory();
		fabricaDesconto = new DescontoFactory();
		calculoFinal = new CalculoFinal(fabricaFretes, fabricaDesconto);
	}
	
	@Test
	public void testeCalculoFinal(){
//		Compra compra = new Compra();
//		Cliente cliente = new Cliente();
	}
	
	
}
