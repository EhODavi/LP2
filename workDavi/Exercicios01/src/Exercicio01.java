import java.util.Scanner; //Perguntar para o Luciano

public class Exercicio01 {
	public static void main(String[] args) {
		double fahren, grausC;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em Fahrenheit:");
		fahren = leia.nextDouble();
		
		while (fahren > -460) {
			grausC = 0.56 * (fahren - 32);
			System.out.println("A temperatura em graus centígrados é:" + grausC);
			System.out.print("Informe a temperatura em Fahrenheit:");
			fahren = leia.nextDouble();
		}
		if (fahren <= -460) {
			System.out.print("Programa finalizado!");
		}
		leia.close();
	}
}
