package br.com.caelum.tdd.frete;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.tdd.beans.Cliente;
import br.com.caelum.tdd.beans.Compra;
import br.com.caelum.tdd.beans.Estado;
import br.com.caelum.tdd.beans.Item;

public class FreteRJTest {
	
	private Frete freteRJ;
	private FreteFactory fabricaFretes;
	
	@Before
	public void setUp() {	
		fabricaFretes = new FreteFactory();
	}
	
	@Test
	public void testeCalculoFreteRJComMenosDe4Itens(){
		Cliente cliente = new Cliente("Ricardo", Estado.RJ);
		Item item1 = new Item("Iphone 4", 900, 3);			
		Compra compra = new Compra(Arrays.asList(item1), cliente);
		freteRJ = fabricaFretes.cria(compra);
		assertEquals(11.00, freteRJ.calcula(compra), 0.0001);	
	}
	
	@Test
	public void testeCalculoFreteRJCom4Itens(){
		Cliente cliente = new Cliente("Maurício", Estado.RJ);
		Item item1 = new Item("Iphone 4", 900, 3);	
		Item item2 = new Item("Macbook", 1200, 2);	
		Item item3 = new Item("TV 52 Polegadas", 3200, 1);		
		Item item4 = new Item("DVD Philips", 3200, 1);		
		Compra compra = new Compra(Arrays.asList(item1, item2, item3, item4), cliente);
		freteRJ = fabricaFretes.cria(compra);
		assertEquals(11.00, freteRJ.calcula(compra), 0.0001);	
	}
	
	@Test
	public void testeCalculoFreteRJComMaisDe4Itens(){
		Cliente cliente = new Cliente("Pedro", Estado.RJ);
		Item item1 = new Item("Iphone 4", 900, 3);	
		Item item2 = new Item("Macbook", 1200, 2);	
		Item item3 = new Item("TV 52 Polegadas", 3200, 1);		
		Item item4 = new Item("DVD Philips", 3200, 1);
		Item item5 = new Item("Microsystem Philips", 1200, 1);
		Item item6 = new Item("Geladeira", 2200, 1);
		Compra compra = new Compra(Arrays.asList(item1, item2, item3, item4, item5, item6), cliente);
		freteRJ = fabricaFretes.cria(compra);
		assertEquals(15.00, freteRJ.calcula(compra), 0.0001);	
	}
}
