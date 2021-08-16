package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.90);
		var p2 = new Produto("Caneta Preta", 1.50);
		
		
		System.out.println("Nome: " + p1.nome);
		System.out.println("Nome: " + p2.nome);
		
		System.out.println("Pre�o: " + p1.preco);
		System.out.println("Pre�o: " + p2.preco);
		
		double precoComDesconto1 = p1.preco - (p1.preco * Produto.desconto);
		double precoComDesconto2 = p2.preco - (p2.preco * Produto.desconto);
		
		System.out.println("Pre�o com desconto: " + precoComDesconto1);
		System.out.println("Pre�o com desconto: " + precoComDesconto2);
		
		Produto.desconto = 0.5;
		
		// C�digo melhorando com a POO (ap�s altera��o do desconto):
		System.out.println("Utilizando um m�todo (Produto 1): " + p1.precoComDesconto());
		
	}
}
