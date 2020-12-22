package listaExercicios05;

public class TestaBanco {
	public static void main(String[] args) {
		AtualizadorDeContas ac = new AtualizadorDeContas(0.01);
		Banco b = new Banco();
		Conta c = new Conta();
		Conta cc = new ContaCorrente(); // !!!
		Conta cp = new ContaPoupanca();
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		b.adiciona(c);
		b.adiciona(cc);
		b.adiciona(cp);
		for (int i = 0; i < b.contas.size(); i++) {
			ac.roda(b.pegaConta(i));
		}
	}
}
