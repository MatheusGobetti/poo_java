package desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.3);
		Comida c2 = new Comida("Feijão", 0.6);
		
		Pessoa p1 = new Pessoa("Matheus", 55);
		
		System.out.println(p1.apresentar());
		
		p1.comer(c1);
		System.out.println("Depois de comer " + c1.nomeComida + " eu fiquei com " + p1.pesoPessoa + " kgs");
		
		p1.comer(c2);
		System.out.println("Depois de comer " + c2.nomeComida + " eu fiquei com " + p1.pesoPessoa + " kgs");
		
		System.out.println(p1.apresentar());
	}
}
