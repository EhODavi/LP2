package ContaCaelum;

public class Conta {
	protected double saldo;
	
	public void deposita(double valor) {
		this.saldo = valor + this.saldo;
	}

	public void saca(double valor) {
		this.saldo = this.saldo - valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void atualiza(double taxa) {
		this.saldo = this.saldo + (this.saldo * taxa);
	}
}
