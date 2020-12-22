package RVCA;

class InventarioEstoque {
	private Produto[] produtos = new Produto[50];
	private double[] valorTotal = new double[50];
	private int[] quantidade = new int[50];
	private static int numProdutos;

	public boolean adicionar(Produto produto, int quantidade) {
		if (produto != null && numProdutos < produtos.length) {
			produtos[numProdutos] = produto;
			valorTotal[numProdutos] = quantidade * produto.getValorPorUnidadeMedida();
			this.quantidade[numProdutos] = quantidade;
			InventarioEstoque.numProdutos++;
			return true;
		} else {
			return false;
		}
	}

	public boolean alterar(Produto produto) {
		for (int i = 0; i < InventarioEstoque.numProdutos; i++) {
			if (produtos[i].getCodigo() == produto.getCodigo()) {
				produtos[i] = produto;
				return true;
			}
		}
		return false;
	}

	public boolean excluir(int codigo) {

		// localizar o cliente a ser excluído
		for (int i = 0; i < InventarioEstoque.numProdutos; i++) {
			if (codigo == produtos[i].getCodigo()) {
				for (int j = i; j < InventarioEstoque.numProdutos; j++) {
					produtos[j] = produtos[j + 1];
				}
				InventarioEstoque.numProdutos--;
				return true;
			}
		}
		return false;
	}

	public Produto buscar(int codigo) {
		for (int i = 0; i < InventarioEstoque.numProdutos; i++) {
			if (codigo == produtos[i].getCodigo()) {
				return produtos[i];
			}
		}
		return null;
	}

	public Produto[] listar() {
		Produto[] c = new Produto[produtos.length];
		for (int i = 0; i < InventarioEstoque.numProdutos; i++) {
			c[i] = produtos[i];
		}
		return c;
	}
}
