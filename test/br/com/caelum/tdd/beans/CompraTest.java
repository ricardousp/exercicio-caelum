package br.com.caelum.tdd.beans;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompraTest {
	
	private Compra compra;	
	
	@Before
	public void setUp() {	
		Cliente cliente = new Cliente("Maurício", Estado.SP);
		Item item1 = new Item("Iphone 4", 900, 3);	
		Item item2 = new Item("Macbook", 1200, 2);	
		Item item3 = new Item("TV 52 Polegadas", 3200, 1);		
		compra = new Compra(Arrays.asList(item1, item2, item3), cliente);	
	}
	
	@Test
	public void testeGetValor(){
		assertEquals(8300.00, compra.getValor(), 0.0001);
	}
	
}
