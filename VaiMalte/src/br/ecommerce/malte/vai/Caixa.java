package br.ecommerce.malte.vai;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	private Map<Integer, Integer> descontos;
	
	
	public Caixa() {
		this.descontos = new HashMap<Integer, Integer>();
	}

	public void insereDesconto(Produto produto, int porcentagem) {
		if (porcentagem >= 1 && porcentagem <= 99) {
			descontos.put(produto.getCodigo(),porcentagem);
		}
	}
	
	public double finalizaPedido(Carrinho carrinho) {		
		double precoTotal = 0;
		
		for (Pedido p: carrinho.getPedidos()) {
			int codigo = p.getProduto().getCodigo();
			if (descontos.containsKey(codigo)) {
				double comDesconto = p.total()*(1-(descontos.get(codigo)/(double) 100));
				precoTotal += comDesconto;
			} else {
				double preco = p.total();
				precoTotal += preco;	
			}
		}
		
		return precoTotal;
	}
}