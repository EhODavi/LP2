import java.util.Scanner;
import java.util.Random;

class Caminhao {
	int numeroCaminhao;
	int numeroCidades;
	int[] cidades = new int[6];
}

public class Exercicio3 {
	public static void main(String[] args) {
		Caminhao volk = new Caminhao();
		int[] cities = new int[10];
		int[][] matrizCity = new int[10][10];
		int linha;
		int coluna;
		int numeroC;
		int distancia = 0;
		Random aleatorio = new Random();
		Scanner leia = new Scanner(System.in);

		System.out.println("Caminh�o: ");
		System.out.println("Informe o numero do caminh�o: ");
		volk.numeroCaminhao = leia.nextInt();
		System.out.println("Informe o numero de cidades (n <= 6): ");
		volk.numeroCidades = leia.nextInt();
		for (linha = 0; linha < volk.numeroCidades; linha++) {
			System.out.println("Informe a cidade: ");
			volk.cidades[linha] = leia.nextInt();
		}

		for (linha = 0; linha < cities.length; linha++) {
			cities[linha] = aleatorio.nextInt(100);
		}
		for (linha = 0; linha < matrizCity.length; linha++) {
			for (coluna = 0; coluna < matrizCity[linha].length; coluna++) {
				matrizCity[linha][coluna] = cities[linha] - cities[coluna];
			}
		}
		System.out.println(
				"\t\tCidade0\tCidade1\tCidade2\tCidade3\tCidade4\tCidade5\tCidade6\tCidade7\tCidade8\tCidade9");
		for (linha = 0; linha < matrizCity.length; linha++) {
			System.out.print("Cidade " + linha + "\t");
			for (coluna = 0; coluna < matrizCity[linha].length; coluna++) {
				if (matrizCity[linha][coluna] < 0) {
					matrizCity[linha][coluna] = matrizCity[linha][coluna] * -1;
					System.out.print(matrizCity[linha][coluna] + "\t");
				} else {
					System.out.print(matrizCity[linha][coluna] + "\t");
				}
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.println("Informe o numero do caminh�o: ");
		numeroC = leia.nextInt();
		if (numeroC == volk.numeroCaminhao) {
			System.out.println("Distancia percorrida por ele:");
			for (linha = 0; linha < volk.numeroCidades - 1; linha++) {
				if (linha != volk.numeroCaminhao - 1) {
					distancia = distancia + matrizCity[volk.cidades[linha]][volk.cidades[linha + 1]];
				} else {
					distancia = distancia + matrizCity[volk.cidades[linha]][volk.cidades[linha]];
				}
			}
		}
		System.out.println(distancia);
		leia.close();
	}
}
