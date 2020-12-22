
class Empresa {
	String nome;
	String cnpj;
	Funcionario[] empregados;

	boolean adiciona(Funcionario f) {
		int contador = 0;
		boolean logico = false;
		boolean logico1;
		while (logico == false && contador < this.empregados.length) { // IMPORTANTE!!!
			if (this.empregados[contador] == null) {
				this.empregados[contador] = f;
				logico = true;
			}
			if (logico == true) {
				logico1 = this.empregados[contador].validaCPF();
				if (logico1 == false) {
					this.empregados[contador] = null;
					return false;
				}
			}
			contador++;
		}
		return true;
	}

	void mostraEmpregados() {
		for (int i = 0; i < this.empregados.length; i++) {
			if (empregados[i] != null) { // IMPORTANTE!!!
				System.out.println("Funcion�rio na posi��o: " + i);
				System.out.println("Sal�rio: " + empregados[i].salario);
			}
		}
	}

	boolean contem(Funcionario f) {
		boolean logico = false;
		for (int i = 0; i < empregados.length; i++) {
			if (f == empregados[i]) {
				logico = true;
			}
		}
		return logico;
	}
}