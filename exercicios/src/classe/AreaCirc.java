package classe;

public class AreaCirc {
	
	double raio;
	
	// Final é constante
	static final double PI = 3.14;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	AreaCirc() {
		
	}
	
	double calculaArea() {
		return PI * (raio * raio);
	}

}
