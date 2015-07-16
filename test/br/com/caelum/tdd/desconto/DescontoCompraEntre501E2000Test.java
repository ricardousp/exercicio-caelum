package br.com.caelum.tdd.desconto;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.tdd.beans.Cliente;
import br.com.caelum.tdd.beans.Compra;
import br.com.caelum.tdd.beans.Estado;
import br.com.caelum.tdd.beans.Item;

public class DescontoCompraEntre501E2000Test {
	
	private Desconto desconto;
	private DescontoFactory fabricaDescontos;
	
	@Before
	public void setUp() {	
		fabricaDescontos = new DescontoFactory();
	}
	
	@Test
	public void testeCalculoDescontoCompraIgualA501(){
		Cliente cliente = new Cliente("Maurício", Estado.SP);
		Item item1 = new Item("Celular Moto G", 498, 1);	
		// 3 Barras de Chocolates de R$1,00
		Item item2 = new Item("Chocolate Lacta", 1, 3);	
		Compra compra = new Compra(Arrays.asList(item1, item2), cliente);	
		desconto = fabricaDescontos.cria(compra);
		assertEquals(501 * 0.10, desconto.calcula(compra), 0.0001);
	}
	
	@Test
	public void testeCalculoDescontoCompraEntre501E2000(){
		Cliente cliente = new Cliente("Ricardo", Estado.SP);
		Item item1 = new Item("Iphone 4", 800, 1);	
		Item item2 = new Item("Macbook", 1000, 1);	
		Compra compra = new Compra(Arrays.asList(item1, item2), cliente);	
		desconto = fabricaDescontos.cria(compra);
		assertEquals(1800 * 0.10, desconto.calcula(compra), 0.0001);
	}
	
	@Test
	public void testeCalculoDescontoCompraIgualA2000(){
		Cliente cliente = new Cliente("Pedro", Estado.SP);
		Item item1 = new Item("Iphone 4", 1000, 1);	
		Item item2 = new Item("Ipad Air", 1000, 1);	
		Compra compra = new Compra(Arrays.asList(item1, item2), cliente);	
		desconto = fabricaDescontos.cria(compra);
		assertEquals(2000 * 0.10, desconto.calcula(compra), 0.0001);
	}
	
}
