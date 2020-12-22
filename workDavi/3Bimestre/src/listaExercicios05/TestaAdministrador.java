package listaExercicios05;

public class TestaAdministrador {
	public static void main(String[] args) {
		Administrador a = Administrador.newInstance("Davi", 16, 60,"123", 12, 1000, 0.01, 1000);
		System.out.println(a.calcularSalario());
	}
}
