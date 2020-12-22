package br.cefetmg.banco.controle;

public class Banco {
	private String nome;
	private ControleCliente ctlCliente;

	// Guarda a referencia para a única instancia de banco
	private static Banco instance;

	private Banco(String nome) {
		this.nome = nome;
		ctlCliente = new ControleCliente();
	}

	// getInstance cria o objeto
	public static Banco getInstance() {
		if (instance == null) {
			instance = new Banco("Banco do CEFET");
		}
		return instance;
	}

	public String getNome() {
		return nome;
	}

	public boolean adicionar(Cliente cliente) {
		return ctlCliente.adiciona(cliente);
	}

	public boolean alterar(Cliente cliente) {
		return ctlCliente.alterar(cliente);
	}

	public boolean excluir(String cpf) {
		return ctlCliente.excluir(cpf);
	}

	public Cliente buscar(String cpf) {
		return ctlCliente.buscar(cpf);
	}

	public Cliente[] listar() {
		return ctlCliente.listar();
	}

}
