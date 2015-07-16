package br.com.caelum.tdd.desconto;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.tdd.beans.Cliente;
import br.com.caelum.tdd.beans.Compra;
import br.com.caelum.tdd.beans.Estado;
import br.com.caelum.tdd.beans.Item;

public class DescontoCompraMaiorQue2000Test {
	
	private Desconto desconto;
	private DescontoFactory fabricaDescontos;
	
	@Before
	public void setUp() {	
		fabricaDescontos = new DescontoFactory();
	}
	
	@Test
	public void testeCalculoDescontoCompraMaiorQue2000(){
		Cliente cliente = new Cliente("Maurício", Estado.SP);
		Item item1 = new Item("Iphone 4", 800, 1);	
		Item item2 = new Item("Macbook", 1200, 1);	
		Item item3 = new Item("TV 52 Polegadas", 3000, 1);		
		Compra compra = new Compra(Arrays.asList(item1, item2, item3), cliente);
		desconto = fabricaDescontos.cria(compra);
		assertEquals(5000 * 0.15, desconto.calcula(compra), 0.0001);
	}
	
}
