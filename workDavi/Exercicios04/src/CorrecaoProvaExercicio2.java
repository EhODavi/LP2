
class CorrecaoProvaExercicio2 {
	private double a;
	private double b;
	private double c;
	private int codigoTriangulo;
	private static int numTriangulosCriados;

	private CorrecaoProvaExercicio2(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.codigoTriangulo = CorrecaoProvaExercicio2.numTriangulosCriados;
	}

	public CorrecaoProvaExercicio2 instanciar(double a, double b, double c) {
		if (a > 0 && b > 0 && c > 0 && a < b + c && b < a + c && c < a + b) {
			return new CorrecaoProvaExercicio2(a, b, c);
		} else {
			return null;
		}
	}

	public double perimetro() {
		return this.a + this.b + this.c;
	}

	public double area() {
		return 0;
	}
	
	public double getA() {
		return this.a;
	}
	
	public double getB() {
		return this.b;
	}
	
	public double getC() {
		return this.c;
	}
	
	public double getCodigoTriangulo() {
		return this.codigoTriangulo;
	}
	
	public static double getNumTriangulosCriados() {
		return CorrecaoProvaExercicio2.numTriangulosCriados;
	}
}
