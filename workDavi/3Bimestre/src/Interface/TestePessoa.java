package Interface;

public class TestePessoa {
	public static void main(String[] args) {
		Janela4 j = new Janela4(23);
		Pessoa p = j.getPessoa();
		System.out.println(p.getNome());
	}
}
