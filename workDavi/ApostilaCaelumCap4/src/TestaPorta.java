
class TestaPorta {
	public static void main(String[] args) {

		Porta porta = new Porta();
		porta.aberta = false;
		porta.cor = "Marrom";
		porta.dimensaoX = 100;
		porta.dimensaoY = 100;
		porta.dimensaoZ = 100;

		porta.abre();
		porta.fecha();
		porta.pinta("Azul");
		boolean aberta = porta.estaAberta();
	}
}
