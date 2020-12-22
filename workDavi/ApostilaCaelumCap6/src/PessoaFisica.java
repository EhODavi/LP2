class PessoaFisica {
	private String CPF;

	private PessoaFisica(String CPF) {
		this.CPF = CPF;
	}

	public static PessoaFisica newInstance(String CPF) {
		if (CPF != null) {
			return new PessoaFisica(CPF);
		}
		return null;
	}

	public String getCPF() {
		return this.CPF;
	}
}
