import java.util.Random;
public class Exercicio16 
{
	public static void main(String[] args)
	{
		int linha, coluna;
		int[][] matriz1 = new int[3][4];
		int[][] matriz2 = new int[3][4];
		int[][] matriz3 = new int[3][4];
		Random aleatorio =  new Random();
		
		for(linha = 0; linha < 3; linha++)
		{
			for(coluna = 0; coluna < 4; coluna++)
			{
				matriz1[linha][coluna] = aleatorio.nextInt(4);
				matriz2[linha][coluna] = aleatorio.nextInt(4);
			}
		}
		System.out.println("Matriz A:");
		for(linha = 0; linha < 3; linha++)
		{
			for(coluna = 0; coluna < 4; coluna++)
			{
				System.out.print(matriz1[linha][coluna] + "     ");
			}
			System.out.println();
		}
		System.out.println("Matriz B:");
		for(linha = 0; linha < 3; linha++)
		{
			for(coluna = 0; coluna < 4; coluna++)
			{
				System.out.print(matriz2[linha][coluna]  + "     ");
			}
			System.out.println();
		}
		matriz3 = resultado(matriz1, matriz2);
		System.out.println("Matriz C:");
		for(linha = 0; linha < 3; linha++)
		{
			for(coluna = 0; coluna < 4; coluna++)
			{
				System.out.print(matriz3[linha][coluna]  + "     ");
			}
			System.out.println();
		}
	}
	public static int[][] resultado(int[][] matrizA, int[][] matrizB)
	{
		int linha, coluna;
		int[][] matrizC = new int[3][4];
		
		for(linha = 0; linha < 3; linha++)
		{
			for(coluna = 0; coluna < 4; coluna++)
			{
				matrizC[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna];
			}
		}
		return matrizC;
	}
}
