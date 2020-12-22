package br.cefetmg.banco;

import java.util.Scanner;

import br.cefetmg.banco.controle.Banco;
import br.cefetmg.banco.controle.Cliente;
import br.cefetmg.banco.controle.Endereco;
import br.cefetmg.banco.ui.UICliente;

public class Main {
	private static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		UICliente uiCliente = new UICliente();

		int opcao = 0;

		Banco banco = Banco.getInstance();

		Endereco end = Endereco.newInstance("Casa", "Rua principal", 10, "Fabriciano", "MG", "35170-172");
		banco.adicionar(Cliente.newInstance("Joao", "123", end));

		end = Endereco.newInstance("Casa", "Rua 2", 10, "Timóteo", "MG", "35180-000");
		banco.adicionar(Cliente.newInstance("Maria", "234", end));

		end = Endereco.newInstance("Casa", "Rua 10", 10, "Timóteo", "MG", "35180-000");
		banco.adicionar(Cliente.newInstance("Ze", "345", end));

		end = Endereco.newInstance("Casa", "Rua Nova", 10, "Timóteo", "MG", "35180-000");
		banco.adicionar(Cliente.newInstance("Paula", "456", end));

		do {
			System.out.println("\n------ SYS " + banco.getNome() + " ------");
			System.out.println("0- SAIR");
			System.out.println("1- Cadastrar cliente");
			System.out.println("2- Alterar cliente");
			System.out.println("3- Excluir cliente");
			System.out.println("4- Listar clientes");
			System.out.println("5- Acrescentar endereco ao cliente");
			opcao = scn.nextInt();

			switch (opcao) {
			case 0:
				System.out.println("bye bye");
				break;
			case 1:
				uiCliente.adicionar();
				break;
			case 2:
				uiCliente.alterar();
				break;
			case 3:
				uiCliente.excluir();
				break;
			case 4:
				uiCliente.listar();
				break;
			default:
				System.out.println("Opcao invalida!");
			}
		} while (opcao != 0);

	} // fim do main
}