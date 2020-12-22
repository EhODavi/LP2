import java.util.Scanner;

class TestaParDeDados {
	public static void main(String[] args) {
		ParDeDados d1 = new ParDeDados();
		Scanner leia = new Scanner(System.in);
		int posicao1;
		int posicao2;
		int numero;
		int contador = 0;
		for (int i = 0; i < d1.dado1.length; i++) {
			d1.dado1[i] = i + 1;
			d1.dado2[i] = i + 1;
		}
		System.out.println("Informe o numero de vezes para rolar os dados:");
		numero = leia.nextInt();
		for (int i = 0; i < numero; i++) {
			posicao1 = d1.rolarDado1();
			posicao2 = d1.rolarDado2();
			if(posicao1 == 6) {
				contador++;
			}
			if(posicao2 == 6) {
				contador++;
			}
		}
		System.out.println("O numero 6 apareceu: " + contador + " vezes!");
		leia.close();
	}
}
