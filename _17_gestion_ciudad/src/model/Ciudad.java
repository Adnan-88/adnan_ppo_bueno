package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ciudad {
	private String nombre;
	private String pais;
	private int habitantes;
	private double temperatura;
	

}
