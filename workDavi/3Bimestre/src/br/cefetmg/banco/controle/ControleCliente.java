package br.cefetmg.banco.controle;

import br.cefetmg.banco.dados.RepoCliente;

public class ControleCliente {
	private RepoCliente repoCliente;
	
	public ControleCliente() {
		repoCliente = new RepoCliente();
	}
	
	public boolean adiciona(Cliente cliente) {
		if (repoCliente.buscar(cliente.getCpf()) != null) {
			return false;
		}
		return repoCliente.adicionar(cliente);
	}

	public boolean alterar(Cliente cliente) {
		return repoCliente.alterar(cliente);
	}

	public boolean excluir(String cpf) {
		return repoCliente.excluir(cpf);
	}

	public Cliente buscar(String cpf) {
		return repoCliente.buscar(cpf);
	}

	public Cliente[] listar() {
		return repoCliente.listar();
	}

}
