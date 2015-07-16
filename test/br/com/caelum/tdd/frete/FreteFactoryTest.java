package br.com.caelum.tdd.frete;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.hamcrest.CoreMatchers.instanceOf;
import br.com.caelum.tdd.beans.Cliente;
import br.com.caelum.tdd.beans.Compra;
import br.com.caelum.tdd.beans.Estado;
import br.com.caelum.tdd.beans.Item;

public class FreteFactoryTest {
	
	private FreteFactory fabricaFretes;
	
	@Before
	public void setUp() {
		fabricaFretes = new FreteFactory();
	}
	
	// Caso precisasse testar a exceção NullPointerException, precisaria usar algum assert dentro do meu teste???
	@Test(expected=NullPointerException.class)
	public void testeFreteFactoryEstadoNull(){		
		Frete frete = fabricaFretes.cria(null);
		//fail(frete);
	}
		
	@Test
	public void testeFreteFactoryEstadoSP(){
		Cliente cliente = new Cliente("Ricardo", Estado.SP);
		Item item1 = new Item("Iphone 4", 900, 1);			
		Compra compra = new Compra(Arrays.asList(item1), cliente);
		Frete frete = fabricaFretes.cria(compra);
		assertThat(frete, instanceOf(FreteSP.class));
	}
	
	@Test
	public void testeFreteFactoryEstadoRJ(){
		
	}
	
	@Test
	public void testeFreteFactoryEstadoSUL(){
		
	}
	
	@Test
	public void testeFreteFactoryEstadoOutros(){
		
	}
	
	
}
