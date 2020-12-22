import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Utilizar List no trabalho e não usar herança
public class TesteList {
	public static void main(String[] args) {
		// String [] nomes = new String[];

		List<String> nomes = new ArrayList<String>(); // Funciona apenas com
														// objetos

		// add: adiciona no final
		nomes.add("Guilherme");
		nomes.add("Gabriel");
		nomes.add("Felipe");
		nomes.add("André");
		nomes.add("Christiano");
		nomes.add("Raissa");

		for (int i = 0; i < nomes.size(); i++) {
			System.out.println("Nome: " + nomes.get(i));
			System.out.println(nomes);
		}

		// remove(i): remove da posição 1
		nomes.remove(1);
		System.out.println(nomes);
		
		nomes.remove("André"); // Remover pelo objeto
		System.out.println(nomes);
		
		// add(i, nome) : adiciona na posição
		
		nomes.add(1, "Eliseu");
		System.out.println(nomes);
		
		// set(1, nome) : substitui o elemento na posição 1
		
		nomes.set(1, "Diogo");
		System.out.println(nomes);
		
		// remover o último elemento
		
		nomes.remove(nomes.size() - 1);
		System.out.println(nomes);
		
		// ordenar
		
		Collections.sort(nomes);
		System.out.println(nomes);
		
		System.out.println(nomes.size());
	}
}
