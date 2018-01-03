import java.util.Scanner;

public class ComparingStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		
		if(str1.equals(str2)) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
	}

}
