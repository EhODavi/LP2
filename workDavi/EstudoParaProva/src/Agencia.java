import java.util.Scanner;

class Agencia {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Quantas Candidatas: ");
		int num = leia.nextInt();
		Candidata[] candidatas = new Candidata[num];
		leia.close();	
	}

	public static boolean excluirCandidata(int numInscricao, Candidata[] candidatas) {
		boolean logico = false;
		int i;
		int posicaoRetirada = 0;
		for (i = 0; i < candidatas.length; i++) {
			if (candidatas[i] != null) {
				if (numInscricao == candidatas[i].numInscricao) {
					candidatas[i] = null;
					logico = true;
					posicaoRetirada = i;
				}
			}
		}
		if (logico == true) {
			if (posicaoRetirada != candidatas.length - 1) {
				for (i = posicaoRetirada; i < candidatas.length - 1; i++) {
					candidatas[i] = candidatas[i + 1];
				}
			}
		}
		return logico;
	}
	
	public static Candidata[] candidatasMaiores(double media, Candidata[] candidatas) {
		Candidata[] cand = new Candidata[candidatas.length];
		int acumulador;
		double mediaCandidata;
		int contador = 0;
		int i;
		int j;
		for (i = 0; i < candidatas.length; i++) {
			acumulador = 0;
			if (candidatas[i] != null) {
				for (j = 0; j < candidatas[i].notas.length; j++) {
					acumulador = acumulador + candidatas[i].notas[j];
				}
				mediaCandidata = acumulador / 5;
				if (mediaCandidata >= media) {
					cand[contador] = candidatas[i];
					contador++;
				}
			}
		}
		contador = 0;
		for (i = 0; i < cand.length; i++) {
			if (cand[i] == null) {
				contador++;
			}
		}
		if (contador == cand.length) {
			return null;
		}
		return cand;
	}
}
