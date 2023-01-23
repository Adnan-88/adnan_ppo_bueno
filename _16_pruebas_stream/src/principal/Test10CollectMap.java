package principal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test10CollectMap {

	public static void main(String[] args) {
		List<String> empleados=List.of("112F|Angel","23Q|Ana","90T|Javier");
		//generar un map con todos los empleados, siendo la clave el código del empleado
		//y el valor su nombre
		Map<String,String> resultado=empleados.stream() //Stream<String>
				                     .collect(Collectors.toMap(s->s.split("[|]")[0],
				                    		                   s->s.split("[|]")[1]));
		
		//mostramos claves y valores
				resultado.forEach((k,v)->System.out.println(k+":"+v));
				
				List<String> alumnos=List.of("Julia|5","Irene|3","Alonso|6","Marta|5","Kevin|6","Celeste|5");
				//genera un map con todos los alumnos, siendo la clave la nota y el valor el nombre
				/*Map<Integer,String> notas=alumnos.stream() //Stream<String>
						.collect(Collectors.toMap(s->Integer.parseInt(s.split("[|]")[1]), 
								                                      s->s.split("[|]")[0]));*/
				
				Map<Integer,List<String>> notas=alumnos.stream()
						.collect(Collectors.groupingBy(s->Integer.parseInt(s.split("[|]")[1])));
				notas.forEach((k,v)->System.out.println(k+":"+v));
		

	}

}
