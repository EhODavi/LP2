package Caelum;

public class ContaCorrente extends Conta {
	public void atualiza(double taxa) {
		super.atualiza(2 * taxa); // Atualiza n�o retorna
	}

	public void deposita(double valor) {
		this.saldo =  this.saldo + valor - 0.10;
	}
}
