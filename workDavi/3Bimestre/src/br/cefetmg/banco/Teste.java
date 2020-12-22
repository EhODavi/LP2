package br.cefetmg.banco;

import br.cefetmg.banco.controle.Cliente;
import br.cefetmg.banco.controle.Conta;
import br.cefetmg.banco.controle.Endereco;

public class Teste {
	public static void main(String[] args) {
		// c1.setNumero(1); // c.numero = 1;

		// Cliente cli1 = new Cliente("Joao","123.456.789-10");
		Endereco end = Endereco.newInstance("Casa", "Rua principal", 10, "Fabriciano", "MG", "35170-172");
		Cliente cli1 = Cliente.newInstance("Joao", "123.456.789-10", end);
		// cli1.setNome("Joao"); // c.titular.nome = "Joao";
		// c.titular.end[0] = new Endereco();
		// c.titular.adiciona("casa", "Rua das Flores", 10, "Timoteo");

		Endereco end1 = Endereco.newInstance("casa", "Rua das Flores", 10, "Timoteo", "MG", "35180-000");
		// end1.tipo = "casa";
		// end1.logradouro = "Rua das Flores";
		// end1.numero = 10;
		// end1.cidade = "Timóteo";
		// end1.uf = "MG";

		Endereco end2 = Endereco.newInstance(null, null, 0, null, null, null);
		// end2.tipo = "trabalho";
		// end2.logradouro = "Praça 1 de maio";
		// end2.numero = 50;
		//// end2.cidade = "Timóteo";
		// end2.uf = "MG";

		cli1.adiciona(end1);
		cli1.adiciona(end2);
		// c.titular.adiciona("Empresa", "Rua Principal", 128, "Fabriciano");
		// cli1.setNumEndCadastrados(5); //cli1.numEndCadastrados = 5;

		Conta c1 = new Conta(cli1);
		System.out.println("c1 titular: " + c1.getTitular().getNome());
		// c1.setTitular(cli1);// c.titular = new Cliente();

		end2 = Endereco.newInstance("trabalho", "Rua principal", 100, "Timóteo", "MG", "35180-000");
		Cliente cli2 = Cliente.newInstance("Maria", "234.567.890-11", end2);
		// Cliente cli2 = new Cliente("Maria","234.567.890-11");
		Conta c2 = new Conta(cli2);
		Conta c3 = new Conta(cli2);

		System.out.println("c1 num: " + c1.getNumero());
		System.out.println("c2 num: " + c2.getNumero());
		System.out.println("c3 num: " + c3.getNumero());

	} // fim do main
}
