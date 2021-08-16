package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		int a = 2;
		int b = a; // Atribuição por valor (Tipo primitivo)
		
		System.out.println(" a: " + a + " | " + " b: " + b);
		
		a++;
		
		System.out.println(" a: " + a + " | " + " b: " + b);
		
		b--;
		
		System.out.println(" a: " + a + " | " + " b: " + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // Atribuição por referência (Objeto)
		
		d1.dia = 31;
		d2.mes = 7;
		d2.ano = 2025;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
}
