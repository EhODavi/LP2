
class Programa {
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.titular.nome = "Duke";
		minhaConta.saldo = 1000.0;
		System.out.println("Saldo atual: " + minhaConta.saldo);
	}
}
