package br.ecommerce.malte.vai;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Pedido> pedidos;
	
	public Carrinho() {
		this.pedidos = new ArrayList<Pedido>();
	}
	
	public void insere(Produto produto) {
		for (Pedido p: pedidos) {
			if (pedidos.contains(p)) {
				p.incrementa();
				return;
			}
		}
		pedidos.add(new Pedido(produto));			
			
	}	
	
	
	public List<Pedido> getPedidos() {
		return this.pedidos;
	}	
}
