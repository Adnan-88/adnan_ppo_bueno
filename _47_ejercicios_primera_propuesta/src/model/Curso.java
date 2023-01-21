package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
	private String nombre;
	private double precio;
	private int duracion;
	private String tematica;
	
	

}
