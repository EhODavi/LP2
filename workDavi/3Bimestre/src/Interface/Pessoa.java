package Interface;

import java.util.Date;

public class Pessoa {
	private long numero;
	private String nome;
	private String cpf;
	private Date dataNasc;

	public Pessoa(long numero, String nome, String cpf, Date dataNasc) {
		this.numero = numero;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
	}

	public long getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

}
