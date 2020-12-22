
public class Banco {
	private String nome;
	private Cliente[] clientes;
	private int numClientes;

	public Banco(String nome) {
		this.nome = nome;
		clientes = new Cliente[10];
		numClientes = 0;
	}

	public String getNome() {
		return nome;
	}

	public boolean adicionar(Cliente cliente) {
		if (cliente != null && numClientes < clientes.length) {
			clientes[numClientes] = cliente;
			numClientes++;
			return true;
		} else
			return false;
	}

	public boolean alterar(Cliente cliente) {
		for (int i = 0; i < numClientes; i++) {
			if (clientes[i].getCpf().equals(cliente.getCpf())) {
				clientes[i] = cliente;
				return true;
			}
		}
		return false;
	}

	public boolean excluir(String cpf) {

		// localizar o cliente a ser excluído
		for (int i = 0; i < numClientes; i++) {
			if (cpf.equals(clientes[i].getCpf())) {
				for (int j = i; j < numClientes; j++) {
					clientes[j] = clientes[j + 1];
				}
				numClientes--;
				return true;
			}
		}
		return false;
	}

	public Cliente buscar(String cpf) {
		for (int i = 0; i < numClientes; i++) {
			if (clientes[i].getCpf().equals(cpf)) {
				return new Cliente(clientes[i]);
			}
		}
		return null;
	}

	public Cliente[] listar() {
		Cliente[] c = new Cliente[clientes.length];
		for (int i = 0; i < numClientes; i++) {
			c[i] = new Cliente(clientes[i]);
		}
		return c;
	}

}
