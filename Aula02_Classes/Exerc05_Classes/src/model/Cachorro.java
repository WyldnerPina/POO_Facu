package model;
/*
_________________
|	CACHORRO	|
|_______________|
|- raça			|	
|- nome			|
|- peso			|
|- idade		|
|- humor		|
|_______________|
|+ comer()		|
|+ crescer()	|
|+ brincar()	|
|_______________|
*/
public class Cachorro {	
	private String raça;
	private String nome;
	private float peso;
	private byte idade;
	private String humor;
	
//	===================================================================================
	
	public Cachorro(String raça, String nome, float peso, int idade) {
		this.raça = raça;
		this.nome = nome;
		this.peso = peso;
		this.idade = (byte) idade;
		this.humor = "bom";
	}

//	===================================================================================
	
	public void comer() {
		System.out.println("comer aumenta peso, muda humor e faz crescer");		
		crescer();
	}
	
	public void crescer() {
		setHumor("ótimo");
		setPeso(getPeso() + 2);
		setIdade((byte) (getIdade() + 1));
	}
	
	public void brincar() {
		System.out.println("brincar altera peso, humor");
		setHumor("Bobão");
		setPeso(getPeso() - 3);
	}
	
//	===================================================================================

	public final String getRaça() {
		return raça;
	}

	public final void setRaça(String raça) {
		this.raça = raça;
	}

	public final String getNome() {
		return nome;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}

	public final float getPeso() {
		return peso;
	}

	public final void setPeso(float peso) {
		this.peso = peso;
	}

	public final byte getIdade() {
		return idade;
	}

	public final void setIdade(byte idade) {
		this.idade = idade;
	}

	public final String getHumor() {
		return humor;
	}

	public final void setHumor(String humor) {
		this.humor = humor;
	}
	
//	===================================================================================

	@Override
	public String toString() {
		return "Cachorro [raça=" + raça + ", nome=" + nome + ", peso=" + peso + ", idade=" + idade + ", humor="
				+ humor + "]";
	}
}
