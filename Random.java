package Lore;
import java.util.ArrayList;
import java.util.Random;

public class Random {

	public static void main(String[] args) {
		ArrayList<Integer> numeros= new ArrayList<>();
		Random random = new Random();
		
		for(int i = 0; i < 5; i++) {
			int numeroAleatório = random.nextInt(100); 
			numeros.add(numeroAleatório);
		}
		for(int numero:numeros) {
			System.out.println(numero);
		}
	}

}
