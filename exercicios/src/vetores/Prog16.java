package vetores;

import javax.swing.*;

public class Prog16 {
	public static void main(String[] args) {
		String msg = "";
		double[] nota = {7.9, 5.8, 5.4, 10.0, 4.4, 8.9, 5.5, 8.7};
		float media = 0;
		
		// Foreach
		for (double item: nota) {
			media += item;
		}
		
		media /= 8;
		msg = "Media: " + media;
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
