package desafio;

public class Pessoa {
	
	String nomePessoa;
	double pesoPessoa;
	
	Pessoa(String nome, double peso) {
		nomePessoa = nome;
		pesoPessoa = peso;
	}
	
	public void comer(Comida comida) {
		if (comida != null) {
			pesoPessoa += comida.pesoComida;
		}
	}
	
	public String apresentar() {
		return "Olá, eu sou o " + nomePessoa + " e tenho " + pesoPessoa + " kgs";
	}
}
