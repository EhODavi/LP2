package classe;

// CLASSE CONTA - PROGRAMAÇÃO ORIENTADA A OBJETOS
public class Conta {
	private int numero;
	String nome;
	double saldo;
	double limite;

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
}
