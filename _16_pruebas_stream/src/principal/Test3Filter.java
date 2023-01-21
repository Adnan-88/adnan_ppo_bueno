package principal;

import java.util.Arrays;
import java.util.List;

public class Test3Filter {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,-5,10,8,2,11,27,-5,-12,41,10);
		//¿cuántos números pares diferentes hay?
		System.out.println(nums.stream()
				.distinct() //quitamos duplicados
				.filter(n->n%2==0) //nos quedamos con los pares
				.count());
				/*List<String> nombres=List.of("leche","atún","vino","patatas","leche","agua","vino","lechuga");*/
				String nombres="leche,atun,vino,patatas,leche,agua,vino,lechuga";
				//¿cuantos nombres diferentes de menos de 6 caracteres hay?
				System.out.println(
						Arrays.stream(nombres.split(",")) //Stream<String>
						.distinct()
						.filter(n->n.length()<6)
						.count()
						);

	}

}
