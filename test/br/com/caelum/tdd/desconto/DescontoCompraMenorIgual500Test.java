package br.com.caelum.tdd.desconto;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.tdd.beans.Cliente;
import br.com.caelum.tdd.beans.Compra;
import br.com.caelum.tdd.beans.Estado;
import br.com.caelum.tdd.beans.Item;

public class DescontoCompraMenorIgual500Test {
	
	private Desconto desconto;
	private DescontoFactory fabricaDescontos;
	
	@Before
	public void setUp() {	
		fabricaDescontos = new DescontoFactory();
	}
	
	@Test
	public void testeCalculoDescontoCompraMenorQue500(){
		Cliente cliente = new Cliente("Ricardo", Estado.SP);
		Item item1 = new Item("Fogao", 300, 1);			
		Item item2 = new Item("Mochila", 100, 1);
		Compra compra = new Compra(Arrays.asList(item1, item2), cliente);	
		desconto = fabricaDescontos.cria(compra);
		assertEquals(400 * 0.05, desconto.calcula(compra), 0.0001);
	}
	
	@Test
	public void testeCalculoDescontoCompraIgual500(){
		Cliente cliente = new Cliente("Maurício", Estado.SP);
		Item item1 = new Item("Sofa", 400, 1);			
		Item item2 = new Item("Carteira de Couro", 100, 1);
		Compra compra = new Compra(Arrays.asList(item1, item2), cliente);	
		desconto = fabricaDescontos.cria(compra);
		assertEquals(500 * 0.05, desconto.calcula(compra), 0.0001);
	}
}
