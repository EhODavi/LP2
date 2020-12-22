package RevisaoProva;

public class Pessoa {
	private String nome;
	private double idade;

	private Pessoa(String nome, double idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public static Pessoa newInstance(String nome, double idade) {
		if (nome != null && idade > 0) {
			return new Pessoa(nome, idade);
		}
		return null;
	}

	public String getNome() {
		return this.nome;
	}

	public boolean setNome(String nome) {
		if (nome != null) {
			this.nome = nome;
			return true;
		}
		return false;
	}

	public double getIdade() {
		return this.idade;
	}

	public boolean setIdade(double idade) {
		if (idade > 0) {
			this.idade = idade;
			return true;
		}
		return false;
	}
}
