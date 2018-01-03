
public class SimpleMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int count = 1; count <= 5; count++) {
			printPoundPattern();
		}
		
	}
	
	public static void printPoundPattern() {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("l\n");
			}
			System.out.println();
		}
		
	}

}
