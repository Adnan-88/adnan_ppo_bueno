package view;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import service.ManipulacionService;

public class PruebaDatos {

	public static void main(String[] args) {
		List<Integer> nums=List.of(3,8,2,11,4,9);
		ManipulacionService service=new ManipulacionService();
		//mostrar suma de los pares por un lado, y suma de los positivos por otro
		/*Predicate<Integer> condicion=new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t%2==0; //devuelve true si es par
			}
		};
		System.out.println("Suma pares: "+service.sumaPorCriterio(nums,condicion));
		
		//los positivos
		System.out.println("Suma positivos: "+service.sumaPorCriterio(nums,new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t>0; //devuelve true si positivo
			}
		}));*/
		
		System.out.println("Suma pares: "+service.sumaPorCriterio(nums,t->t%2==0));
		System.out.println("Suma positivos: "+service.sumaPorCriterio(nums,t->t>0));
		
		/* las dos líneas anteriores, es igual a lo siguiente aunque la idea de las lambdas es no escribir mucho
		 Predicate<Integer> condicionPositivos
		Predicate<Integer> condicionPar=t->t%2==0; //implementación de Predicate para pares
		System.out.println("Suma pares: "+service.sumaPorCriterio(nums,condicion));
		System.out.println("Suma positivos: "+service.sumaPorCriterio(nums,t->t>0));*/
		
		
		//imprime los numeros de la lista:
		service.procesaLista(nums, x->System.out.println(x));
		
		//imprime los pares de la lista:
		service.procesaColeccionPorCriterio(nums, x->System.out.println(x), x->x%2==0);
		
		//guarda en fichero los positivos de la lista:
		service.procesaColeccionPorCriterio(nums,
				x->{
					String ruta="c:\\temp\\lambda.txt";
					try(FileOutputStream fos=new FileOutputStream(ruta,true);
							PrintStream out=new PrintStream(fos);){
						out.println(x);
					}
					catch(IOException ex) {
						ex.printStackTrace();
					}
				},
				x->x>0);
		
		//suma de los cuadrados de la lista
		System.out.println(service.sumaTranformados(nums, n->n*n));
		
		//suma de los cuadrados de las raices cúbicas de cada elemento
		
		
		
		
		
	}

}
