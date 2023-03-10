package view;

import model.Caixa;

public class Main {

	public static void main(String[] args) {
		Caixa c = new Caixa();
		System.out.println(c);

		c.venda(1000.0);
		System.out.println("======================================================");
		// =============================================================================

		Caixa c2 = new Caixa();
		System.out.println(c2);

		c2.venda(2000.0, 5000.0, 300.0, 800.0);
		System.out.println("======================================================");
	}
}