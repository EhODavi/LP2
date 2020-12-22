import java.util.Scanner;

class Exercicio02Antes {
	public static void main(String[] args) {
		int numero;
		int coluna;
		int linha;
		Scanner leia = new Scanner(System.in);
		System.out.println("Escolha um numero: ");
		numero = leia.nextInt();
		int[][] matriz = new int[numero][numero];
		matriz = matriz(numero);
		for (linha = 0; linha < matriz.length; linha++) {
			for (coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.print(matriz[linha][coluna] + "\t");
			}
			System.out.print("\n");
		}
		leia.close();
	}

	public static int[][] matriz(int N) {
		int linha;
		int coluna;
		int contador = N - 1;
		int contador1 = 0;
		int contador2 = 1;
		int[][] matrizGerada = new int[N][N];
		for (linha = 0; linha < N; linha++) {
			for (coluna = 0; coluna < N; coluna++) {
				if ((linha == contador1 || linha == matrizGerada.length - contador2)
						|| (coluna == contador1 || coluna == matrizGerada[linha].length - contador2)) {
					matrizGerada[linha][coluna] = matrizGerada.length - contador;
				}
			}
			contador = contador - 1;
			contador1 = contador1 + 1;
			contador2 = contador2 + 1;
		}
		return matrizGerada;
	}
}
