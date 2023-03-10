package model;

public class Caixa {
	private double saldo;

// =======================================================================	
	public Caixa() {
		this.saldo = 100.0;
	}
	
// =======================================================================
	public void venda(double valorProduto) {
			this.saldo = this.saldo + valorProduto;
			System.out.println("valor: " + this.saldo);
			
	}
	
// =======================================================================
	public void venda(double... valorProduto) {
		for(double cada: valorProduto) {
			cada = cada + this.saldo;
			System.out.println("valor: " + cada);
		}
	}	
	
// =======================================================================
	@Override
	public String toString() {
		return "Caixa [Saldo=" + saldo + "]";
	}
}
