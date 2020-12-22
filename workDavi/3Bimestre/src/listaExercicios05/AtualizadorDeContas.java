package listaExercicios05;

class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		System.out.print("Saldo Anterior: ");
		System.out.println(c.getSaldo());
		c.atualiza(this.selic);
		System.out.print("Saldo Final: ");
		System.out.println(c.getSaldo());
		this.saldoTotal = this.saldoTotal + c.getSaldo();
	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}
}