package service;

import java.util.ArrayList;
import java.util.List;

import model.Ciudad;

public class CiudadesService {
	List<Ciudad> ciudades=new ArrayList<>();
	
	public boolean agregarCiudad(Ciudad ciudad) {
		 
	}
	
	public int totalCiudadPais(String pais) {
		return (int)ciudades.stream()
				.filter(c->c.getPais().equals(pais)) //Stream<Pais>
				.count();
	}
	
	public Ciudad ciudadMasPoblada() {
		return ciudades.stream()
			.max((c1,c2)->c1.getHabitantes()-c2.getHabitantes())//optional<Ciudad>
			.orElse(null);
	}
	
	public Ciudad buscarCiudad(String nombre, String pais) {
		
	}
	
	public Ciudad ciudadMasFria() {
		return ciudades.stream()
			.min((c1,c2)->Double.compare(c1.getTemperaturaMedia(), c2.getTemperaturaMedia()))
			.orElse(null);
	}

}
