
class Pessoa {
	private String nome;
	private int idade;
	private static int numPessoas;

	private Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public static Pessoa newInstance(String nome, int idade) {
		if (nome != null && idade > 0) {
			return new Pessoa(nome, idade);
		} else {
			return null;
		}
	}

	public static int getNumPessoas() {
		return Pessoa.numPessoas;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

}
