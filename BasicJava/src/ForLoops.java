
public class ForLoops {
	
	public static void main(String[] args) {
		
		/*
		 * for(initialization; condition; step) {
		 * 		body
		 * }
		 */
		
//		for(int i = 0; i < 20; i++) {
//			System.out.println(i*i);	
//		}
//		
//		int sum = 0;
//		
//		for(int x = 100; x > 0; x -= 2) {
//			sum += x;
//		}
//		
//		System.out.println(sum);
		
		int factorial = 10;
				
		for(int x = 9; x > 0; x -= 1) {
			factorial *= x;
		}
		
		System.out.println(factorial);
		
	}
	
}
