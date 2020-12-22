package listaExercicios05;

import java.util.ArrayList;
import java.util.List;

class Banco {
	List<Conta> contas = new ArrayList<Conta>();

	public void adiciona(Conta c) {
		if (c != null) {
			this.contas.add(c);
		}
	}

	public Conta pegaConta(int x) {
		return this.contas.get(x);
	}

	public int pegaTotalDeContas() {
		return this.contas.size();
	}
}
