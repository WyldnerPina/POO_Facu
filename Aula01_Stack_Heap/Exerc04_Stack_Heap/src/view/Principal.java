package view;
/**
 * @author Wyldner
 *
 */
public class Principal {	
	// ************ TIPOS DE VARIAVEIS ************
	// DECLARANDO E INICIALIZANDO
	public static void main(String[] args) {
		//============================================================================
		// Nome da empresa com no máximo 25 caracteres.
		String nomeEmpresa;
		nomeEmpresa = ""; 
		while (nomeEmpresa.length() > 25) {
			// O Certo aqui seria qndo o cara digitar já verificar o número de caracteres
			// e caso fosse menos que 25 sairia do loop ou voltaria q perguntar gerando uma info de erro de nome maior ou excedeu o número de caracter coisa do tipo
			System.out.println(nomeEmpresa.length());
		}

		//============================================================================
		// Total de salários pagos no mês, em uma grande empresa
		float totalSalPag;
		totalSalPag = 1000000.5f;

		//============================================================================
		// Quantidade de dias de faturamento, normalmente esta informação será fixa e
		// nunca mais alterada
		short qntdadeDiasFaturamento;// mas vale a análise, se o número for pequeno daria pra usar byte
		qntdadeDiasFaturamento = 30;

		//============================================================================
		// Todas as notas de um aluno de uma disciplina
		byte[] tNotasAluno = new byte[3];
		tNotasAluno[0] = 10;
		tNotasAluno[1] = 10;
		tNotasAluno[2] = 10;

		//============================================================================
		// Todos os dados de um carro (placa, chassi, modelo, ano, cor, nome do dono)
		// que foi multado.
		Carro c = new Carro();
		c.nomeDono = "";
		c.placa = "";
		c.chassi = "";
		c.modelo = "";
		c.cor = "";
		c.ano = 2000;		

		//============================================================================
		// O número de ouro da matemática valor 1.61803...
		double numOuro;// se fosse pra arredondar serviria um float
		numOuro = 1.61803398875;

		//============================================================================
		// Os nomes dos alunos de uma turma com 10 alunos
		String[] nomesAlunos = new String[10];
		nomesAlunos[0] = "";
		nomesAlunos[1] = "";
		nomesAlunos[2] = "";
		nomesAlunos[3] = "";
		nomesAlunos[4] = "";
		nomesAlunos[5] = "";
		nomesAlunos[6] = "";
		nomesAlunos[7] = "";
		nomesAlunos[8] = "";
		nomesAlunos[9] = "";// só inicializei 

		//============================================================================
		// Quantidade de pares de tênis de um armário
		byte paresTenis;// se tiver mais de 127 interna pq tem problema
		paresTenis = 3;
	}	
}

class Carro {
	public String nomeDono;
	public String placa;
	public String chassi;
	public String modelo;	
	public String cor; 	
	public short ano;
}

		/*
		================================================================
		NOME		TIPO DE VALOR		MEMO		RANGE
		================================================================
		boolean			logico			1 bit 		true ou false
		----------------------------------------------------------------
		byte			inteiro			1 byte 		-128 a 127
		short			inteiro			2 byte 		-32.768 a 32.767
		int				inteiro			4 byte 		-2.147.483.648 e 2.147.483.647
		long			inteiro			8 byte 		-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 
		----------------------------------------------------------------
		float			flutuante		1 byte 		
		double			flutuante		1 byte 		 
		----------------------------------------------------------------
		char			texto			1 byte 		0 a 65535 (todos char)
		String*			texto			1 byte 		não primitivo
		================================================================		
		*/
