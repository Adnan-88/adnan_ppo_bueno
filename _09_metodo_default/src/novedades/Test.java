package novedades;
interface Calculadora{
	int sumar(int a, int b);
	int restar(int a, int b);
	default int multiplicar(int a, int b) {
		return a*b;
	}
	default int sumatorio(int[] nums) {
		int suma=0;
		for(int n:nums) {
			suma+=n;
		}
		return suma;
	}
}

interface Estadisticas{
	int media(int[] nums);
	default int sumatorio(int[] nums) {
		return nums[0]+nums[nums.length-1];
	}
}

class Matematicas implements Calculadora,Estadisticas{
	@Override
	public int sumatorio(int[] nums) {
		
		return Estadisticas.super.sumatorio(nums);
	}

	@Override
	public int media(int[] nums) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sumar(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int restar(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
