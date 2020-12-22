
class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private String dataEntrada;
	private String RG;
	private int identificadorFuncionario;
	private static int identificadorGlobal = 1;

	public Funcionario() { // Caso o usuario n�o informe o nome, ele vai para
							// esse construtor
		this.identificadorFuncionario = Funcionario.identificadorGlobal;
		Funcionario.identificadorGlobal = Funcionario.identificadorGlobal + 1;
	}

	public Funcionario(String nome) { // � OPCIONAL
		this();
		this.nome = nome;
	}

	public int getidentificadorFuncionario() {
		return this.identificadorFuncionario;
	}

	public static int getidentificadorGlobal() {
		return Funcionario.identificadorGlobal;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataEntranda() {
		return this.dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRG() {
		return this.RG;
	}

	public void setRG(String RG) {
		this.RG = RG;
	}

	public void recebeAumento(double valor) {
		this.salario = this.salario + valor;
	}

	public double getGanhoAnual() {
		double valorAnual = this.salario * 12;
		return valorAnual;
	}
}