class Empresa {
	private String nome;
	private String cnpj;
	private Funcionario[] empregados;
	private static int numeroFuncionario = 0;

	public Empresa(int tamanhoVetor) {
		this.empregados= new Funcionario[tamanhoVetor];
		Empresa.numeroFuncionario = Empresa.numeroFuncionario + 1;
	}

	public int getNumeroFuncionario() {
		return Empresa.numeroFuncionario;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getcnpj() {
		return this.cnpj;
	}

	public void setcnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Funcionario getFuncionario(int posicao) {
		return this.empregados[posicao];
	}

	public void adiciona(Funcionario f) {
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

	public void mostraEmpregados() {
		for (int i = 0; i < this.empregados.length; i++) {
			if (empregados[i] != null) { // IMPORTANTE!!!
				System.out.println("Funcion�rio na posi��o: " + i);
				System.out.println("Sal�rio: " + empregados[i].getSalario());
			}
		}
	}

	public boolean contem(Funcionario f) {
		boolean logico = false;
		for (int i = 0; i < empregados.length; i++) {
			if (f == empregados[i]) {
				logico = true;
			}
		}
		return logico;
	}
}
