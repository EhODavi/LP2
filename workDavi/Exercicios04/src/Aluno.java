
class Aluno {
	private int numMatricula;
	private static int identificadorUnico;
	private Pessoa p;
	private Disciplina[] d;
	private String dtMatricula;

	public boolean matricula(Disciplina d) {
		boolean teste = false;
		boolean teste1 = true;
		int i;

		if (d != null) {
			for (i = 0; i < this.d.length; i++) {
				if (this.d[i] != null) {
					if (this.d[i].getNomeDisciplina().equals(d.getNomeDisciplina())) {
						teste1 = false;
					}
				}
			}
			if (teste1 != false) {
				for (i = 0; i < this.d.length; i++) {
					if (this.d[i] == null && teste == false) {
						this.d[i] = d;
						teste = true;
					}
				}
			}
		}
		return teste;
	}

	public boolean tranca(Disciplina d) {
		boolean teste = false;
		int i;

		if (d != null) {
			for (i = 0; i < this.d.length; i++) {
				if (this.d[i] != null) {
					if (this.d[i].getNomeDisciplina().equals(d.getNomeDisciplina())) {
						this.d[i] = null;
						teste = true;
					}
				}
			}
		}
		return teste;
	}

	private Aluno(Pessoa p, int tamanhoVetor, String dtMatricula) {
		this.p = p;
		this.d = new Disciplina[tamanhoVetor];
		this.dtMatricula = dtMatricula;
		this.numMatricula = Aluno.identificadorUnico;
		Aluno.identificadorUnico++;
	}

	public static Aluno newInstance(Pessoa p, int tamanhoVetor, String dtMatricula) {
		if (p != null && tamanhoVetor > 0 && dtMatricula != null) {
			return new Aluno(p, tamanhoVetor, dtMatricula);
		} else {
			return null;
		}
	}

	public int getNumMatricula() {
		return this.numMatricula;
	}

	public static int getIdentificadorUnico() {
		return Aluno.identificadorUnico;
	}

	public Pessoa getP() {
		return this.p;
	}

	public Disciplina[] getD() {
		return this.d;
	}

	public String getDtMatricula() {
		return this.dtMatricula;
	}

}
