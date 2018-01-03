
public class FractionTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(3,7);
		Fraction f2 = new Fraction(2,5);
		Fraction f3 = f1.plus(f2);
		Fraction f4 = f1.times(f2);
		Fraction f5 = f1.reciprocal();
		
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
	}

}
