
class Exercicio25 {
	public static void main(String[] args) {
		boolean logico;
		Empresa e1 = new Empresa();
		e1.empregados = new Funcionario[1];
		Funcionario f1 = new Funcionario();
		f1.cpf = "222.333.666-38";
		logico = e1.adiciona(f1);
		if (logico == true) {
			System.out.println("Sucesso!");
		} else {
			System.out.println("N�o foi um sucesso!");
		}
	}
}
