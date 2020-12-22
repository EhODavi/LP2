
class TestaAlgunsMetodos {
	public static void main(String[] args) {

		// criando a conta
		Conta minhaConta = new Conta();

		// alterando os valores de minhaConta
		minhaConta.titular.nome = "Duke";
		minhaConta.saldo = 1000;

		// saca 200 reais
		boolean consegui = minhaConta.saca(200);
		if (consegui == true) {
			System.out.println("Consegui sacar");
		} else {
			System.out.println("N�o consegui sacar");
		}

		// deposita 500 reais
		minhaConta.deposita(500);

		System.out.println(minhaConta.saldo);
	}
}
