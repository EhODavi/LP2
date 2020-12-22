package listaExercicios05;

class TesteCliente {
	public static void main(String[] args) {
		Cliente c = Cliente.newInstance("Davi", 16, 12, "123", 600, 600);
		System.out.println(c.obterSaldo());
	}
}
