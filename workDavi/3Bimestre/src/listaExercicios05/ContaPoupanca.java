package listaExercicios05;

class ContaPoupanca extends Conta {
	public void atualiza(double taxa) {
		super.atualiza(3 * taxa); // Atualiza n�o retorna
	}
}
