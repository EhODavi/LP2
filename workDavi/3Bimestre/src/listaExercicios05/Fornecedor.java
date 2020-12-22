package listaExercicios05;

public class Fornecedor extends Pessoa { // E o construtor?
	protected double creditoMax;
	protected double valorEmDivida;

	private Fornecedor(String nome, int idade, double peso, String cpf, double creditoMax, double valorEmDivida) {
		super(nome, idade, peso, cpf);
		this.creditoMax = creditoMax;
		this.valorEmDivida = valorEmDivida;
	}

	public static Fornecedor newInstance(String nome, int idade, double peso, String cpf, double creditoMax,
			double valorEmDivida) {
		if (nome != null && idade > 0 && peso > 0 && cpf != null && creditoMax > 0 && valorEmDivida > 0) {
			return new Fornecedor(nome, idade, peso, cpf, creditoMax, valorEmDivida);
		}
		return null;
	}

	public double obterSaldo() {
		return this.creditoMax - this.valorEmDivida;
	}

	public double getCreditoMax() {
		return this.creditoMax;
	}

	public void setCreditoMax(double creditoMax) {
		this.creditoMax = creditoMax;
	}

	public double getvalorEmDivida() {
		return this.valorEmDivida;
	}

	public void setvalorEmDivida(double valorEmDivida) {
		this.valorEmDivida = valorEmDivida;
	}
}
