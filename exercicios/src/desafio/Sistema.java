package desafio;

public class Sistema {
	
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("Notebook", 4120.60), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 15.5, 10);
		compra2.adicionarItem(new Produto("Impressora", 750.5), 1);
		
		Cliente cliente = new Cliente("Matheus Gobetti Silva");
		cliente.adicionarCompra(compra1);
		cliente.adicionarCompra(compra2);
		
		System.out.println(cliente.obterValorTotal());
	}
}
