package vetores;

import javax.swing.*;

public class Prog17 {
	public static void main(String[] args) {
		String msg = "";
		String[][] agenda = {
				{"Carla Diniz", "Peterson Silva", "Sandra Oliveira"},
				{"10/05/2013", "03/08/2013", "05/09/2013"}
		};
		
		// Alterando a data de agendamento da Carla
		agenda[1][0] = JOptionPane.showInputDialog(null, "Entre com a nova data de agendamento");
		JOptionPane.showMessageDialog(null, agenda[1][0]);
		
		// Listagem
		for (int lin = 0; lin < agenda[1].length; lin++) {
			for (int col = 0; col < agenda.length; col++) {
				msg += agenda[col][lin] + " ";
			}
			msg += "\n";
		}
		
		JOptionPane.showMessageDialog(null, msg);
		
	}
}
