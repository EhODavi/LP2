package Caelum;

public class TestaGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		Funcionario funcionario = gerente; // Polimorfismo - Todo Gerente � um
											// funcion�rio
		funcionario.setSalario(5000.0);
		// podemos chamar m�todos do Funcionario:
		gerente.setNome("Jo�o da Silva");
		// e tamb�m m�todos do Gerente!
		gerente.setSenha(4231);

		gerente.setSalario(5000.0);
		System.out.println(gerente.getBonificacao());

		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		Gerente funcionario1 = new Gerente();
		funcionario1.setSalario(5000.0);
		controle.registra(funcionario1);
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setSalario(1000.0);
		controle.registra(funcionario2);
		System.out.println(controle.getTotalDeBonificacoes());
	}
}
