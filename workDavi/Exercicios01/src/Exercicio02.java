import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {

		double altura, alturamenor, alturamaior;
		Scanner leia = new Scanner(System.in);
		System.out.print("Informe a altura: ");
		altura = leia.nextDouble();
		alturamenor = altura;
		alturamaior = altura;

		while (altura > 0) {
			if (altura < alturamenor) {
				alturamenor = altura;
			} else if (altura > alturamaior) {
				alturamaior = altura;
			}
			System.out.print("Informe a altura: ");
			altura = leia.nextDouble();
		}
		if (alturamenor > 0) {
			System.out.println("Maior altura = " + alturamaior);
			System.out.println("Menor altura = " + alturamenor);
		}
		System.out.println("Programa finalizado!!!");
		leia.close();
	}
}