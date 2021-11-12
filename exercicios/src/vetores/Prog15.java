package vetores;
	import javax.swing.*;
	
	public class Prog15 {
		public static void main (String args[]) {
			
			int nr = 0;
			String msg = "";
			// String[] nome = {null, "terça"};
			
			String[] nome = new String[7];
			nome[0] = "Domingo";
			nome[1] = "Segunda";
			nome[2] = "Terça";
			nome[3] = "Quarta";
			nome[4] = "Quinta";
			nome[5] = "Sexta";
			nome[6] = "Sábado";
			
			nr = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Informe o nr do dia (0-6):")
			);
		
			if (nr < 0 || nr > 6) {
				msg = "Entre um valor de 0 a 6";
			} else {
				msg = nome[nr];
			}
			JOptionPane.showMessageDialog(null, msg);
	}
}
