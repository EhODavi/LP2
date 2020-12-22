
class Aluno {
	int numMatricula;
	String nome;
	String sobrenome;
	String endereco;
	String telefone;
	Disciplina[] disciplinas = new Disciplina[12];

	int numeroAcima() {
		int contador = 0;
		int i;
		for (i = 0; i < this.disciplinas.length; i++) {
			if (this.disciplinas[i] != null) {
				if (this.disciplinas[i].nota >= 60) {
					contador++;
				}
			}
		}
		return contador;
	}
}
