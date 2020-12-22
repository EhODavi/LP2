
public class TesteProto {
	public static void main(String[] args) {

		Protozoario p1 = new Protozoario();
		System.out.println("p1: " + p1);

		Protozoario p2 = new Protozoario();
		System.out.println("p2: " + p2);

		int[] gen = { 2, 1, 0, 0, 1, 1, 2, 2, 2, 1 };
		Protozoario p3 = Protozoario.newInstance(gen);
		System.out.println("p3: " + p3);

		Protozoario p4 = p3.getClone();
		System.out.println("p4: " + p4);
		
		System.out.println("Mutação");
		p3.genotipo[2] = 3;
		
		System.out.println("p3: " + p3);
		System.out.println("p4: " + p4);
		
	}
}
