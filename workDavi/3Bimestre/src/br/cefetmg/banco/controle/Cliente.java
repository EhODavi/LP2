package br.cefetmg.banco.controle;

public class Cliente {
	private String nome;
	private String cpf;
	private Endereco[] end = new Endereco[10];
	private int numEndCadastrados;

	// método fábrica
	public static Cliente newInstance(String nome, String cpf, Endereco end) {
		if (nome != null && nome.length() >= 2 && valida(cpf) && end != null) {
			return new Cliente(nome, cpf, end);
		} else
			return null;
	}

	// construtor
	private Cliente(String nome, String cpf, Endereco end) {
		this.nome = nome;
		this.cpf = cpf;
		this.end[0] = end;
		numEndCadastrados = 1;
	}

	public Cliente(Cliente cliente) {
		this.nome = cliente.nome;
		this.cpf = cliente.cpf;
		this.numEndCadastrados = cliente.numEndCadastrados;
		for (int i = 0; i < cliente.numEndCadastrados; i++)
			end[i] = new Endereco(cliente.end[i]);
	}

	public String getNome() {
		return nome;
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

	private static boolean valida(String cpf) {
		return true;
	}

	public void adiciona(Endereco end) {
		if (end != null) {
			boolean inseriu = false;
			int i = 0;
			while (i < this.end.length && !inseriu) {
				if (this.end[i] == null) {
					this.end[i] = end;
					inseriu = true;
					numEndCadastrados++;
				}
				i++;
			}
		}
	}

}
