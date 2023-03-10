package model;
/*
_________________
| GUARDA-ROUPA	|
|_______________|	
|+ portas		|
|+ altura		|
|+ profundidade	|
|+ material		|
|+ gavetas		|
|+ isCheio		|
|+ isAberto		|
|+ isMontado	|
|_______________|
|+ isCheio()	|
|+ isAberto()	|
|+ isMontado()	|
|_______________|
*/
public class GuardaRoupa {
	public byte portas;
	public float altura;
	public float profudidade;
	public String material;
	public byte gavetas;
	public boolean isCheio;
	public boolean isAberto;
	public boolean isMontado;
	
//	===================================================================================
	
	public GuardaRoupa(int portas, float altura, float profudidade, String material, int gavetas) {
		this.portas = (byte) portas;
		this.altura = altura;
		this.profudidade = profudidade;
		this.material = material;
		this.gavetas = (byte) gavetas;
		
		this.isAberto = false;
		this.isCheio = true;
		this.isMontado = true;
	}
	
//	===================================================================================	
	
	public void isCheio() {
		if (isCheio) {
			isCheio = false;
		} else {
			isCheio = true;
		}
	}	
	

	public void isAberto() {
		if (isAberto) {
			isAberto = false;
		} else {
			isAberto = true;
		}
	}
	
	public void isMontado() {
		if (isMontado) {
			isMontado = false;
		} else {
			isMontado = true;
		}
	}
	
//	===================================================================================

	@Override
	public String toString() {
		return "GuardaRoupa [portas=" + portas + ", altura=" + altura + ", profudidade=" + profudidade + ", material="
				+ material + ", gavetas=" + gavetas + ", isCheio=" + isCheio + ", isAberto=" + isAberto + ", isMontado="
				+ isMontado + "]";
	}
}
