package Lore;
import java.util.ArrayList;
public class Atividade2 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			numeros.add(i);

	}
		for (int i = 0; i < numeros.size(); i++) {
            numeros.set(i, numeros.get(i) * 2);
		}
		System.out.println(numeros);
	}
}
