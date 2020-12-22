
public class Cliente {
	private String nome;
	private String cpf;
	private Endereco[] end = new Endereco[10];
	private int numEndCadastrados;

	// Método fábrica
	public static Cliente newInstance(String nome, String cpf, Endereco end) {
		if (nome != null && nome.length() >= 2 && cpf != null && valida(cpf) && end != null) {
			return new Cliente(nome, cpf, end);
		} else {
			return null;
		}
	}

	private Cliente(String nome, String cpf, Endereco end) {
		this.nome = nome;
		this.cpf = cpf;
		this.end[0] = end;
		numEndCadastrados = 1;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		if (nome != null && nome.length() >= 2)
			this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (valida(cpf))
			this.cpf = cpf;
	}

	public int getNumEndCadastrados() {
		return numEndCadastrados;
	}

	// NÃO PODE EXISTIR !!!
	// public void setNumEndCadastrados(int numEndCadastrados) {
	// this.numEndCadastrados = numEndCadastrados;
	// }

	public Endereco[] getEnd() {
		return end;
	}

	public static boolean valida(String cpf) {
		return true;
	}

	void adiciona(Endereco end) {
		if (end != null) {
			boolean inseriu = false;
			int i = 0;
			while (i < this.end.length && !inseriu) {
				if (this.end[i] == null) {
					// end[i] = new Endereco();
					// end[i].tipo = tipo;
					// end[i].logradouro = logradouro;
					// end[i].numero = numero;
					// end[i].cidade = cidade;
					this.end[i] = end;
					inseriu = true;
					numEndCadastrados++;
				}
				i++;
			}
		}
	}
}
