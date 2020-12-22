import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		double altura, alturamenor1 = 0, alturamenor2 = 0, alturamaior1 = 0, alturamaior2 = 0, contador = 0, auxiliar;
		Scanner leia = new Scanner(System.in);
		System.out.print("Informe a altura: ");
		altura = leia.nextDouble();
		alturamenor1 = altura;
		alturamaior1 = altura;
		while (altura > 0) {
			if (contador == 1) {
				alturamenor2 = altura;
				alturamaior2 = altura;
			} else {
				if ((altura < alturamenor1) && (altura < alturamenor2)) {
					auxiliar = alturamenor1;
					alturamenor1 = altura;
					alturamenor2 = auxiliar;
				} else {
					if (altura < alturamenor1) {
						auxiliar = alturamenor1;
						alturamenor1 = altura;
						alturamenor2 = auxiliar;
					} else {
						if (altura < alturamenor2) {
							alturamenor2 = altura;
						}
					}
				}
				if ((altura > alturamaior1) && (altura > alturamaior2)) {
					auxiliar = alturamaior1;
					alturamaior1 = altura;
					alturamaior2 = auxiliar;
				} else {
					if (altura > alturamaior1) {
						auxiliar = alturamaior1;
						alturamaior1 = altura;
						alturamaior2 = auxiliar;
					} else {
						if (altura > alturamaior2) {
							alturamaior2 = altura;
						}
					}
				}
			}
			System.out.print("Informe a altura: ");
			altura = leia.nextDouble();
			contador = contador + 1;
		}
		if (alturamenor1 > 0) {
			System.out.println("Maiores alturas = " + alturamaior1 + " e " + alturamaior2);
			System.out.println("Menores alturas = " + alturamenor1 + " e " + alturamenor2);
		}
		System.out.println("Programa finalizado!!!");
		leia.close();
	}
}