public class Exercicio12 
{
	public static void main(String[] args)
	{
		int contador, numero;
		
		System.out.println("Numeros palíndromos entre 1 e 1000:");
		for(contador = 1; contador <= 1000; contador++)
		{
			numero = palindromo(contador);
			if(numero == contador)
			{
				System.out.println(numero + ";");
			}
		}
	}
	public static int palindromo(int numeroA)
	{
		int invertido = 0, digito;
		
		while(numeroA != 0)
		{
			digito = numeroA % 10;
			invertido = (invertido * 10) + digito;
			numeroA = numeroA / 10;
		}
		 return invertido;
	}
}
