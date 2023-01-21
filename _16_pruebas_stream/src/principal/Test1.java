package principal;

import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,8,-5,10,8,2,11,27,-5,-12,41,10);
		//muestra el total
		System.out.println(nums.stream().count());
		//muestra cada elemento
		/*nums.stream()
		.forEach(n->System.out.println(n));*/
		//muestrame los elementos sin duplicados
		nums.stream()
		.distinct()
		.forEach(n->System.out.println(n));

	}

}
