package desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	final String nome;
	final List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	public void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	public double obterValorTotal() {
		double total = 0;
		
		for(Compra compra: compras) {
			total += compra.obterValorTotal();
		}
		
		return total;
	}
	
}
