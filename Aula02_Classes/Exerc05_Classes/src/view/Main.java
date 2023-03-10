package view;

import javax.swing.JOptionPane;

import model.Cachorro;
import model.GuardaRoupa;
import model.Pessoa;

public class Main {

	public static void main(String[] args) {
		char estilizar = 'a';
		char customizar = 'a';
		
//	========================================================================================
		
		Pessoa p1 = new Pessoa();
		System.out.println(p1);
		System.out.println("===================================================================================================");
		
		p1.nome = JOptionPane.showInputDialog("insira um nome");
		p1.altura = 1.70f;
		p1.peso = 70f;
		p1.sexo = "masc";
		p1.idade = 30;
		System.out.println(p1);
		System.out.println("===================================================================================================");
		
		p1.comer();
		p1.crescer();
		p1.trabalhando();
		System.out.println(p1);
		System.out.println("===================================================================================================");
		
		Pessoa p2 = new Pessoa();
		System.out.println(p2);
		System.out.println("===================================================================================================");
		
		p2.nome = JOptionPane.showInputDialog("insira um nome");
		p2.altura = 1.65f;
		p2.peso = 65f;
		p2.sexo = "fem";
		p2.idade = 23;
		System.out.println(p2);
		System.out.println("===================================================================================================");
		
		p2.comer();
		p2.crescer();
		p2.trabalhando();
		System.out.println(p2);
		System.out.println("===================================================================================================");

//	========================================================================================

		GuardaRoupa g1 = new GuardaRoupa(5, 1.85f, 0.5f, "madeira", 5);
		System.out.println(g1);
		System.out.println("===================================================================================================");
		
		while(customizar != 'y' || customizar != 'n'){
			customizar = JOptionPane.showInputDialog("Deseja Customizar? \n [y / n]").toLowerCase().charAt(0);
			if(customizar == 'y') {
				customizarGR(g1);
				break;
			}else if(customizar == 'n'){
				break;
			}
		}
		
		GuardaRoupa g2 = new GuardaRoupa(4, 1.90f, 0.45f, "compensado", 4);
		System.out.println(g2);
		System.out.println("===================================================================================================");
				
//	========================================================================================

		Cachorro c1 = new Cachorro("Beagle", "marrom", 30.0f, 4);
		System.out.println(c1);
		System.out.println("===================================================================================================");
		
		
		while(estilizar != 'y' || estilizar != 'n') {
			estilizar = JOptionPane.showInputDialog("Deseja estilizar o dog? \n [y / n]").toLowerCase().charAt(0);			
			if(estilizar == 'y') {
				Cachorro c2 = new Cachorro(null, null, 0.0f, 0);
				estilizarDog(c2);
				break;
			}else if(estilizar == 'n'){
				break;			
			}
		}		
	}
	
//	========================================================================================
//	========================================================================================
//	========================================================================================	

	public static void customizarGR(GuardaRoupa g) {
		byte senha = 0;
		
		JOptionPane.showMessageDialog(null, "Ajude-nos a customizar seu guarda-roupa");
		
		
		
		while(senha != 9) {
			JOptionPane.showMessageDialog(null, "seu guarda roupa está:"
					+ "\n • Aberto: " + g.isAberto + "\n • Cheio: " + g.isCheio + "\n • Montado: " + g.isMontado);
			senha = questoes();
			
			switch(senha) {
			case 1:
				g.isAberto();
				break;
			case 2:
				g.isCheio();
				break;
			case 3:
				g.isMontado();
				break;
			}
			
			if(g.isAberto && !g.isCheio && !g.isMontado) {
				g.gavetas =  Byte.parseByte(JOptionPane.showInputDialog("Quantas gavetas vc quer?"));
				g.portas =  Byte.parseByte(JOptionPane.showInputDialog("Quantas portas?"));
				senha = 9;
			}
		}
		
		
		System.out.println(g);
		System.out.println("===================================================================================================");
	}
	
	
	
	
	private static byte questoes() {
		byte s = 0;
		s = Byte.parseByte(JOptionPane.showInputDialog("O que fazer?\n"
				+ " 1 - Abrir/Fechar?\n"
				+ " 2 - Encher/Esvaziar?\n"
				+ " 3 - Montar/Desmontar?\n"
				+ " 9 - Desisto =/"));
		return s;
	}
	
//	========================================================================================
//	========================================================================================
//	========================================================================================

	public static void estilizarDog(Cachorro c) {
		byte sair = 0;
		
		c.setRaça(JOptionPane.showInputDialog("Digite a raça do seu Dog"));
		c.setNome(JOptionPane.showInputDialog("Digite o nome do seu Dog"));		
		c.setIdade(Byte.parseByte(JOptionPane.showInputDialog("Digite a idade do seu Dog")));
		c.setPeso(Float.parseFloat(JOptionPane.showInputDialog("Digite o peso do seu Dog")));
		
		System.out.println(c);
		System.out.println("===================================================================================================");
		
		
		
		while(sair != 9) {
			sair = Byte.parseByte(JOptionPane.showInputDialog("O que deseja fazer?\n"
					+ " 1 - Alimentar\n"
					+ " 2 - Brincar\n"					
					+ " 9 - Sair"));
			
			switch(sair) {
			case 1:
				c.comer();
				break;
			case 2:
				c.brincar();
				break;
			case 9:
				System.err.println("===========================================================================================");
				break;
			default:
				System.out.println("Use os números do menu");
			}
			
		}
		
		c.crescer();
		System.out.println(c);
		System.out.println("===================================================================================================");
	}
}


/*
	double  --> Double.parseDouble(String);
	float   --> Float.parseFloat(String);
	long    --> Long.parseLong(String);
	int     --> Integer.parseInt(String);
	char    --> stringGoesHere.charAt(int position);
	short   --> Short.parseShort(String);
	byte    --> Byte.parseByte(String);
	boolean --> Boolean.parseBoolean(String); 
 */
