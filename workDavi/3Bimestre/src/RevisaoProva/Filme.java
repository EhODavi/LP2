package RevisaoProva;

public class Filme {
	private int codigoUnico;
	private String nome;
	private String diretor;
	private String[] atores;
	private int numAtores;
	private int duracao;
	private static int geraCodigo;

	private Filme(String nome, String diretor, String[] atores, int numAtores, int duracao) {
		this.codigoUnico = Filme.geraCodigo;
		this.nome = nome;
		this.diretor = diretor;
		this.atores = atores;
		this.numAtores = numAtores;
		this.duracao = duracao;
		Filme.geraCodigo++;
	}

	public static Filme newInstance(String nome, String diretor, String[] atores, int numAtores, int duracao) {
		if (nome != null && diretor != null && atores.length == numAtores && numAtores >= 2 && numAtores <= 10
				&& duracao > 0) {
			int contador = 0;
			for (int i = 0; i < atores.length; i++) {
				if (atores[i] != null) {
					contador++;
				}
			}
			if (contador == numAtores) {
				return new Filme(nome, diretor, atores, numAtores, duracao);
			}
		}
		return null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String[] getAtores() {
		return atores;
	}

	public void setAtores(String[] atores) {
		this.atores = atores;
	}

	public int getNumAtores() {
		return numAtores;
	}

	public void setNumAtores(int numAtores) {
		this.numAtores = numAtores;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getCodigoUnico() {
		return codigoUnico;
	}

	public static int getGeraCodigo() {
		return geraCodigo;
	}

}
