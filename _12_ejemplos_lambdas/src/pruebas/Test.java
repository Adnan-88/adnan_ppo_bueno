package pruebas;

interface I1{
	void print(String cad);
}
interface I2{
	int m(int a, int b);
}
interface I3{
	String send();
	default void call() {
		System.out.println("hello");
	}
}
public class Test {

	public static void main(String[] args) {
		I1 i1=cad->System.out.println(cad);
		i1.print("prueba lambda");
		I2 i2=(a,b)->a+b; //decido que se sumen los dos parámetros
		i2.m(3, 6);
		I3 i3=()->"bye"; //devuelve un string cualquiera
	    i3.send();
	    i3.call();

	}

}
