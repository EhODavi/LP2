import java.util.Scanner;

class Exercicio24 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		boolean logico = false;
		Funcionario f1 = new Funcionario();

		while (logico == false) {
			System.out.println("Informe o CPF:");
			f1.cpf = leia.nextLine();
			logico = f1.validaCPF();
			if (logico == true) {
				System.out.println("CPF Valido!");
			} else {
				System.out.println("CPF Inválido!");
			}
		}
		leia.close();
	}
}
