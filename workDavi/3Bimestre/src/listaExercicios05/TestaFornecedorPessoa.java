package listaExercicios05;

class TestaFornecedorPessoa {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Davi", 16, 60, "123");
		Fornecedor f = Fornecedor.newInstance("Davi", 16, 60, "123", 1000, 2000);
		p = f; // IMPORTANTE
	}
}