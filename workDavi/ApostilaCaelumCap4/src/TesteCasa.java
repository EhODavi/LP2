
class TesteCasa {
	public static void main(String[] args) {
		Casa casa = new Casa();
		casa.pinta("Amarelo");

		casa.porta1.aberta = false;
		casa.porta1.cor = "Preto";
		casa.porta1.dimensaoX = 100;
		casa.porta1.dimensaoY = 100;
		casa.porta1.dimensaoZ = 100;

		casa.porta2.aberta = false;
		casa.porta2.cor = "Marrom";
		casa.porta2.dimensaoX = 100;
		casa.porta2.dimensaoY = 100;
		casa.porta2.dimensaoZ = 100;

		casa.porta3.aberta = false;
		casa.porta3.cor = "Marrom";
		casa.porta3.dimensaoX = 100;
		casa.porta3.dimensaoY = 100;
		casa.porta3.dimensaoZ = 100;

		casa.porta1.abre();
		casa.porta2.abre();
		casa.porta3.abre();

		casa.porta1.fecha();
		casa.porta2.fecha();
		casa.porta3.fecha();

		System.out.println("Numero de Portas abertas: " + casa.quantasPortasEstaoAbertas());

	}
}