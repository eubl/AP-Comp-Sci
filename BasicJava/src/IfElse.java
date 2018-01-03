
public class IfElse {

	public static void main(String[] args) {
		/*
		 * The standard flow of a program is sequential.
		 * The statements are executed in the order they appear.
		 * 
		 * Influencing this order of execution is known as control flow.
		 * 
		 * Conditional Execution:
		 * 		
		 * if statement:
		 * 		
		 * 		if(condition) 
		 * 		{
		 * 			path 1
		 * 		}
		 * 		else 
		 * 		{
		 * 			path 2
		 * 		}
		 * 		
		 */
		
		int age = 50;
		
		if (age > 60) {
			System.out.println("You get a senior discount");
		}
		else {
			System.out.println("no discoun for you");
		}
		/*
		 * Notes on if-statements:
		 * 
		 * 1) The else section is optional.
		 * 2) If one of the blocks { } consists of only a single statement, the braces can be left off.
		 * 3) 
		 */
		
		int grade = 78;
		boolean extraCredit = true;
		
		if (extraCredit) {
			grade += 3;
		} 
		
		if (grade >= 65) {
			System.out.println("you passed");
		}
		else {
			System.out.println("You failed");
			System.out.println("Try again");
		}
	}

}












































