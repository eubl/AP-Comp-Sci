
public class StudentRecord {
	
	public static final int QUARTER = 1;
	public static final int HALF = 2;
	public static final int FULL = 4;
	
	public static final int A = 4;
	public static final int B = 3;
	public static final int C = 2;
	public static final int D = 1;
	public static final int F = 0;
	
	private String name;
	private String id;
	private int credits;
	private int points;
	
	public StudentRecord(String n, String i) {
		name = n;
		id = i;
		credits = 0;
		points = 0;
	}
	
	public void addClass(int length, int grade) {
		credits += length;
		points += (length * grade);
	}
	
	public double getGPA() {
		return 1.0 * points / credits;
	}
	
	public String toString() {
		return name + " (" + getGPA() + ")";
	}
	
}

