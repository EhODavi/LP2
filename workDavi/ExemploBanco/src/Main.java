import java.util.Scanner;

public class Main {
	private static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao = 0;

		Banco banco = new Banco("Caixa");

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
				System.out.println("\n-- CADASTRO DE CLIENTE --");
				Cliente cliente = lerCliente();
				if (banco.adicionar(cliente))
					System.out.println("Insercao realizada com sucesso");
				else
					System.out.println("Falha na insercao");
				break;
			case 2:
				System.out.println("\n-- ALTERACAO DE CLIENTE --");
				Cliente[] clientes = banco.listar();
				listar(clientes);
				String cpf = lerCPF();
				Cliente c = banco.buscar(cpf);
				alterar(c);
				if (banco.alterar(c))
					System.out.println("Alteracao realizada com sucesso");
				else
					System.out.println("Falha na alteracao");
				break;
			case 3:
				System.out.println("\n-- EXCLUSAO DE CLIENTE --");
				clientes = banco.listar();
				listar(clientes);
				cpf = lerCPF();
				if (banco.excluir(cpf))
					System.out.println("Exclusão realizada com sucesso");
				else
					System.out.println("Falha na Exclusao");
				break;
			case 4:
				System.out.println("\n-- LISTAGEM DOS CLIENTES --");
				clientes = banco.listar();
				listar(clientes);
				break;
			default:
				System.out.println("Opcao invalida!");
			}
		} while (opcao != 0);

	}

	private static String lerCPF() {
		System.out.print("Insira o CPF do cliente: ");
		String cpf = scn.next();
		return cpf;
	}// fim main

	private static Cliente lerCliente() {
		System.out.print("Nome: ");
		String nome = scn.next();
		System.out.print("CPF: ");
		String cpf = scn.next();
		Endereco end = lerEndereco();
		Cliente c = Cliente.newInstance(nome, cpf, end);
		return c;
	}

	private static void alterar(Cliente c) {
		int opcao;
		do {
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

		} while (opcao != 0);

		// Não fiz a alteração de endereço.
	}

	private static void listar(Cliente[] clientes) {
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

	private static Endereco lerEndereco() {
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
}
