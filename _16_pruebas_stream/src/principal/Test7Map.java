package principal;

import java.util.List;

public class Test7Map {

	public static void main(String[] args) {
		List<String> nombres=List.of("leche","atún","vino","patatas","leche","agua","vino","lechuga");
		//¿cuántos productos, no repetidos, tienen más de 6 caracteres?
		nombres.stream()
		.distinct()
		.filter(n->n.length()>6) //aqui estoy filtrando cadenas de caracteres
		.count();
		
		 nombres.stream()
		 .distinct() //Stream<String>
		 .map(s->s.length()) //Stream<Integer>
		 .filter(n->n>6) //aqui lo que estoy filtrando son números
		 .count();
		 
		 
		//suma del total de caracteres de todas las cadenas no repetidas
		 System.out.println(nombres.stream()
		 .distinct() //Stream<String>
		 .mapToInt(s->s.length()) //IntStream
		 .sum());
		
	
	}

}
