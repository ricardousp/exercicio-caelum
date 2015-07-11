package br.com.caelum.tdd;

import java.util.List;

public class Compra {
	
	private List<Item> itens;
	private Cliente cliente;
	private double valor;
	
	public List<Item> getItens() {
		return itens;
	}
	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}			
	
}
