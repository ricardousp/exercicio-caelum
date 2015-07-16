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
	public void testeCalculoFinalFreteSPAte3ItensEDescontoEntre501E2000(){
		Cliente cliente = new Cliente("Ricardo", Estado.SP);
		Item item1 = new Item("Iphone 4", 900, 1);			
		Compra compra = new Compra(Arrays.asList(item1), cliente);
		// Valor do produto = 900
		// Valor do frete = 10 (Até 3 itens)
		// Valor do desconto (Valor do produto * percentual de desconto) = (900 * 0.10)
		assertEquals((900 + 10 - (900 * 0.10)), calculoFinal.calcula(compra), 0.0001);
	}
	
	@Test
	public void testeCalculoFinalFreteSPCom3ItensEDescontoAcimaDe2000(){
		Cliente cliente = new Cliente("Mauricio", Estado.SP);
		Item item1 = new Item("Iphone 4", 900, 3);	
		Item item2 = new Item("Macbook", 1200, 2);	
		Item item3 = new Item("TV 52 Polegadas", 3200, 1);	
		Compra compra = new Compra(Arrays.asList(item1, item2, item3), cliente);
		// Valor total de todos os produtos -> 900*3 + 1200*2 + 3200*1 = 8300
		// Valor do frete = 10 (Até 3 itens)
		// Valor do desconto (Valor do produto * percentual de desconto) = (8300 * 0.15)
		assertEquals((8300 + 10 - (8300 * 0.15)), calculoFinal.calcula(compra), 0.0001);
	}
	
	@Test
	public void testeCalculoFinalFreteSPComMaisDe3ItensEDescontoAcimaDe2000(){
		Cliente cliente = new Cliente("Pedro", Estado.SP);
		Item item1 = new Item("Iphone 4", 900, 1);	
		Item item2 = new Item("Macbook", 1300, 1);	
		Item item3 = new Item("TV 30 Polegadas", 1100, 1);	
		Item item4 = new Item("DVD Philips", 175, 1);	
		Compra compra = new Compra(Arrays.asList(item1, item2, item3, item4), cliente);
		assertEquals((3475 + 17 - (3475 * 0.15)), calculoFinal.calcula(compra), 0.0001);
	}
	
	
}
