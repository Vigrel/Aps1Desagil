package br.ecommerce.malte.vai;

public class Testador {
	public boolean testeA() {
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		
		double precoFinal = caixa.finalizaPedido(carrinho);
		if (precoFinal == 0) {
			return true;
		} else {
	    return false;
	}
}

	public boolean testeB() {
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		
		Produto produto = new Produto(1234, "RTX 3090", 22500);
		
		carrinho.insere(produto);
		
		double precoFinal = caixa.finalizaPedido(carrinho);
		if (precoFinal == 22500) {
			return true;
		} else {
	    return false;
	}
}

	public boolean testeC() {
		Carrinho carrinho = new Carrinho();
        Caixa caixa = new Caixa();
        
        Produto produto = new Produto(4567, "Bitcoin", 317011);
        
        carrinho.insere(produto);
        caixa.insereDesconto(produto, 10);
        
        double precoFinal = caixa.finalizaPedido(carrinho);
		if (precoFinal == 285309.9) {
			return true;
		} else {
	    return false;
	}
}

	public boolean testeD() {
		Carrinho carrinho = new Carrinho();
        Caixa caixa = new Caixa();
        
        Produto produto1 = new Produto(7070, "USB Killer", 200);
        Produto produto2 = new Produto(5050, "Ventilador USB", 50);
        
        carrinho.insere(produto1);
        carrinho.insere(produto2);
        carrinho.insere(produto2);
        caixa.insereDesconto(produto1, 15);
        
        double precoFinal = caixa.finalizaPedido(carrinho);
        if (precoFinal == 270) {
			return true;
		} else {
			return false;
		}
	}
  
	public boolean testeE() {
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		
		Produto produto = new Produto(8912, "Cadeira Gamer", 1299.50);
		Produto produto2 = new Produto(3456, "Alexa", 400);
		
		carrinho.insere(produto);
		carrinho.insere(produto);
		carrinho.insere(produto2);
		caixa.insereDesconto(produto, 25);
		
		double totalCarrinho = caixa.finalizaPedido(carrinho);
		if (totalCarrinho == 2349.25) {
			return true;
		} else {
			return false;
		}
	}
		    
}

