
public class Casting 
{

	public static void main(String[] args) 
	{
		/*
		 * Casting is the conversion of a value of one data type to another
		 * 
		 * Casting will be done automatically as long as it does not involve the loss of information // implicit casting
		 * 
		 * e.g. int -> double
		 */
		double sum = 3 + 19;
		System.out.println(sum);
		/*
		 * If a cast is not done implicitly, you can still force it to do the conversion
		 * 
		 * Explicit Casting:
		 * 
		 * (type) value
		 */
		int x = (int) 5.9;
		System.out.println(x);
		double val = 8.3;
		int rounded = (int) (val + 0.5);
		System.out.println(rounded);
	}

}
