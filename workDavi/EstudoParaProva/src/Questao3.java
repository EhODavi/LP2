
class Questao3 {
	public static void main(String[] args) {
		Frase frase = new Frase();
		frase.add("Eu");
		frase.add("ainda");
		frase.add("quero");
		frase.add("passar");
		System.out.println(frase.frase);
		int num = frase.temQuantasLetras('s');
		System.out.println("O numero de letras é " + num);
	}
}
