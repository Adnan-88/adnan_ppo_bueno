package interfaces;
/*
Crear una implementación de la interfaz Printer2, que consista en que el método
muestre por pantalla el texto recibido. Se creará un objeto de dicha implementación
y se llamará al método con un texto cualquiera
*/

interface Printer2{
	void print(String cad);
}


public class Test1 {

	public static void main(String[] args) {
		//se crea una implementación de la interfaz a través de una clase anónima
		Printer2 pr=new Printer2() {

			@Override
			public void print(String cad) {
				System.out.println(cad);
				
			}	
		};
		pr.print("hola");

	}

}
