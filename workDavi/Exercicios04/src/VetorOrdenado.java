
class VetorOrdenado {
	private Pessoa[] v = new Pessoa[10];
	private int numPessoas;

	public Pessoa[] getV() {
		return this.v;
	}

	public int getNumPessoas() {
		return this.numPessoas;
	}

	public boolean adiciona(Pessoa p) {
		if (p != null && numPessoas < v.length) { // verificando se cabe
			// localizar o ponto de inser��o
			int i = 0;
			for (i = 0; i < numPessoas; i++) {
				if (p.getIdade() < v[i].getIdade()) {
					break;
				}
			}
			// vari�vel i sai com a posi��o do ponto de inser��o
			for (int j = numPessoas; j > i; j--) {
				v[j] = v[j - 1];
			}
			v[i] = p;
			numPessoas++;
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		String s = "[";
		for (int i = 0; i < v.length; i++) {
			s += " " + String.valueOf(v[i]);
		}
		s += " ]";

		return s;
	}
}
