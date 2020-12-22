package listaExercicios05;

class ProfessorDaFaculdade extends EmpregadoDaFaculdade {
	private int horasDeAula;

	double getGastos() {
		return super.getSalario() + this.horasDeAula * 10;
	}

	String getInfo() {
		String informacaoBasica = super.getInfo();
		String informacao = informacaoBasica + " horas de aula: " + this.horasDeAula;
		return informacao;
	}
	// m�todos de get, set e outros que forem necess�rios
}