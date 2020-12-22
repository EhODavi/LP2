import java.util.Scanner;

public class Exercicio04 
{
	public static void main(String[] args)
	{
		double massa;
		int contador = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe a massa inicial em gramas:");
		massa = leia.nextDouble();
		System.out.println("Massa inicial em gramas: " + massa);
		while(massa >= 0.5)
		{
			massa = massa * 0.5;
			contador = contador + 50;
		}
		System.out.println("Massa final em gramas: " + massa);
		System.out.println("Tempo gasto em segundos: " + contador);
		leia.close();
	}
}
