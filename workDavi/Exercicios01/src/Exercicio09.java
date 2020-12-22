import java.util.Scanner;

public class Exercicio09 
{
	public static void main(String[] args)
	{
		int numero, fatorial;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe um número para ser calculado o fatorial: ");
		numero = leia.nextInt();
		fatorial = fat(numero);
		System.out.print("O fatorial é: " + fatorial);
		leia.close();
	}
	public static int fat(int num)
	{
		int contador, fatorial = 1;
		if(num % 2 != 0)
		{
			for(contador = 1; contador <= num; contador = contador + 2)
			{
				fatorial = contador * fatorial;
			}
		}
		else
		{
			for(contador = 1; contador < num; contador = contador + 2)
			{
				fatorial = contador * fatorial;
			}
		}
		
		return fatorial;
	}
}
