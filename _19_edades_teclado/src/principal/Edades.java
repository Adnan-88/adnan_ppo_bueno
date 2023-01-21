package principal;

import java.util.Scanner;

public class Edades {


	public static void main(String[] args) {
		//solicita la introducción de cinco edades, las guarda en una array
		// y después muestra la media de edad
		int[] edades=new int[5];
		Scanner sc=new Scanner(System.in);
		//leamos las cinco edades
		for(int i=0;i<edades.length;i++)  {
			media=media+edades[i];

	}
		media=media/edades.length;
		System.out.println(media);

}

	
}