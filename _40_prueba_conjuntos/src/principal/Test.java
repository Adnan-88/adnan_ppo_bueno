package principal;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		//hashet no hay posiciones, si no importa la posicion
		
		HashSet<String> datos=new HashSet<>();
		
		datos.add("Elemento 1");
		datos.add("Elemento 2");
		datos.add("Elemento 3");
		datos.add("Elemento 2");
		
		System.out.println(datos.size());
		
		for(String s:datos) {
			System.out.println(s);
		}

	}

}
