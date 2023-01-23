package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import model.Ciudad;

public class CiudadesService {
	List<Ciudad> ciudades=new ArrayList<>();
	
	public boolean agregarCiudad(Ciudad ciudad) {
		 if(
			   ciudades.stream()
			   .noneMatch(c->c.getNombre().equals(ciudad.getNombre())&&c.getPais().equals(ciudad.getPais()))
				 ) { //si no hay ninguna ciudad con ese nombre y pais, agregamos
			 ciudades.add(ciudad);
			 return true;
		 }
		 return false;
	}
	
	public int totalCiudadPais(String pais) {
		return (int) ciudades.stream()
				.filter(c->c.getPais().equals(pais)) //Stream<Pais>
				.count();
	}
	
	public Ciudad ciudadMasPoblada() {
		return ciudades.stream()
			.max((c1,c2)->c1.getHabitantes()-c2.getHabitantes())//optional<Ciudad>
			.orElse(null);
	}
	
	public Ciudad buscarCiudad(String nombre, String pais) {
		return ciudades.stream()
				.filter(c->c.getNombre().equals(nombre)&&c.getPais().equals(pais)) //Stream<Ciudad>
				.findFirst() //Optional<Ciudad>
				.orElse(null);
	}
	
	public Ciudad ciudadMasFria() {
		return ciudades.stream()
			.min((c1,c2)->Double.compare(c1.getTemperatura(), c2.getTemperatura()))
			.orElse(null);
	}
	
	
	//método que devuelva el total de paises registrados
	
	public int totalPaises() {
		return (int)ciudades.stream() //Stream<Ciudad>
				.map(c->c.getPais()) //Stream<String>
				.distinct() //Stream<String> 
				.count();
		
	}
	
	//temperatura media de las ciudades cuyo pais se recibe como parámetro
	
	public OptionalDouble temperaturaMediaCiudadPais(String pais) {
		return ciudades.stream()
				.filter(c->c.getPais().equals(pais)) //Stream<Ciudad>
				.mapToDouble(c->c.getTemperatura()) //DoubleStream
				.average(); //OptionalDouble
		
	}
	
	//devuelva la lista de ciudades que pertenecen a un determinado pais
	public List<Ciudad> ciudadesPais(String pais){
		return ciudades.stream()
				.filter(c->c.getPais().equals(pais)) //Stream<Ciudad>
				.collect(Collectors.toList());
	}
	
	
	//devuelve todas la ciudades, agrupadas por pais
	public Map<String,List<Ciudad>> ciudadesPorPais(){
		return ciudades.stream()
				.collect(Collectors.groupingBy(c->c.getPais()));
				
	}
	
	//devuelve el total de habitantes de un determinado pais
	public int habitantesPais(String pais) {
		return ciudades.stream()
				.filter(c->c.getPais().equals(pais)) //Stream<Ciudad>
				.collect(Collectors.summingInt(c->c.getHabitantes()));
				
				
				
	}
	

}