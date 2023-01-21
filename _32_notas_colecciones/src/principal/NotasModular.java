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
public class NotasModular {
	
//El método main que se encarga de la lectura de notas
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> notas=new ArrayList<>();
		int nota;
		do {
		     System.out.println("introduce nota");
		     nota=sc.nextInt();
		     if(nota>=0&&nota<=10) {//solo guarda la nota si está entre 0 y 10
		          notas.add(nota); 
		     }     
		}while(nota>=0);
		
		System.out.println("La media es: "+calcularMedia(notas));
		System.out.println("Aprobados: "+calcularAprobados(notas));
		System.out.println("Nota mayor: "+calcularMax(notas));
		System.out.println("Nota menor: "+calcularMin(notas));
	
	}
	//método que recibe una lista de numeros y devuelva la media
	static int calcularMedia(ArrayList<Integer> lista) {
		int media=0;
		for(int i=0;i<lista.size();i++) {
			media=media+lista.get(i);
		}
		media=media/lista.size();
		return media;
	}
	//método que recibe una lista de numeros y devuelve el número de aprobados
	
	static int calcularAprobados(ArrayList<Integer> lista) {
		int aprobados=0;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i)>=5) {
				aprobados++;
			}
		}
		return aprobados;
	}
	
	static int calcularMax(ArrayList<Integer> lista) {
		int notaMax=lista.get(0);
		for(int i=0;i<lista.size();i++) {
			notaMax=Math.max(notaMax, lista.get(i));
		}
		return notaMax;
	}
	static int calcularMin(ArrayList<Integer> lista) {
		int notaMin=lista.get(0);
		for(int i=0;i<lista.size();i++) {
			notaMin=Math.min(notaMin, lista.get(i));
		}
		return notaMin;
	}

}
