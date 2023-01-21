package ejemplo;

  //Realizar una clase con un método
  //Ese método recibirá un objeto numérico, sea del tipo que sea
  //y mostrará el valor entero del mismo
public class NumerosPolimorfismo {
	public static void main(String[] args) {
		mostrarEntero(34.8);
		mostrarEntero(10);
		mostrarEntero(4L);
		
	}
	
	public static void mostrarEntero(Number n) {
		System.out.println(n.intValue());
	}

}
