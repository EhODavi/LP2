import java.util.Scanner;

public class Exercicio18 
{
	public static void main(String[] args)
	{
		int linha, coluna;
		boolean logico;
		int[][] matriz = new int[3][3];
		Scanner leia = new Scanner(System.in);
		
		for(linha = 0; linha < matriz.length; linha++)
		{
			for(coluna = 0; coluna < matriz[linha].length; coluna++)
			{
				System.out.println("Informe um número para ser preenchido na matriz:");
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		System.out.println("Matriz:");
		for(linha = 0; linha < matriz.length; linha++)
		{
			for(coluna = 0; coluna < matriz[linha].length; coluna++)
			{
				System.out.print(matriz[linha][coluna] + "     ");
			}
			System.out.println();
		}
		logico = permutacao(matriz);
		if(logico == true)
		{
			System.out.println("A matriz é de permutação.");
		}
		else
		{
			System.out.println("A matriz não é de permutação.");
		}
		leia.close();
	}
	public static boolean permutacao(int[][] matrizA)
	{
		int linha, coluna, contador;
		
		for(linha = 0; linha < matrizA.length; linha++)
		{
			contador = 0;
			for(coluna = 0; coluna < matrizA[linha].length; coluna++)
			{
				if(matrizA[linha][coluna] == 1)
				{
					contador = contador + 1;
				} 
				else if(matrizA[linha][coluna] != 0)
				{
					return false;
				}
			}
			if(contador != 1)
			{
				return false;
			}
		}
		for(coluna = 0; coluna < matrizA[0].length; coluna++)
		{
			contador = 0;
			for(linha = 0; linha < matrizA.length; linha++)
			{
				if(matrizA[linha][coluna] == 1)
				{
					contador = contador + 1;
				}
				else if(matrizA[linha][coluna] != 0)
				{
					return false;
				}
			}
			if(contador != 1)
			{
				return false;
			}
		}
		return true;
	}
}
