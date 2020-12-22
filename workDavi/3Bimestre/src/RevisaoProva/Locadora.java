package RevisaoProva;

public class Locadora {
	private String nome;
	private Filme[] filmes;
	private int filmesInseridos;
	private static Locadora instance;

	private Locadora(String nome, int tamanhoVetor) {
		this.nome = nome;
		this.filmes = new Filme[tamanhoVetor];
	}

	public static Locadora newInstance(String nome, int tamanhoVetor) {
		if (nome != null && tamanhoVetor > 0 && instance == null) {
			instance = new Locadora(nome, tamanhoVetor);
		}
		return instance;
	}

	public boolean inserir(Filme f) {
		if (f != null && filmesInseridos < filmes.length) {
			for (int i = 0; i < filmesInseridos; i++) {
				if (filmes[i].getNome() == f.getNome()) {
					return false;
				}
			}
			filmes[filmesInseridos + 1] = f;
			filmesInseridos++;
			return true;
		}
		return false;
	}

	public Filme[] buscar(String nomeDoAtor) {
		if (nomeDoAtor != null) {
			int contador = 0;
			for (int i = 0; i < filmesInseridos; i++) {
				if (filmes[i] != null) {
					for (int j = 0; j < filmes[i].getAtores().length; j++) {
						if (filmes[i].getAtores()[j] == nomeDoAtor) {
							contador++;
						}
					}
				}
			}
			if (contador > 0) {
				Filme[] filmesDoAtor = new Filme[contador];
				int contador1 = 0;
				for (int z = 0; z < filmesInseridos; z++) {
					if (filmes[z] != null) {
						for (int w = 0; w < filmes[z].getAtores().length; w++) {
							if (filmes[w].getAtores()[w] == nomeDoAtor) {
								filmesDoAtor[contador1] = filmes[w];
								contador1++;
							}
						}
					}
				}
				return filmesDoAtor;
			} else {
				return null;
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

	public Filme[] getFilmes() {
		return filmes;
	}

	public int getFilmesInseridos() {
		return filmesInseridos;
	}

	public static Locadora getInstance() {
		return instance;
	}

}
