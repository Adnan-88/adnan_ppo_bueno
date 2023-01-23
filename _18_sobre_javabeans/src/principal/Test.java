package principal;

import model.Ciudad2;
import model.Ciudad3;

public class Test {

	public static void main(String[] args) {
		Ciudad2 c=new Ciudad2("Badajoz", "España");
		System.out.println(c.toString());
		//un record es inmutable
		Ciudad3 c3=new Ciudad3("Madrid","España");
		System.out.println(c3.nombre());
		System.out.println(c3.pais());
		System.out.println(c3);
		Ciudad3 cr=new Ciudad3();
		

	}

}
