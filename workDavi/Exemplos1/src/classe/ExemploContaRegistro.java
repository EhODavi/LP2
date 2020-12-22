package classe;

// PROGRAMAÇÃO ORIENTADA A OBJETOS
public class ExemploContaRegistro {
	public static void main(String[] args) {
		// INSTANCIAS DA CLASSE CONTA
		Conta c1 = new Conta();
		Conta c2 = new Conta();

		System.out.println("Saldo rc1: " + c1.saldo);
		System.out.println("Saldo rc2: " + c2.saldo);

		c1.colocarLimite(300);

		if (c1.depositar(500))
			System.out.println("Depósito realizado");
		else
			System.out.println("Depósito falhou");
		System.out.println("Saldo rc1: " + c1.saldo);
		System.out.println("Saldo rc2: " + c2.saldo);
		if (c1.sacar(800))
			System.out.println("Saque realizado");
		else
			System.out.println("Saque falhou");

		c1.limite = 100;

		System.out.println("Saldo rc1: " + c1.saldo);
		System.out.println("Saldo rc2: " + c2.saldo);
		if (c1.transferir(c2, 150))
			System.out.println("Transferência realizada");
		else
			System.out.println("Transferência falhou");

		System.out.println("Saldo rc1: " + c1.saldo);
		System.out.println("Saldo rc2: " + c2.saldo);
	}

}
