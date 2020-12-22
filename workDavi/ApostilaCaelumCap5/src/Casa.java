
class Casa {
	String cor;
	int totalDePortas;
	Porta[] portas;

	void pinta(String s) {
		this.cor = s;
	}

	int quantasPortasEstaoAbertas() {
		int numero = 0;

		for (int i = 0; i < portas.length; i++) {
			if (portas[i].aberta == true) {
				numero = numero + 1;
			}
		}
		return numero;
	}

	void adicionaPorta(Porta p) {
		int i = 0;
		boolean logico = false;
		while (logico == false) { // IMPORTANTE!!!
			if (portas[i] == null) {
				portas[i] = p;
				logico = true;
			}
			i++;
		}
	}

	int totalDePortas() {
		int numero = 0;
		for (int i = 0; i < portas.length; i++) {
			if (portas[i] != null) {
				numero = numero + 1;
			}
		}
		this.totalDePortas = numero;
		return numero;
	}
}