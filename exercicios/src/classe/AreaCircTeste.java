package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc ar = new AreaCirc(5.6);
		AreaCirc ar2 = new AreaCirc();
		
		ar2.raio = 10;
		
		System.out.println(ar.calculaArea());
		System.out.println(AreaCirc.PI);
		System.out.println(ar2.calculaArea());
	}
}
