
public class Endereco {
	private String tipo;
	private String logradouro; // rua, av, praça, travessa
	private int numero;
	private String cidade;
	private String uf;
	private String cep;

	public static Endereco newInstance(String tipo, String logradouro,
			int numero, String cidade, String uf, String cep) {
		if (tipo != null && logradouro != null && numero > 0 && cidade != null
				&& uf != null && uf.length() == 2 && cep != null
				&& (cep.length() == 8 || cep.length() == 9))
			return new Endereco(tipo, logradouro, numero, cidade, uf, cep);
		else
			return null;
	}

	private Endereco(String tipo, String logradouro, int numero, String cidade,
			String uf, String cep) {
		this.tipo = tipo;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}

	public Endereco(Endereco endereco) {
		this(endereco.tipo, endereco.logradouro, endereco.numero,
				endereco.cidade, endereco.uf, endereco.cep);
	}

	public String getTipo() {
		return tipo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public String getCidade() {
		return cidade;
	}

	public String getUf() {
		return uf;
	}

	public String getCep() {
		return cep;
	}

}
