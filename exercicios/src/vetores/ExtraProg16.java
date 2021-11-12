package vetores;

import javax.swing.*;

public class ExtraProg16 {
	public static void main(String[] args) {
		String msg = "";
		int[] idade = new int[5];
		
		// Armazenamento dos elementos do vetor
		for (int cont = 0; cont < idade.length; cont++) {
			idade[cont] = Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade do paciente " + (cont+1)));
		}
		
		// Listagem
		msg = "Listagem das idades\n:";
		for (int temp: idade) {
			msg+= temp + "\n";
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
