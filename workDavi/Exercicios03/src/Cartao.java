
class Cartao {
	Conta c;
	int senhaNumerica;
	Debito[] relacaoDeDebitos;

	boolean debitar(double valor, String nome, int senha) {
		if (senha == this.senhaNumerica && this.c.saca(valor) == true) {
			for (int i = 0; i < this.relacaoDeDebitos.length; i++) {
				if (this.relacaoDeDebitos[i] == null) {
					this.relacaoDeDebitos[i] = new Debito();
					this.relacaoDeDebitos[i].nomeEstabelecimento = nome;
					this.relacaoDeDebitos[i].valorDebito = valor;
					return true; // IMPORTANTE!!
				}
			}
			return false;
		} else {
			return false;
		}
	}

	void gerarFatura(int senha) {
		if (senha == this.senhaNumerica) {
			for (int i = 0; i < this.relacaoDeDebitos.length; i++) {
				if (this.relacaoDeDebitos[i] != null) {
					System.out
							.println("Estabelecimento " + (i + 1) + ":" + this.relacaoDeDebitos[i].nomeEstabelecimento);
					System.out.println("Valor " + (i + 1) + ":" + this.relacaoDeDebitos[i].valorDebito);
				}
			}
		} else {
			System.out.println("Não foi possivel gerar a fatura!");
		}
	}
}
