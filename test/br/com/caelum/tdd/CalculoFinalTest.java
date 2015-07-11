package br.com.caelum.tdd;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

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
	public void testeCalculoFinalFreteSPAte3Itens(){
		Cliente cliente = new Cliente("Ricardo", Estado.SP);
		Item item1 = new Item("Iphone 4", 900, 1);			
		Compra compra = new Compra(Arrays.asList(item1), cliente, item1.getPreco());
		assertEquals((900+10-(900*0.10)), calculoFinal.calcula(compra), 0.0001);
	}
	
	@Test
	public void testeCalculoFinalFreteSPCom3Itens(){
		Cliente cliente = new Cliente("Mauricio", Estado.SP);
		Item item1 = new Item("Iphone 4", 900, 3);	
		Item item2 = new Item("Macbook", 1200, 2);	
		Item item3 = new Item("TV 52 Polegadas", 3200, 1);	
		Compra compra = new Compra(Arrays.asList(item1, item2, item3), cliente, item1.getPreco());
		assertEquals((900+10-(900*0.10)), calculoFinal.calcula(compra), 0.0001);
	}
	
	
}
