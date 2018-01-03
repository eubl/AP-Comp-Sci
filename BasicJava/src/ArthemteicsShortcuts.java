
public class ArthemteicsShortcuts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * compound operators
		 * 
		 * 		x += y is equivalent to x = x + y
		 * 		x -= y					x = x - y
		 * 		x *= y					x = x * y
		 * 		x %= y					x = x % y
		 * 		x /= y					x = x / y
		 * 		x++ 					x = x + 1
		 * 
		 * warning:
		 * 	only use x++ and x-- as stand alone statement
		 * 	never use them as part of another expression
		 * 
		 * example:
		 * 		age++;
		 * 
		 * bad example:
		 * 		int answer = 3 * age++;
		 */
		int a = 3;
		int b = 7;
		int c = 2;
		a += b;
		c--;
		c += 4;
		b *= c;
		
		System.out.println(a); // 10
		System.out.println(b); // 35
		System.out.println(c); // 5
		
		double price = 14.99;
		double taxRate = 0.0685;
		price *= (1+taxRate);
		System.out.println(price);
		
	}

}
