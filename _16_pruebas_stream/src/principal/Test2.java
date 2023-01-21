package principal;

import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,-5,6,10,6,8,2,11,27,-5,-12,41,10);
		//muestra los 7 primeros números de la lista, sin contar duplicados
		nums.stream()
		.distinct()
		.limit(7)
		.forEach(n -> System.out.println(n));
		
		//¿hay algún negativo?
		System.out.println("¿Algún negativo?"+nums.stream()
				.anyMatch(n->n<0));
		//¿son todos pares?
		System.out.println("¿Todos pares?"+nums.stream()
				.allMatch(n->n%2==0));
	}

}
