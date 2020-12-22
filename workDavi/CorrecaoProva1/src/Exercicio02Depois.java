import java.util.Scanner;

class Exercicio02Depois {
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
		int contador = 0;
		int[][] matriz = new int[N][N];
		while (contador < matriz.length) {
			for (int i = contador; i < matriz.length - contador; i++) {
				for (int j = contador; j < matriz[0].length - contador; j++) {
					matriz[i][j] = contador + 1;
				}
			}
			contador++;
		}
		return matriz;
	}
}
