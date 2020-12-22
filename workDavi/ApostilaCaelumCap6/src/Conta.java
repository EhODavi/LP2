
class Conta {
	private int numero;
	private Cliente titular = new Cliente();
	private double saldo;
	private double limite;
	private static int totalDeContas;

	public Conta(Cliente titular) { // Construtor
		this.titular = titular;
		Conta.totalDeContas = Conta.totalDeContas + 1;
	}

	public Conta(int numero, Cliente titular) {
		this(titular); // chama o construtor que foi declarado acima
		this.numero = numero;
		Conta.totalDeContas = Conta.totalDeContas + 1;
	}

	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}

	public void saca(double quantidade) {
		if (this.saldo + this.limite < quantidade) {
			System.out.println("Não posso sacar fora do limite!");
		} else {
			this.saldo = this.saldo - quantidade;
		}
	}

	void deposita(double quantidade) {
		if (quantidade > 0) {
			this.saldo += quantidade; // this.saldo = this.saldo + quantidade;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	// public void setSaldo(double saldo) { Não é necessario pois para modificar
	// o valor do saldo,
	// this.saldo = saldo; é necessário usar o metodo saca ou deposita
	// }

	public int getNumero() {
		return this.numero;
	}

	public double getLimite() {
		return this.limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}