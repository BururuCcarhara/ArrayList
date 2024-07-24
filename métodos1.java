package Lore;
import java.util.ArrayList;
public class métodos1 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList();
		
		numeros.add(10);
		numeros.add(20);
		
		System.out.println ("adicionando elemento: " +numeros.get(0));
		System.out.println ("adicionando elemento: " +numeros.get(1));
		
		numeros.set (1, 25);
		System.out.println("modificou o valor da posição 1: " +numeros.get(1));
		numeros.remove(0);
		System.out.println("removeu o valor da posição 0: " +numeros.get(0));
		
		System.out.println(numeros.size());

	}

}
