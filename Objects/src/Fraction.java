
public class Fraction {
	
	private int numer;
	private int denom;
	
	public Fraction(int numer, int denom) {
		this.numer = numer;
		this.denom = denom;
	}
	
	// Returns a string representation of the object
	public String toString() {
		return numer + " / " + denom;
	}
	
	public Fraction plus(Fraction other) {
		int d = this.denom * other.denom;
		int n = this.numer * other.denom + other.numer * this.denom;
		Fraction sum = new Fraction(n, d);
		return sum;
	}
	
	public Fraction times(Fraction other) {
		int d = denom * other.denom;
		int n = numer * other.numer;
		Fraction answer = new Fraction(n, d);
		return answer;
	}
	
	public Fraction reciprocal() {
		Fraction answer = new Fraction(denom, numer);
		return answer;
	}
	
}
