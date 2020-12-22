
class TesteCartao {
	public static void main(String[] args) {

		boolean logico;
		Conta conta = new Conta();
		Cartao cartao = new Cartao();

		conta.limite = 1000;
		conta.numero = 007;
		conta.saldo = 1500;

		cartao.c = conta;
		cartao.senhaNumerica = 006;
		cartao.relacaoDeDebitos = new Debito[3];

		logico = cartao.debitar(600, "Mac Donald", 006);
		if (logico == true) {
			System.out.println("Foi possível debitar!");
		} else {
			System.out.println("Não foi possível debitar!");
		}
		cartao.gerarFatura(007);
	}
}
