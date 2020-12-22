import java.util.Scanner; 

public class Exercicio06 
{
	public static void main(String[] args)
	{
		double cofA, cofB, cofC, raizE, delta;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe o coeficiente A: ");
		cofA = leia.nextDouble();
		System.out.print("Informe o coeficiente B: ");
		cofB = leia.nextDouble();
		System.out.print("Informe o coeficiente C: ");
		cofC = leia.nextDouble();
		delta = ((Math.pow(cofB, 2)) - (4 * cofA * cofC)); // Math.pow(a,b) � elevar o n�mero
		if(delta > 0)
		{
			raizE = ((cofB * -1) + (Math.sqrt(delta)))/(2 * cofA); // Math.sqrt(a) � raiz quadrada
			System.out.println("Ra�zes da equa��o:" + raizE);
			raizE = ((cofB * -1) - (Math.sqrt(delta)))/(2 * cofA);
			System.out.println("Ra�zes da equa��o:" + raizE);
		} 
		else if(delta == 0)
		{
			raizE = ((cofB * -1) + (Math.sqrt(delta)))/(2 * cofA);
			System.out.println("Ra�zes da equa��o:" + raizE);
		}
		else 
		{
			System.out.println("A equa��o n�o possui raiz real!");
		}
		leia.close();
	}
}
