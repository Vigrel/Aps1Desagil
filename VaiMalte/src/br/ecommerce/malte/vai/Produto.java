package br.ecommerce.malte.vai;

public class Produto {
	private int codigo;
	private String nome;
	private double preco;
	
	public Produto(int codigo, String nome, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
}
