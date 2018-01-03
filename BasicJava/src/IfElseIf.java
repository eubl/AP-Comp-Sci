import java.util.Scanner;
public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		/*
		 * in.nextInt()
		 * in.nextDouble()
		 */
		
		System.out.print("Emtker your grpade: ");
		int grade = in.nextInt();
		
		// tell the user their letter grade
		if (grade >= 90) {
			System.out.println("A");
		}
		else if (grade >= 80) {
			System.out.println("B");
		}
		else if (grade >= 70) {
			System.out.println("C");
		}
		else if (grade >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}

}
