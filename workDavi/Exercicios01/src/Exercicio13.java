import java.util.Random;
import java.util.Scanner;

public class Exercicio13 
{
	public static void main(String[] args)
	{
		int aleatorio1, contador, numero;
		boolean logico = false;
		Scanner leia = new Scanner(System.in);
		Random aleatorio = new Random();
		aleatorio1 = aleatorio.nextInt(11);
		int[] vetor = new int[aleatorio1];
		
		System.out.println("Vetor:");
		for(contador = 0; contador < vetor.length; contador++)
		{
			vetor[contador] = aleatorio.nextInt(101);
			System.out.println(vetor[contador]);
		}
		System.out.print("Informe um número que você deseje encontrar no vetor: ");
		numero = leia.nextInt();
		contador = 0;
		while((logico == false) && (contador < vetor.length))
		{
			if(numero == vetor[contador])
			{
				logico = true;
				System.out.print("O número informado está na posição: " + contador);
			}
			contador = contador + 1;
		}
		if(logico == false)
		{
			System.out.print("O número informado não foi encontrado.");
		}
		leia.close();
	}
}
