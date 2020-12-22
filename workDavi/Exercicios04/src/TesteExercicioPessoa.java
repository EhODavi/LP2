
class TesteExercicioPessoa {
	public static void main(String[] args) {
		ExercicioPessoa p1;
		p1 = ExercicioPessoa.newInstance("davi", "oliveira", "006"); // É POSSIVEL CHAMAR POIS O NEW INSTANCE É STATIC
		System.out.println(p1.getNome());
	}
}
