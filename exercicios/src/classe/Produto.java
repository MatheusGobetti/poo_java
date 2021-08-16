package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nomeAlterado, double precoAlterado) {
		preco = precoAlterado;
		nome = nomeAlterado;
	}
	
	
	public double precoComDesconto() {
		
		double precoFinal = preco - (preco * desconto);
		return precoFinal;
	}
	
}
