package br.com.caelum.tdd.desconto;

import br.com.caelum.tdd.Compra;

public class DescontoFactory {

	public Desconto cria(Compra compra) {

		if (compra == null) {
			return null;
		} else if (compra.getValor() <= 500) {
			return new DescontoCompraMenorIgual500();
		} else if (compra.getValor() >= 501 && compra.getValor() <= 2000) {
			return new DescontoCompraEntre501E2000();
		} else if (compra.getValor() > 2000) {
			return new DescontoCompraMaiorQue2000();
		} 
		
		return null;

	}
	
}
