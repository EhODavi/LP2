package listaExercicios05;

public class Bacteria {
	private int tempoDeVida = 0;
	private double lixoMetabolizado;
	private double peso = 10;

	public void passagemDeHora() {
		lixoMetabolizado = lixoMetabolizado + (2 * peso);
		tempoDeVida++;
		if(tempoDeVida % 24 == 0) {
			this.peso = this.peso + (this.peso * 0.1);
		}
	}

	public int getTempoDeVida() {
		return this.tempoDeVida;
	}

	public double getLixoMetabolizado() {
		return this.lixoMetabolizado;
	}
}
