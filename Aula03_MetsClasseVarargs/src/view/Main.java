package view;

import model.Caixa;

public class Main {

	public static void main(String[] args) {
		double cc;
		Caixa c = new Caixa();
		System.out.println(c);

		cc = c.venda(1000.0);
		System.out.println("Saldo final " + cc);// fiz assim pq está pedindo pra retornar um valor e não apresentar lá no método
		System.out.println("======================================================");
		// =============================================================================

		Caixa c2 = new Caixa();
		System.out.println(c2);

		cc = c2.venda(2000.0, 5000.0, 300.0, 800.0);
		System.out.println("Saldo final " + cc);
		System.out.println("======================================================");
	}
}