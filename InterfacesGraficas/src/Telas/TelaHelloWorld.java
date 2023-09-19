package Telas;

import javax.swing.JOptionPane;



public class TelaHelloWorld {
	public static void main(String[] args) {
		System.out.println("Usando JOptionPane");
		
		
		String resposta;
		resposta = JOptionPane.showInputDialog("Qual é o seu nome? ");
		
		JOptionPane.showMessageDialog(null, "Olá, " + resposta + "! É um prazer conhcê-lo(a) " );
	}
}
