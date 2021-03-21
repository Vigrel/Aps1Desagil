package br.ecommerce.malte.vai;

public class Pedido {
	private Produto produto;
	private int quantidade;
	
	
	public Pedido(Produto produto) {
		this.produto = produto;
		this.quantidade = 1;
	}
	
	public int incrementa() {
		this.quantidade = quantidade + 1;	
		return quantidade;
	}
	
	public double total(int quantidade, Produto produto) {
		double preco_total = produto.getPreco()*quantidade;
		return preco_total;
	}
	
	public Produto getProduto() {
		return this.produto;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
}
