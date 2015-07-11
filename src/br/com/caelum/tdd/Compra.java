package br.com.caelum.tdd;

import java.util.List;

public class Compra {
	
	private List<Item> itens;
	private Cliente cliente;
	private double valor;		
	
	public Compra(List<Item> itens, Cliente cliente, double valor) {
		super();
		this.itens = itens;
		this.cliente = cliente;
		this.valor = valor;
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
		for(int i = 0; i < itens.size(); i++){
			valor += itens.get(i).getPreco() * itens.get(i).getQuantidade();
		}
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}			
	
}
