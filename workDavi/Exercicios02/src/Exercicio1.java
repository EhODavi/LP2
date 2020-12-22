import java.util.Scanner;

class Aluno {
	String nome;
	double idade;
	String endereco;
	String Dtinscricao;
	String DtCarta;
}

public class Exercicio1 {
	public static void main(String[] args) {
		int contador;
		double menorIdade = 0;
		int posicao = 0;

		Aluno[] alunos = new Aluno[2];
		Scanner leia = new Scanner(System.in);

		for (contador = 0; contador < alunos.length; contador++) {
			alunos[contador] = new Aluno();
			System.out.println("Informe o nome do aluno: ");
			alunos[contador].nome = leia.next();
			System.out.println("Informe a data da carta do aluno: ");
			alunos[contador].DtCarta = leia.next();
			System.out.println("Informe a data de inscrição do aluno: ");
			alunos[contador].Dtinscricao = leia.next();
			System.out.println("Informe a idade do aluno: ");
			alunos[contador].idade = leia.nextDouble();
			System.out.println("Informe o endereço do aluno: ");
			alunos[contador].endereco = leia.next();
		}
		for (contador = 0; contador < alunos.length; contador++) {
			if (contador == 0) {
				menorIdade = alunos[contador].idade;
			} else if (menorIdade > alunos[contador].idade) {
				menorIdade = alunos[contador].idade;
				posicao = contador;
			}
		}
		System.out.println("Aluno mais novo que pertence ou pertenceu a Auto-Escola:");
		System.out.println("Nome do aluno: " + alunos[posicao].nome);
		System.out.println("Idade do aluno: " + alunos[posicao].idade);
		System.out.println("Endereço do aluno: " + alunos[posicao].endereco);
		System.out.println("Data de Inscrição do aluno: " + alunos[posicao].Dtinscricao);
		System.out.println("Data da carta: " + alunos[posicao].DtCarta);
		leia.close();
	}
}
