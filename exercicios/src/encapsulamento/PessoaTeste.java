package encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Matheus", "Gobetti", -30); // Informa idade
		
		System.out.println(p1.getIdade()); // ler
		
		p1.setIdade(240); // alterar
		System.out.println(p1.getIdade()); // ler
		
		System.out.println(p1); // toString
		
		System.out.println(p1.getNomeCompleto()); // Nome Completo
	}
}
