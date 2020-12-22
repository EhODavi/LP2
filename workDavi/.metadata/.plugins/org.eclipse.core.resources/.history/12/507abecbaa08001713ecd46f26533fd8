import java.util.Random;

public class Exercicio14 
{
	public static void main(String[] args)
	{
		int contador;
		int[] vetor = new int[10];
		Random aleatorio = new Random();
		
		System.out.println("Vetor antes da inversão:");
		for(contador = 0; contador < vetor.length; contador++)
		{
			vetor[contador] = aleatorio.nextInt(20);
			System.out.println(vetor[contador]);
		}
		inversao(vetor);
		
		System.out.println("Vetor depois da inversão:");
		for(contador = 0; contador < vetor.length; contador++)
		{
			System.out.println(vetor[contador]);
		}
	}
	public static int[] inversao(int[] vetord)
	{
		int auxiliar, contador, contador1 = vetord.length - 1;
		for(contador = 0; contador < (vetord.length / 2); contador++)
		{
			auxiliar = vetord[contador];
			vetord[contador] = vetord[contador1];
			vetord[contador1] = auxiliar;
			contador1 = contador1 - 1;
		}
		return vetord;
	}
}
