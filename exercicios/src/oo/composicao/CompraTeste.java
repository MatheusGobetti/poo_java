package oo.composicao;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "João Pedro";
		compra1.setItem("Caneta", 20, 1.5);
		compra1.setItem("Borracha", 12, 2.0);
		compra1.setItem("Caderno", 3, 15.5);
		
		System.out.println(compra1.itens.size());
		System.out.println("O valor total da compra é: R$" + compra1.getValorTotal());
		
		// Só pra mostrar a relação bidirecional:
		double total = compra1.itens.get(0).compra.itens.get(1).compra.getValorTotal();
		System.out.println("O total é: " + total);
	}
}
