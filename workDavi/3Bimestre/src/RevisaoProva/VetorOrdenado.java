package RevisaoProva;

public class VetorOrdenado {
	Pessoa[] v = new Pessoa[10];

	boolean adiciona(Pessoa p) {
		int numeroPessoa = 0;
		int posicao = 0;
		boolean logico = false;
		if (p != null) {
			for (int i = 0; i < v.length; i++) {
				if (v[i] != null) {
					numeroPessoa++;
				}
			}
			if (numeroPessoa == 0) {
				v[numeroPessoa] = p;
			}
			if (numeroPessoa < v.length) {
				for (int y = 0; y < numeroPessoa; y++) {
					if (logico == false) {
						if (p.getIdade() <= v[y].getIdade()) {
							posicao = y;
							logico = true;
						}
					}
				}
				for (int z = posicao; z < numeroPessoa; z++) {
					v[z + 1] = v[z];
				}
				v[posicao] = p;
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	void listar() {
		for (int i = 0; i < v.length; i++) {
			if (v[i] != null) {
				System.out.println("Nome: " + v[i].getNome());
				System.out.println("Idade: " + v[i].getIdade());
			}
		}
	}
}
