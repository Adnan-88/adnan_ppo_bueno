package principal;

import java.util.List;

public class Test9Peek {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,-5,10,8,2,11,27,-5,-12,41,10);
		//hacer un programa que muestre los positivos no repetidos y nos diga cuantos hay
		
		System.out.println("Total: "+nums.stream()
		.filter(n->n>0)
		.distinct()
		.peek(n->System.out.println(n)) //Stream<Integer>
		.count()); //long
		

	}

}
