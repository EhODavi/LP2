
import java.util.Scanner;

// Registro Aluno - Tipo definido pelo usuario 
// armazena dados de 1 aluno
class Aluno2 {
	long matricula; // campo do registro
	String nome;
	// double media;
	Endereco end = new Endereco();
	double[] notas = new double[5];
}

class Endereco {
	String logradouro;
	int numero;
	String cidade;
	String uf;
}

public class Registro03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// Aluno a = null;
		//
		// a.matricula = 1;
		// a.nome = "Joao";
		// a.media = 7;

		System.out.println("Quantos alunos?");
		int numAlunos = scn.nextInt();

		Aluno[] alunos = new Aluno[numAlunos];
		double media = 0;
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Aluno " + i + " -----");
			alunos[i] = new Aluno();
			System.out.print("Matricula: ");
			alunos[i].matricula = scn.nextLong();
			System.out.print("Nome: ");
			alunos[i].nome = scn.next();
			
//			alunos[i].end = new Endereco();
			System.out.print("Logradouro: ");
			alunos[i].end.logradouro = scn.next();
			System.out.print("Número: ");
			alunos[i].end.numero = scn.nextInt();

			for (int j = 0; j < 5; j++) {
				System.out.print("Nota " + j + ": ");
				alunos[i].notas[j] = scn.nextDouble();
			}

			media = media + calculaMedia(alunos[i]);

		}
		media = media / alunos.length;
		System.out.println("Média: " + media);

		System.out.println("Alunos acima da media da turma");
		for (int i = 0; i < alunos.length; i++) {
			if (calculaMedia(alunos[i]) > media) {
				System.out.println(alunos[i].nome);
			}
		}

	}

	static double calculaMedia(Aluno a) {
		double media = 0;
		for (int j = 0; j < 5; j++) {
			media = media + a.notas[j];
		}
		return media / 5;

	}
}
