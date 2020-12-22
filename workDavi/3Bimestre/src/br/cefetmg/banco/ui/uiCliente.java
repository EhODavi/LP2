package br.cefetmg.banco.ui;

import br.cefetmg.banco.controle.Banco;
import br.cefetmg.banco.controle.Cliente;
import br.cefetmg.banco.controle.Endereco;
import java.util.Scanner;

public class UICliente {
	private Scanner scn = new Scanner(System.in);
	private Banco banco;

	public UICliente() {
		banco = Banco.getInstance();
	}

	public void adicionar() {
		System.out.println("\n-- CADASTRO DE CLIENTE --");
		Cliente cliente = lerCliente();
		if (banco.adicionar(cliente))
			System.out.println("Insercao realizada com sucesso");
		else
			System.out.println("Falha na insercao");
	}

	private Cliente lerCliente() {
		System.out.print("Nome: ");
		String nome = scn.next();
		System.out.print("CPF: ");
		String cpf = scn.next();
		Endereco end = lerEndereco();
		Cliente c = Cliente.newInstance(nome, cpf, end);
		return c;
	}

	private Endereco lerEndereco() {
		System.out.println("Endereço ---");
		System.out.print("Tipo (residencial/comercial): ");
		String tipo = scn.next();
		System.out.print("Logradouro: ");
		String logradouro = scn.next();
		System.out.print("Numero: ");
		int numero = scn.nextInt();
		System.out.print("Cidade: ");
		String cidade = scn.next();
		System.out.print("UF: ");
		// substring vai retornar as duas primeiras letras da string
		String uf = scn.next().substring(0, 2);
		System.out.print("CEP: ");
		String cep = scn.next();
		Endereco e = Endereco.newInstance(tipo, logradouro, numero, cidade, uf, cep);
		return e;
	}

	public void listar() {
		System.out.println("\n-- LISTAGEM DOS CLIENTES --");
		Cliente[] clientes = banco.listar();
		listar(clientes);

	}

	private String lerCPF() {
		System.out.print("Insira o CPF do cliente: ");
		String cpf = scn.next();
		return cpf;
	}// fim main

	public void alterar() {
		int opcao;
		do {
			System.out.println("\n-- ALTERACAO DE CLIENTE --");
			Cliente[] clientes = banco.listar();
			listar(clientes);
			String cpf = lerCPF();
			Cliente c = banco.buscar(cpf);
			banco.alterar(c);
			// Neste caso CPF nao pode ser alterado por ser chave primária
			System.out.println("\nCPF: " + c.getCpf());
			System.out.println("1- Nome: " + c.getNome());
			System.out.println("2- Endereco: ");
			System.out.print("Escolha qual campo deseja alterar (0-sair): ");
			opcao = scn.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Novo nome: ");
				String nome = scn.next();
				c.setNome(nome);
				break;
			case 2:
				// chamar a funcao de alteração de endereco...
				break;
			default:
				break;
			}
			if (banco.alterar(c)) {
				System.out.println("Alteracao realizada com sucesso");
			} else {
				System.out.println("Falha na alteracao");
			}
		} while (opcao != 0);
		// Não fiz a alteração de endereço.
	}

	private void listar(Cliente[] clientes) {
		System.out.println("CPF\tNOME\tENDERECO");
		if (clientes == null || clientes.length == 0)
			System.out.println("<Não há clientes cadastrados>");
		else {
			for (Cliente c : clientes) {
				if (c != null) {
					Endereco e = c.getEnd()[0];
					System.out.println(c.getCpf() + "\t" + c.getNome() + "\t" + e.getLogradouro() + "," + e.getNumero()
							+ " - " + e.getCidade() + "/" + e.getUf());
				}
			}
		}

	}

	public void excluir() {
		System.out.println("\n-- EXCLUSAO DE CLIENTE --");
		Cliente[] clientes = banco.listar();
		clientes = banco.listar();
		listar(clientes);
		String cpf = lerCPF();
		if (banco.excluir(cpf)) {
			System.out.println("Exclusão realizada com sucesso");
		} else {
			System.out.println("Falha na Exclusao");
		}
	}
}
