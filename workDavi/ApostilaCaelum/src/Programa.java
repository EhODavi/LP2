
class Programa {
	public static void main(String[] args) {
		Conta minhaConta = new Conta(); // Criação de um objeto(instancia) do
										// tipo Conta
		// alterando os valores de minhaConta
		minhaConta.dono = "Duke";
		minhaConta.saldo = 1000;
		// saca 2000 reais
		boolean consegui = minhaConta.saca(2000);
		if (consegui == true) {
			System.out.println("Consegui sacar");
		} else {
			System.out.println("Não consegui sacar");
		}
		// deposita 500 reais
		minhaConta.deposita(500);
		System.out.println("Saldo atual: " + minhaConta.saldo);
	}
}
