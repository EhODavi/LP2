
class Casa {
	String cor;
	Porta porta1 = new Porta();
	Porta porta2 = new Porta();
	Porta porta3 = new Porta();

	void pinta(String s) {
		this.cor = s;
	}

	int quantasPortasEstaoAbertas() {
		int numero = 0;

		if (porta1.aberta == true) {
			numero = numero + 1;
		}
		if (porta2.aberta == true) {
			numero = numero + 1;
		}
		if (porta3.aberta == true) {
			numero = numero + 1;
		}

		return numero;
	}
}
