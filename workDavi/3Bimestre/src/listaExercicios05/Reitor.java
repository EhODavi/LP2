package listaExercicios05;

class Reitor extends EmpregadoDaFaculdade {
	// informa��es extras
	String getInfo() {
		return super.getInfo() + " e ele � um reitor";
	}
	// n�o sobrescrevemos o getGastos!!!
}
