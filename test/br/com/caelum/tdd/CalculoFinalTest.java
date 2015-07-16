package br.com.caelum.tdd;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.tdd.beans.Cliente;
import br.com.caelum.tdd.beans.Compra;
import br.com.caelum.tdd.beans.Estado;
import br.com.caelum.tdd.beans.Item;
import br.com.caelum.tdd.desconto.DescontoFactory;
import br.com.caelum.tdd.frete.FreteFactory;
import static org.junit.Assert.assertEquals;

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
	public void testeCalculoFinalDeUmaCompra(){
		Cliente cliente = new Cliente("Ricardo", Estado.SP);
		Item item1 = new Item("Iphone 4", 800, 1);	
		Item item2 = new Item("Macbook", 1200, 1);			
		Compra compra = new Compra(Arrays.asList(item1, item2), cliente);
		// Valor total dos produtos = 2000
		// Valor do frete = 10 (Até 3 itens)
		// Valor do desconto (Valor do produto * percentual de desconto) = (2000 * 0.10)
		assertEquals((2000 + 10 - (2000 * 0.10)), calculoFinal.calcula(compra), 0.0001);
	}
	
}
