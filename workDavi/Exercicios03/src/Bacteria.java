
class Bacteria {
	int tempoDeVida = 0;
	double lixoMetabolizado;
	double peso = 10;

	void passagemDeHora() {
		lixoMetabolizado = lixoMetabolizado + (2 * peso);
		tempoDeVida++;
	}

	int getTempoDeVida() {
		return tempoDeVida;
	}

	double getLixoMetabolizado() {
		return lixoMetabolizado;
	}
}
