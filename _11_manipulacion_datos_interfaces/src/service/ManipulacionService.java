package service;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ManipulacionService {
	/*public int sumaPares(List<Integer> numeros) {
		int suma=0;
		for(int n:numeros) {
			if(n%2) {
				suma+=n;
			}
		}
		return suma;

	}
	
	public int sumaPositivos(List<Integer> numeros) {
		int suma=0;
		for(int n:numeros) {
			if(n>0) {
				suma+=n;
			}
		}
		return suma;
	}*/
	
	public int sumaPorCriterio(List<Integer> numeros,Predicate<Integer> condicion) {
		int suma=0;
		for(int n:numeros) {
			if(condicion.test(n)) {
				suma+=n;
			}
		}
		return suma;
	}
	
	//método que recibe lista de números y los imprime
	//método que recibe lista de números y los guarda en un fichero
	//método que recibe lista de números y los manda a la nube
	//mediante un único método, aplicamos el procesado que nos manden a cada
	//elemento de la lista
	public void procesaLista(List<Integer> numeros, Consumer<Integer> procesa) {
		for(int n:numeros) {
			procesa.accept(n);
		}
	}
	
	
	//método que recibe una lista de números e imprime los pares
	//método que recibe un conjunto de números y guarda en un fichero los positivos
	//método que recibe una lista y guarda en un fichero los múltiplos de cinco
	//método que recibe un conjunto de números e imprime los negativos
	
	public void procesaColeccionPorCriterio(Collection<Integer> numeros,Consumer<Integer> proceso,Predicate<Integer> criterio) {
		for(Integer n:numeros) {
			if(criterio.test(n)) {
				proceso.accept(n);
			}
		}
	}
	
	//método que recibe una lista y devuelve la suma de los cuadrados de los números de la lista
	//método que recibe una lista y devuelve la suma de las raices cúbicas de los números de la lista
	public int sumaTranformados(Collection<Integer> numeros, Function<Integer,Integer> fun) {
		int suma=0;
		for(Integer n:numeros) {
			suma+=fun.apply(n); //sumamos el resultado de transformar cada número según la función
		}
		return suma;
	}
	
	
	
	
}
