
class Conta {
	int numero;
	String dono;
	double saldo;
	double limite;

	boolean saca(double valor) {
		if (this.saldo < valor) { // O "this" é utilizado para afirmar é um
									// atributo da Classe
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	void deposita(double quantidade) {
		this.saldo = this.saldo + quantidade; // this.saldo += quantidade;
	}
}
