public class Exercicio10 
{
	public static void main(String[] args)
	{
		int numeroprimo, numero = 2;
		
		numeroprimo = primo(numero);
		System.out.println("O número primo é: " + numeroprimo);
	}
	public static int primo(int num)
	{
		int contador, contador1 = 0, contador2 = num, contador3, numprimo = 0;
		
		while(contador1 != 9)
		{
			contador = 0;
			for(contador3 = 1; contador3 <= contador2; contador3++)
			{
				if(contador2 % contador3 == 0)
				{
					contador = contador + 1;
				}
			}
			if(contador == 2)
			{
				contador1 = contador1 + 1;
				numprimo = contador2;
			}
			contador2 = contador2 + 1;
		}
		return numprimo;
	}
}
