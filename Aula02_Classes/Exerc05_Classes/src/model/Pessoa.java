package model;
/*
_________________
|	PESSOA		|
|_______________|	
|+ nome			|
|+ sexo			|
|+ peso			|
|+ altura		|
|+ idade		|
|_______________|
|+ comer()		|
|+ crescer()	|
|+ trabalhando()|
|_______________|
*/
public class Pessoa {
	public String nome;
	public String sexo;
	public float peso;
	public float altura;
	public byte idade;
//	===================================================================================
	
	public void comer() {
		System.out.println("comer aumenta peso");
		this.peso = peso + 10;
		System.out.println("-----------------------------------");
	}
	
	public void crescer() {
		System.out.println("crescer aumenta idade, altera peso e às vezes altura");
		this.idade = idade++;
		this.peso = peso + 3;
		this.altura = altura + 0.10f;
		System.out.println("-----------------------------------");
	}
	
	public void trabalhando() {
		System.out.println("trabalhando altera peso");
		this.peso = peso - 5;
		System.out.println("-----------------------------------");
	}
	
//	===================================================================================

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", peso=" + peso + "kg, altura=" + altura + "m, idade=" + idade
				+ "]";
	}
}