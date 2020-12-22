package listaExercicios05;

class Funcionario01 {
	protected int numeroSecao;
	protected double salarioBase;
	protected double IR;
	Pessoa p;
	
	private Funcionario01(String nome, int idade, double peso, String cpf, int numeroSecao, double salarioBase, double IR) {
		p = new Pessoa(nome, idade, peso, cpf);
		this.numeroSecao = numeroSecao;
		this.salarioBase = salarioBase;
		this.IR = IR;
	}
	
	public static Funcionario01 newInstance(String nome, int idade, double peso, String cpf, int numeroSecao, double salarioBase, double IR) {
		if(nome != null && idade > 0 && peso > 0 && cpf != null && numeroSecao > 0 && salarioBase > 0 && IR > 0) {
			return new Funcionario01(nome, idade, peso, cpf, numeroSecao, salarioBase, IR);
		}
		return null;
	}

	public int getNumeroSecao() {
		return this.numeroSecao;
	}

	public void setNumeroSecao(int numeroSecao) {
		this.numeroSecao = numeroSecao;
	}

	public double getSalarioBase() {
		return this.salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getIR() {
		return this.IR;
	}

	public void setIR(double iR) {
		IR = iR;
	}
	
	public double calcularSalario() {
		return this.salarioBase - (this.salarioBase * this.IR);
	}
}