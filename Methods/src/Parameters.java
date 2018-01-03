
public class Parameters {
	
	public static void main(String[] args) {
		
		for(int x = 10; x >= 1; x--) {
			printStars(x);
		}
	}
	
	public static void printStars(int count) {
		for(int i = 1; i <= count; i++) {
			System.out.print("*");
			}
			System.out.println("");
		}
}
