
class TestaBacteria {
	public static void main(String[] args) {
		Colonia c = new Colonia(1);
		int numHorasSIm = 50;
		System.out.println("Hora\tNo. Bac\tLixo Meta");
		for (int i = 1; i <= numHorasSIm; i++) {
			c.passar1Hora();
			System.out.println(i + "\t" + c.numBacterias + "\t" +  c.getTotalDeLIxo());
		}
	}
}
