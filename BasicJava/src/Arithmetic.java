
public class Arithmetic 
{

	public static void main(String[] args) 
	{
		/*
		 * Arithmetic Operators:
		 * 1) + addition
		 * 2) - subtraction
		 * 3) / division
		 * 4) * multiplication
		 * 5) % modulus
		 * 
		 */
		System.out.println(27%7); // 6
		System.out.println(14%2); // 0
		System.out.println(33%33); // 0
		System.out.println(3%7); // 3
		
		/*
		 * x % y is 0 iff x is divisible by y
		 * 
		 * if x < y then x % y = x
		 * 
		 * When performing arithmetic with mixed data types (int and double).
		 * The following rules hold:
		 * 1) If at least one operand is a double , the arithmetic will be done as though they were both doubles.
		 * 2) If both are the same type, a result of that type will be produced.
		 * 
		 * In particular, this means that int/int = int
		 */
		System.out.println(2/3); // 0
		System.out.println(-6/5); // -1
		// Truncates towards 0
		/*
		 * Order of Operations:
		 * 1) Parentheses
		 * 2) Multiplication/Division/Modulus
		 * 3) Addition/Subtraction
		 */
		int x = 3;
		int y = 5;
		double reciprocalSum = 1.0/x + 1.0/y;
		System.out.println(reciprocalSum);
		double length = 5.8;
		double width = 3.3;
		double area = length * width;
		double perimeter = 2 * (length + width);
		System.out.println(area);
		System.out.println(perimeter);
	}

}


















