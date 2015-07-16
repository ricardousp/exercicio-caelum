package br.com.caelum.tdd.beans;

import java.util.List;

public class Compra {
	
	private List<Item> itens;
	private Cliente cliente;		
	
	public Compra(List<Item> itens, Cliente cliente) {
		super();
		this.itens = itens;
		this.cliente = cliente;	
	}
	
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
		double valor = 0.0;
		for(int i = 0; i < itens.size(); i++){
			valor += itens.get(i).getPreco() * itens.get(i).getQuantidade();
		}
		return valor;
	}
				
}
