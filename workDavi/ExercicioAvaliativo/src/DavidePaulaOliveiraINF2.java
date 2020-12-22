import java.util.Scanner;

public class DavidePaulaOliveiraINF2 {
	public static void main(String[] args) {
		double numero = 1;
		int valor;
		Scanner leia = new Scanner(System.in);
		while (numero != 0) {
			System.out.println("Infome um numero: ");
			numero = leia.nextDouble();
			valor = chao(numero);
			System.out.println("Valor: " + valor);
		}
		System.out.println("Programa finalizado!!!");
		leia.close();
	}

	public static int chao(double numero) {
		int valor;
		int contador = 0;

		if (numero > 0) {
			contador = 0;
			while (contador <= numero) {
				contador = contador + 1;
			}
			valor = contador - 1;
		} else {
			while (contador > numero) {
				contador = contador - 1;
			}
			valor = contador;
		}
		return valor;
	}
}
