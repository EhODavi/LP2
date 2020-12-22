
class Empresa {
	String nome;
	String cnpj;
	Funcionario[] empregados;

	void adiciona(Funcionario f) {
		int contador = 0;
		boolean logico = false;
		while (logico == false && contador < this.empregados.length) { // IMPORTANTE!!!
			if (this.empregados[contador] == null) {
				this.empregados[contador] = f;
				logico = true;
			}
			contador++;
		}
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