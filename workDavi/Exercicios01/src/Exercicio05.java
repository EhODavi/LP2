import java.util.Scanner;

public class Exercicio05 
{
	public static void main(String[] args)
	{
		double media;
		int num1 = 0, contador = 0, acumulador = 0;
		Scanner leia = new Scanner(System.in);
		
		while(num1 != -1)
		{
			System.out.print("Informe um n�mero: ");
			num1 = leia.nextInt();
			if((num1 % 2 == 0) && (num1 > 0))
			{
				acumulador = acumulador + num1;
				contador = contador + 1;
			}
		}
		media = acumulador / contador;
		System.out.print("A m�dia dos n�meros inteiros positivos pares �: " + media);
		leia.close();
	}
}
