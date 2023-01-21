package view;

import model.Curso;
import service.CursosServiceFichero;

public class Test {

	public static void main(String[] args) {
		CursosServiceFichero service=new CursosServiceFichero();
		service.agregarCurso(new Curso("Java",200,100,"programación"));
		service.agregarCurso(new Curso("JavaScript",80,50,"programación"));
		service.agregarCurso(new Curso("Python",150,80,"programación"));
		service.eliminarPorPrecio(100);
		System.out.println(service.cursoPorTematica("programación").size());
		
	}

}
