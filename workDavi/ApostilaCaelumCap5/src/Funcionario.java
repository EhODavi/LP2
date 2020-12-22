
class Funcionario {
	String nome;
	String departamento;
	double salario;
	String dataEntrada;
	String RG;

	void recebeAumento(double valor) {
		this.salario = this.salario + valor;
	}

	double calculaGanhoAnual() {
		double valorAnual = this.salario * 12;
		return valorAnual;
	}

	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario: " + this.salario);
		System.out.println("Data de Entrada: " + this.dataEntrada);
		System.out.println("RG: " + this.RG);
		System.out.println("Ganho Anual " + this.calculaGanhoAnual());
	}
}