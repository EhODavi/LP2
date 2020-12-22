package listaExercicios05;

public class TestaContainer {
	public static void main(String[] args) {
//		ContainerDryBox dry = ContainerDryBox.newInstance("S�o Paulo","Santos", 5000, true);
//		
//		TipoAlimentacao tipo = TipoAlimentacao.DIESEL;
//		
//		ContainerRefrigerado ref = ContainerRefrigerado.newInstance("S�o Paulo","Santos", 5000, 40,TipoAlimentacao.DIESEL);
//		
//		Container c = dry; // Polimorfismo
//		
//		Sistema sis = new Sistema();
//		sis.adiciona(dry);
//		sis.adiciona(ref);
		
		Sistema sis = new Sistema();
		sis.adiciona(ContainerDryBox.newInstance("S�o Paulo","Santos", 5000, true));
		sis.adiciona(ContainerDryBox.newInstance("S�o Paulo","Belo Horizonte", 5000, true));
		sis.adiciona(ContainerDryBox.newInstance("S�o Paulo","Ipatinga", 5000, true));
		sis.adiciona(ContainerRefrigerado.newInstance("S�o Paulo","Santos", 5000, 40,TipoAlimentacao.DIESEL));
		sis.adiciona(ContainerRefrigerado.newInstance("S�o Paulo","Tim�teo", 5000, 40,TipoAlimentacao.DIESEL));
		sis.adiciona(ContainerRefrigerado.newInstance("S�o Paulo","Rio de Janeiro", 5000, 40,TipoAlimentacao.DIESEL));
		
		System.out.println(sis.numDryBox());
		
	}
}