package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.90);
		var p2 = new Produto("Caneta Preta", 1.50);
		
		
		System.out.println("Nome: " + p1.nome);
		System.out.println("Nome: " + p2.nome);
		
		System.out.println("Preço: " + p1.preco);
		System.out.println("Preço: " + p2.preco);
		
		double precoComDesconto1 = p1.preco - (p1.preco * Produto.desconto);
		double precoComDesconto2 = p2.preco - (p2.preco * Produto.desconto);
		
		System.out.println("Preço com desconto: " + precoComDesconto1);
		System.out.println("Preço com desconto: " + precoComDesconto2);
		
		Produto.desconto = 0.5;
		
		// Código melhorando com a POO (após alteração do desconto):
		System.out.println("Utilizando um método (Produto 1): " + p1.precoComDesconto());
		
	}
}
