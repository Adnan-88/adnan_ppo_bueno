package principal;

interface Datos{
	static void print() {
		System.out.println("hello");
	}
}
class Prueba implements Datos{
	
}
public class Test {

	public static void main(String[] args) {
		Datos.print();

	}

}
