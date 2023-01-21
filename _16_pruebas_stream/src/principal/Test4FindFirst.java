package principal;

import java.util.List;

public class Test4FindFirst {

	public static void main(String[] args) {
		List<String> nombres=List.of("leche","atún","vino","patatas","leche","agua","vino","lechuga");
		//mostrar el nombre del primer producto que comience por "a", si no hubiera ninguno
		//que muestre el mensaje "no hay ninguno"
		
		System.out.println(nombres.stream() //Stream<String>
		.filter(n->n.startsWith("a")) //Stream<String>
		.findFirst() //Optional<String>
		.orElse("No hay nada") //String
		);

	}

}
