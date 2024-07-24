package Lore;
import java.util.ArrayList;
import java.util.Arrays;
public class ForEach {

	public static void main(String[] args) {
		String[]disciplinas= {"matemática", "filosofia", "história", "fisica"};
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
		
		novaLista.add("Geografia");
		novaLista.add("Lingua inglesa");
		
		for (String i: novaLista)
		{
			System.out.println("Disciplinas: "+ i);
		}

	}

}
