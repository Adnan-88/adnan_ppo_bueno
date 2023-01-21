package principal;

interface Printer{
	void print(String cad);
	//incluiremos un método estático que proporciona una
	//determinada implementación de la interfaz
	static Printer of() {
		return new Printer() {

			@Override
			public void print(String cad) {
				System.out.println(cad);
				
			}		
		};
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
