package listaExercicios05;

class EmpregadoDaFaculdade {
	private String nome;
	private double salario;

	double getGastos() {
		return this.salario;
	}

	String getInfo() {
		return "nome: " + this.nome + " com sal�rio " + this.salario;
	}

	public double getSalario() {
		return this.salario;
	}
	// m�todos de get, set e outros
}
