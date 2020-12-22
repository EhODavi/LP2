
class PessoaTeste {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Davi";
		pessoa.idade = 16;
		System.out.println("Nome: " + pessoa.nome);
		System.out.println("Idade: " + pessoa.idade);
		pessoa.fazAniversario();
		System.out.println("Idade após o aniversário: " + pessoa.idade);
	}
}
