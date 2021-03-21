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
		
		return 0.0;
	}
}