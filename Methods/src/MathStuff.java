import java.util.function.BiFunction;
import java.util.function.Function;

public class MathStuff {
	
	public static void main(String[] args) {
		/*
		 * Methods of the Math class
		 * 
		 * double abs(double a)
		 * int abs(int a)
		 * double max(double a, double b)
		 * int max(int a, int b)
		 * double min(double a, double b)
		 * int min(int a, int b)
		 * double pow(double a, double b)
		 * double random()
		 * double sqrt(double a)
		 */
		
		int x = 3;
		int y = 10;
		
		System.out.println(Math.max(x, y));
		System.out.println(Math.min(x,  y));
		System.out.println(Math.abs(x-y));
		System.out.println(Math.pow(x, y));
		System.out.println(Math.random());
		
		BiFunction<Double, Double, Double> h = (a, b) -> Math.sqrt(Math.pow(a,  2) + Math.pow(a, 2));
		
		System.out.println(h.apply(4.0, 3.0));
		
		int z = -4;
		
		int largest = Math.max(Math.max(x, y), z);
		int smallest = Math.min(Math.min(x, y), z);
		int median = x + y + z - largest - smallest;
		
		int randomNum = (int) Math.random()*41 + 60;
		
		
	}
	
}
