import java.util.ArrayList;
import java.util.Arrays;

public class Factorization {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(factor(36)));
	}
	
	public static int[] factor(int num) {
		int squareRoot = (int) Math.sqrt(num);
		ArrayList<Integer> factors = new ArrayList<Integer>();
		
		for(int x = 1; x <= squareRoot; x++) {
			if(num % x == 0) {
				factors.add(x);
				factors.add(num / x);
			}
		}
		
		int[] numbers = new int[factors.size()];
		for (int i = 0; i < numbers.length; i++) {
		    numbers[i] = factors.get(i);
		}
		
		return numbers;
	}
	
}
