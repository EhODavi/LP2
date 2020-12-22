package listaExercicios05;

public class TestaEmpregado {
	public static void main(String[] args) {
		Empregado e = Empregado.newInstance("Davi", 15, 12, "123",421, 1000, 0.01);
		System.out.println(e.calcularSalario());
	}
}
