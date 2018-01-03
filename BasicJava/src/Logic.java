
public class Logic
{

	public static void main(String[] args) 
	{
		/*
		 * Logical Operators:
		 * 1) ||
		 * 2) &&
		 * 3) !
		 * 
		 * Suppose A and B are boolean expressions:
		 * 1) A && B == true only when both A and B are true
		 * 2) A || B == true only when one of them is true
		 * 3) !A == true only when A is false
		 * 
		 * Truth Table:
		 * 
		 * A | B | A && B
		 * ---------------
		 * T | T | T
		 * T | F | F
		 * F | T | F
		 * F | F | F
		 * 
		 * A | B | A || B
		 * ---------------
		 * T | T | T
		 * T | F | T
		 * F | T | T
		 * F | F | F
		 * 
		 * A | !A
		 * -------
		 * T | F 
		 * F | T 
		 */
		int age = 15;
		boolean isTeenager = (age >= 13) && (age<=19);
		// !(A || B) = !A && !B
		// !(A && B) = !A || !B
		// DeMorgan's Law
	}

}
