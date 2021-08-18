package desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	final List<Item> itens = new ArrayList<>();
	
	public void adicionarItem(Produto p, int qtd) {
		this.itens.add(new Item(p, qtd));
	}
	
	public void adicionarItem(String nome, double preco, int qtd) {
		this.itens.add(new Item(new Produto(nome, preco), qtd));
	}
	
	public double obterValorTotal() {
		double total = 0;
		
		// Class List  Object
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
}
