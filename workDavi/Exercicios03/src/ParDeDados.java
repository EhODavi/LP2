import java.util.Random;

class ParDeDados {
	int[] dado1 = new int[6];
	int[] dado2 = new int[6];

	int rolarDado1() {
		Random aleatorio = new Random();
		int posicao1;
		posicao1 = aleatorio.nextInt(6) + 1;
		return posicao1;
	}
	int rolarDado2() {
		Random aleatorio = new Random();
		int posicao2;
		posicao2 = aleatorio.nextInt(6) + 1;
		return posicao2;
	}
}
