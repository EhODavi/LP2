
class TestaEmpresa {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10]; // IMPORTANTE!!!

		Funcionario f1 = new Funcionario();
		f1.salario = 1000;
		empresa.adiciona(f1);

		Funcionario f2 = new Funcionario();
		f2.salario = 1700;
		empresa.adiciona(f2);

		for (int i = 0; i < empresa.empregados.length; i++) {
			if (empresa.empregados[i] != null) {
				empresa.empregados[i].mostra();
			}
		}
		
		boolean logico = empresa.contem(f1);
		System.out.println(logico);
	}
}
