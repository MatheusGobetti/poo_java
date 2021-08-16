package oo.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		
		Carro car1 = new Carro();
		System.out.println("Antes da igni��o... Est� ligado? - " + car1.estaLigado());
		
		car1.ligar();
		System.out.println("Ap�s igni��o... Est� ligado? - " + car1.estaLigado());
		
		System.out.println("Antes de acelerar... Giro do motor: " + car1.motor.giros());
		
		car1.acelerar();
		car1.acelerar();
		car1.acelerar();
		car1.acelerar();
		
		System.out.println("Ap�s 4 acelera��es... Giro do motor: " + car1.motor.giros());
		
		car1.frear();
		car1.frear();
		car1.frear();
		car1.frear();
		
		System.out.println("Ap�s frear 4 vezes... Giro do motor: " + car1.motor.giros());
		
		car1.frear();
		car1.frear();
		car1.frear();
		car1.frear();
		
		// Faltou Encapsulamento!
		// car1.motor.fatorInjecao = -30;
		
		System.out.println("Ap�s frear 8 vezes... Giro do motor: " + car1.motor.giros());
		
		// Rela��o bidirecional
		System.out.println(car1.motor.carro.motor.carro.motor.giros());
	}
}
