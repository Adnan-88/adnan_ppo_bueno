package principal;

import java.util.ArrayList;

public class PruebaLista {

	public static void main(String[] args) {
		ArrayList<Integer> numeros=new ArrayList<>();
		ArrayList<String> textos=new ArrayList<>();
		textos.add("lunes");
		textos.add("martes");
		textos.add("miércoles");
		System.out.println(textos.get(1));
		textos.add(1, "jueves");//añade el jueves a la posición 1
		System.out.println(textos.get(3));
		textos.remove(0);
		System.out.println(textos.get(0));
		//recorrer arraylist
		for(int i=0;i<textos.size();i++) {
			System.out.println(textos.get(i));
		}
		
		//lista de Integer
		numeros.add(1, 20);
	}

}
