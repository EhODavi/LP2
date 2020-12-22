
class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();

		f1.nome = "Davi";
		f1.salario = 1000;
		f1.recebeAumento(500);

		System.out.println("Salario atual: " + f1.salario);
		System.out.println("Ganho anual: " + f1.calculaGanhoAnual());
		f1.mostra();
	}
}
