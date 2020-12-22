import java.util.Random;

public class Exercicio17 //Como descobrir o tamanho da matriz
{
	public static void main(String[] args)
	{
		int linha, coluna;
		Random aleatorio =  new Random();
		int[][] matriz1 = new int[4][4];
		int[][] matriz2 = new int[4][5];
		
		for(linha = 0; linha < 4; linha++)
		{
			for(coluna = 0; coluna < 4; coluna++)
			{
				matriz1[linha][coluna] = aleatorio.nextInt(10);
			}
		}
		System.out.println("Matriz original:");
		for(linha = 0; linha < 4; linha++)
		{
			for(coluna = 0; coluna < 4; coluna++)
			{
				System.out.print(matriz1[linha][coluna] + "     ");
			}
			System.out.println();
		}
		matriz2 = resultado(matriz1);
		System.out.println("Matriz multiplicada:");
		for(linha = 0; linha < 4; linha++)
		{
			for(coluna = 0; coluna < 5; coluna++)
			{
				System.out.print(matriz2[linha][coluna]  + "     ");
			}
			System.out.println();
		}
	}
	public static int[][] resultado(int[][] matrizA)
	{
		int linha, coluna, resultado;
		int[][] matrizB = new int[4][5];
		
		for(linha = 0; linha < 4; linha++)
		{
			resultado = 1;
			for(coluna = 0; coluna < 4; coluna++)
			{
				resultado = resultado * matrizA[linha][coluna];
				matrizB[linha][coluna] = matrizA[linha][coluna];
			}
			matrizB[linha][4] = resultado;
		}
		return matrizB;
	}
}