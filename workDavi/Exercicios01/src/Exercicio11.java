import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		int fatorialprimo, numero;
		Scanner leia = new Scanner(System.in);

		System.out.print("Informe um numero: ");
		numero = leia.nextInt();
		fatorialprimo = fatprimo(numero);
		System.out.print("O fatorial do número é: " + fatorialprimo);
		leia.close();
	}

	public static int fatprimo(int num) {
		int contador = 0, contador1, contador2 = num, contador3, numprimo = 1, fatorial = 1;

		for (contador1 = num; contador1 > 1; contador1--) {
			contador = 0;
			for (contador3 = 1; contador3 <= contador2; contador3++) {
				if (contador2 % contador3 == 0) {
					contador = contador + 1;
				}
			}
			if (contador == 2) {
				numprimo = contador2;
				fatorial = numprimo * fatorial;
			}
			contador2 = contador2 - 1;
		}
		return fatorial;
	}
}