package service;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import model.Ciudad;

public class Ciudades {
	String ruta="c:\\ficheros\\ciudades.txt";
	
	public void guardarCiudad(String nombre, int habitantes, String pais) {
		String datos=nombre+"|"+habitantes+"|"+pais;
		try(FileOutputStream fos=new FileOutputStream(ruta, true); PrintStream out=new PrintStream(fos);) {
			out.println(datos);		
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public Ciudad ciudadMasPoblada() {
		Ciudad ciudad=null;
		int habitantesMax=0;
		try(FileReader fr=new FileReader(ruta); BufferedReader bf=new BufferedReader(fr)){
			String fila;
			//recorremos el fichero linea a linea, y convertimos cada linea en un Pedido
			//después, comprobamos si ese pedido es posterior al auxiliar
			while((fila=bf.readLine())!=null) {
				//convierto line a array
				String[] linea=fila.split("[|]");
				//creo objeto pedido con datos de la línea
				Ciudad c=new Ciudad(linea[0],Integer.parseInt(linea[1]), linea[2]);
				//comprobamos si se trata de una ciudad más poblada
				if(c.getHabitantes()>habitantesMax) {
					//si es así, actualizo variables
					habitantesMax=c.getHabitantes();
					ciudad=c;	
				}
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return ciudad;//devuelvo pedido encontrado
	}
	
	
	public ArrayList<Ciudad> ciudadesPorPais(String pais) {
		ArrayList<Ciudad> resultado=new ArrayList<>();
		try(FileReader fr=new FileReader(ruta); BufferedReader bf=new BufferedReader(fr)){
			String fila;
			//recorremos el fichero linea a linea, y convertimos cada linea en un Pedido
			//después, comprobamos si ese pedido es posterior al auxiliar
			while((fila=bf.readLine())!=null) {
				//convierto line a array
				String[] linea=fila.split("[|]");
				//creo objeto pedido con datos de la línea
				Ciudad c=new Ciudad(linea[0],Integer.parseInt(linea[1]), linea[2]);
				if(c.getPais().equals(pais)) {
				//añadimos pedido a la lista de resultados
				resultado.add(c);
				}
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return resultado;
	}
}
