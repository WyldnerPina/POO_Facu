package model;

public class Caixa {
	private double saldo;

// =======================================================================	
	public Caixa() {
		this.saldo = 100.0;//chumbei pra diminuir o código
	}
	
// =======================================================================
	public double venda(double valorProduto) {
			return this.saldo + valorProduto;			
	}
	
// =======================================================================
	public double venda(double... valorProduto) {
		double total = 0;
		for(double cada: valorProduto) {
			cada = cada + this.saldo;
			System.out.println("valor: " + cada);
			total = total + cada;
		}
		return total;// baseado no primeiro, mantive um retorno.
	}	
	
// =======================================================================
	@Override
	public String toString() {
		return "Caixa [Saldo=" + saldo + "]";
	}
}
