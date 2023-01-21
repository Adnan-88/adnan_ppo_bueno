package service;

import java.util.Collection;

public class OperacionesColeccion {
	public int sumaColeccion(Collection<Integer> col) {
		int suma=0;
		for(Integer n:col) {
			suma+=n;
		}
		return suma;
	}
	//realizar un segundo método, que reciba dos colecciones de números
	//y nos diga cuantos números se encuentran en ambas colecciones
	
	public int sumaColeccion(Collection<Integer> col1, Collection<Integer> col2) {
		int rep=0;
		for(Integer n:col1) {
			if(col2.contains(n)) {
				rep++;
			}
		}
		return rep;
	}

}
