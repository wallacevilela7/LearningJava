package Telas;

import javax.swing.JOptionPane;

public class Divisao {
	public static void main(String[] args) {
		String resp;
		double n1, n2, result;
		
		resp = JOptionPane.showInputDialog("Digite o primeiro numero");
		n1 = Integer.parseInt(resp);
		
		resp = JOptionPane.showInputDialog("Digite o segundo numero");
		n2 = Integer.parseInt(resp);
		
		
		result = n1 / n2;
		
		JOptionPane.showMessageDialog(null, "O valor de " + n1 + 
				" divido por " + n2 + " é : " + result);
	}
}
