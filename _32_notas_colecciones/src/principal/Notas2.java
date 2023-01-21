package principal;

import java.util.ArrayList;
import java.util.Scanner;

//Realizar un programa que solicite al usuario la introducción de una nota, si la nota es positiva la guarda
//la guarda y le pide la introducción de una nueva nota, si es negativa, no la guarda y deja de pedir mas
//Finalmente, mostrará:
//-Nota media
//-Número de aprobados
//-Nota más alta
//-Nota más baja
public class Notas2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> notas=new ArrayList<>();
		int nota;
		int media=0;
		int aprobados=0;
		int notaMax=0;
		int notaMin=10; //se inicializa a la nota más alta posible
		do {
		     //lee una nota y la guardas en el arraylist
		     System.out.println("introduce nota");
		     nota=sc.nextInt();
		     //solo guarda la nota si está entre 0 y 10
		     if(nota>=0&&nota<=10) {
		          notas.add(nota); 
		     }     
		}while(nota>=0);//si la nota es positiva, vuelve a pedir otra
		
		for(int i=0;i<notas.size();i++) {
			//para la media
			media=media+notas.get(i);
			//para los aprobados
			if(notas.get(i)>=5) {
				aprobados++;
			}
			//para la nota mayor
			/*if(notas.get(i)>notaMax) {
			 notaMax=notas.get(i);
			   }*/
			if(notas.get(i)>notaMax) {
				notaMax=notas.get(i);
			}
			//para la nota menor
			/*if(notas.get(i)<notaMin) {
			 notaMin=notas.get(i);
			   }*/
			if(notas.get(i)<notaMin) {
				notaMin=notas.get(i);
			}	
	    }
		media=media/notas.size();
		System.out.println("La media es: "+media);
		System.out.println("Número de aprobados: "+aprobados);
		System.out.println("Nota mayor: "+notaMax);
		System.out.println("Nota menor: "+notaMin);
    }	
}
