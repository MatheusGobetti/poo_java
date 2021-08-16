package oo.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		
		Carro car1 = new Carro();
		System.out.println("Antes da ignição... Está ligado? - " + car1.estaLigado());
		
		car1.ligar();
		System.out.println("Após ignição... Está ligado? - " + car1.estaLigado());
		
		System.out.println("Antes de acelerar... Giro do motor: " + car1.motor.giros());
		
		car1.acelerar();
		car1.acelerar();
		car1.acelerar();
		car1.acelerar();
		
		System.out.println("Após 4 acelerações... Giro do motor: " + car1.motor.giros());
		
		car1.frear();
		car1.frear();
		car1.frear();
		car1.frear();
		
		System.out.println("Após frear 4 vezes... Giro do motor: " + car1.motor.giros());
		
		car1.frear();
		car1.frear();
		car1.frear();
		car1.frear();
		
		// Faltou Encapsulamento!
		// car1.motor.fatorInjecao = -30;
		
		System.out.println("Após frear 8 vezes... Giro do motor: " + car1.motor.giros());
		
		// Relação bidirecional
		System.out.println(car1.motor.carro.motor.carro.motor.giros());
	}
}
