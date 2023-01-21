package principal;

import java.util.ArrayList;
import java.util.List;

public class TestSort {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<>(List.of(8,2,5,11,4));
		//ordenar de menor a mayor
		/*nums.sort((a,b)->{
			if(a>b) {
				return 1;
			}else if(a<b) {
				return -1;
			}else {
				return 0;
			}
		});*/
		nums.sort((a,b)->a-b);
		nums.forEach(n->System.out.println(n));
		
		//ordenar de mayor a menor
		nums.sort((a,b)->b-a);
		nums.forEach(n->System.out.println(n));
		
		//ordenar por número de caracteres
		List<String> cadenas=new ArrayList<String>(List.of("salida","armario","luna","amarillo"));
		cadenas.sort((a,b)->a.length()-b.length());
		//cadenas.forEach(n->System.out.println(n));
		System.out.println(cadenas);
		
		//ordenar alfabeticamente 
		List<String> cadenas2=new ArrayList<String>(List.of("salida","armario","luna","amarillo"));
		cadenas2.sort((a,b)->a.compareTo(b));
		System.out.println(cadenas2);
	}

}
