
class TesteAluno {
	public static void main(String[] args) {
		String dtMatricula = "2017/02/12";
		Pessoa p = Pessoa.newInstance("Davi", 17);
		Aluno a = Aluno.newInstance(p, 3, dtMatricula);
		Disciplina d = new Disciplina();
		d.setNomeDisciplina("Geografia");
		d.setProfessor("Romerito");
		a.matricula(d);
		System.out.println(a.getD()[0].getNomeDisciplina());
	}
}
