package interfaces;
/*
Crear una implementación de la interfaz Printer, que consista en que el método
muestre por pantalla el texto recibido. Se creará un objeto de dicha implementación
y se llamará al método con un texto cualquiera
*/
interface Printer{
	void print(String cad);
}

class Prueba implements Printer{

	@Override
	public void print(String cad) {
		System.out.println(cad);
	}	
}

public class Test {

	public static void main(String[] args) {
		Prueba pr=new Prueba();
		pr.print("Hola");

	}
}
