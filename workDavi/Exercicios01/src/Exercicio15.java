import java.util.Random;

public class Exercicio15 {
	public static void main(String[] args) {
		int tamanho1, tamanho2, contador, verificador = 0;
		Random aleatorio = new Random();
		tamanho1 = aleatorio.nextInt(5);
		tamanho2 = aleatorio.nextInt(5);
		int[] vetor1 = new int[tamanho1];
		int[] vetor2 = new int[tamanho2];
		int[] vetor3 = new int[tamanho1 + tamanho2];

		System.out.println("Vetor A:");
		for (contador = 0; contador < vetor1.length; contador++) {
			if (contador == 0) {
				vetor1[contador] = aleatorio.nextInt(20);
			} else {
				vetor1[contador] = aleatorio.nextInt(20);
				while (vetor1[contador] < vetor1[contador - 1]) {
					vetor1[contador] = aleatorio.nextInt(20);
				}
			}
			System.out.println(vetor1[contador]);
		}
		System.out.println("Vetor B:");
		for (contador = 0; contador < vetor2.length; contador++) {
			if (contador == 0) {
				vetor2[contador] = aleatorio.nextInt(20);
			} else {
				vetor2[contador] = aleatorio.nextInt(20);
				while (vetor2[contador] < vetor2[contador - 1]) {
					vetor2[contador] = aleatorio.nextInt(20);
				}
			}
			System.out.println(vetor2[contador]);
		}
		vetor3 = intercalacao(vetor1, vetor2);
		for (contador = 0; contador < vetor3.length; contador++) {
			if (vetor3[contador] == 0) {
				verificador = verificador + 1;
			}
		}
		if (verificador == vetor3.length) {
			System.out.println("O vetor A ou o vetor B não foram ordenados corretamente.");
		} else {
			System.out.println("Vetor C:");
			for (contador = 0; contador < vetor3.length; contador++) {
				System.out.println(vetor3[contador]);
			}
		}
	}

	public static int[] intercalacao(int[] vetorA, int[] vetorB) {
		int contador, contador1, auxiliar;
		boolean ordenamento = true;
		int[] vetorC = new int[vetorA.length + vetorB.length];

		for (contador = 0; contador < vetorA.length - 1; contador++) {
			for (contador1 = contador + 1; contador1 < vetorA.length - 1; contador1++)
				;
			{
				if (vetorA[contador] > vetorA[contador1]) {
					ordenamento = false;
				}
			}
		}
		for (contador = 0; contador < vetorB.length - 1; contador++) {
			for (contador1 = contador + 1; contador1 < vetorB.length - 1; contador1++)
				;
			{
				if (vetorB[contador] > vetorB[contador1]) {
					ordenamento = false;
				}
			}
		}
		if (ordenamento == true) {
			for (contador = 0; contador < vetorA.length; contador++) {
				vetorC[contador] = vetorA[contador];
			}
			for (contador = 0; contador < vetorB.length; contador++) {
				vetorC[vetorA.length + contador] = vetorB[contador];
			}
			for (contador = 0; contador < vetorC.length - 1; contador++) {
				for (contador1 = contador + 1; contador1 < vetorC.length - 1; contador1++)
					;
				{
					if (vetorC[contador] > vetorC[contador1]) {
						auxiliar = vetorC[contador1];
						vetorC[contador1] = vetorC[contador];
						vetorC[contador] = auxiliar;
					}
				}
			}
		}
		return vetorC;
	}
}
