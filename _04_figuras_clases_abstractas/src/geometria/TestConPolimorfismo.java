package geometria;

public class TestConPolimorfismo {

	public static void main(String[] args) {
		//hacer un programa de prueba que cree un objeto Circulo y un Triangulo
		//y muestre la información(color y superficie) de cada figura
		mostrarDatosFigura(new Circulo("Azul",4));
		mostrarDatosFigura(new Triangulo("Amarillo",3,7));

	}
	
	static void mostrarDatosFigura(Figura f) {
		System.out.println("Tipo de figura: "+f.getClass().getName());
		System.out.println("Color:"+f.getColor());
		System.out.println("Superficie:"+f.superficie());
	}
}
