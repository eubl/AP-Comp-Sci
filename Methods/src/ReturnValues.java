
public class ReturnValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquare(14);
		printSquare(25);
		
		int n = square(5);
		int m = 2 * square(-7) + square(9);
		
		int sum = sos(3, 4);
		System.out.println(sum);
	}
	
	public static void printSquare(int x) {
		System.out.println(x * x);
	}
	
	public static int square(int x) {
		return x * x;
	}
	
	public static int sos(int a, int b) {
		return square(a) + square(b);
	}
}
