import java.util.Scanner;

public class Exercicio07 
{
	public static void main(String[] args)
	{
		int num1, fatorial = 1, contador;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		num1 = leia.nextInt();
		for(contador = num1; contador > 0; contador--)
		{
			fatorial = contador * fatorial;
		}
		System.out.print("O fatorial do n�mero �: " + fatorial);
		leia.close();
	}
}
