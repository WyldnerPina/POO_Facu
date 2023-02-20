package view;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		double a;
		double b;
		double r;
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Insira um número:"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Insira um número:"));
		r = a + b;
		
		JOptionPane.showMessageDialog(null, String.format("Resultado = %.2f", r));	
		System.out.printf("%.2f", r);
		//******************* CASAS DECIMAIS FORMATO ******************* 
	}

}
