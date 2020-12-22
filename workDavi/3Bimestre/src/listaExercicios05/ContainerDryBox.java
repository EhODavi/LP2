package listaExercicios05;

public class ContainerDryBox extends Container {
	private boolean transportaAnimais;

	private ContainerDryBox(String origem, String destino, double peso, boolean transportaAnimais) {
		super(origem, destino, peso);
		this.transportaAnimais = transportaAnimais;
	}
	
	public static ContainerDryBox newInstance(String origem, String destino, double peso, boolean transportaAnimais) {
		if(origem != null && destino != null && peso > 0) {
			return new ContainerDryBox(origem, destino, peso, transportaAnimais);
		} else {
			return null;
		}
	}

	public boolean getTransportaAnimais() {
		return transportaAnimais;
	}

	public void setTransportaAnimais(boolean transportaAnimais) {
		this.transportaAnimais = transportaAnimais;
	}
}
