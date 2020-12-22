
// CLASSE CONTA - PROGRAMAÇÃO ORIENTADA A OBJETOS
public class Conta {
	private int numero;
	// String nome;
	private Cliente titular;
	private double saldo;
	private double limite;

	// atributos de classe ou membro de classe
	private static int geraNumero = 1000;

	private Conta() {
		geraNumero++;
		numero = geraNumero;
	}

	public Conta(Cliente titular) {
		this(); // executa o construtor sem parâmetros
		if (titular != null) {
			this.titular = titular;
		}
	}

	public int getNumero() {
		return numero;
	}

	/*
	 * public void setNumero(int numero) { if (numero >= 1000 && numero <= 9999)
	 * this.numero = numero; }
	 */

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public boolean sacar(double valor) {
		if (valor > 0 && valor <= saldo + limite) {
			saldo = saldo - valor;
			return true;
		} else
			return false;
	}

	public boolean depositar(double valor) {
		if (valor > 0) {
			saldo = saldo + valor;
			return true;
		} else
			return false;
	}

	public boolean transferir(Conta destino, double valor) {
		if (sacar(valor)) {
			destino.depositar(valor);
			return true;
		} else
			return false;
	}

	public void colocarLimite(double limite) {
		if (limite > 0)
			this.limite = limite;
	}
} // fim da classe Conta