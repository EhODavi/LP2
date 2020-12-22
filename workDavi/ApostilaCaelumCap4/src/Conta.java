
class Conta {
	int numero;
	Cliente titular = new Cliente();
	double saldo;
	double limite;

	boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	void deposita(double quantidade) {
		this.saldo += quantidade; // this.saldo = this.saldo + quantidade;
	}

	boolean transferePara(Conta destino, double valor) {

		boolean retirou = this.saca(valor);
		if (retirou == false) {
			// não deu pra sacar!
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}
}
