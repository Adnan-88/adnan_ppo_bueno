package principal;

import java.util.List;

public class TestForeach {

	public static void main(String[] args) {
		List<Integer> nums=List.of(8,2,5,11,4);
		for(int n:nums) {
			System.out.println(n);
		}
		
		nums.forEach(n->System.out.println(n));

	}

}
