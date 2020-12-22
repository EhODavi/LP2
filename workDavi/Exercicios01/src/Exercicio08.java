import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		int numeroA, numeroB, resultado;
		Scanner leia = new Scanner(System.in);

		System.out.print("Informe o primeiro número: ");
		numeroA = leia.nextInt();
		System.out.print("Informe o segundo número: ");
		numeroB = leia.nextInt();
		resultado = mdc(numeroA, numeroB);
		System.out.print(resultado);
		leia.close();
	}

	public static int mdc(int num1, int num2) {
		while (num1 != num2) {
			if (num1 > num2) {
				num1 = num1 - num2;
			} else {
				int auxiliar = num1;
				num1 = num2;
				num2 = auxiliar;
			}
		}
		return num1;
	}
}