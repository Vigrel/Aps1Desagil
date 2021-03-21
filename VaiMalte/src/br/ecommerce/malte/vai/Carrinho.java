package br.ecommerce.malte.vai;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Pedido> pedidos;
	
	public Carrinho() {
		this.pedidos = new ArrayList<Pedido>();
	}
	
	public void insere(Produto produto) {
		for (Pedido compra: pedidos) {
			if (pedidos.contains(compra)) {
				compra.incrementa();
			} 
			else {
				pedidos.add(new Pedido(produto));			
			}
		}	
	}
	
	public List<Pedido> getPedidos() {
		return this.pedidos;
	}	
}
