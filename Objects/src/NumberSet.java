
public class NumberSet {

	// Instance Variables
	private double min;
	private double max;
	private double total;
	private int count;
	
	// Constructors
	public NumberSet() {
		min = Double.MAX_VALUE; // change this
		max = Double.MIN_VALUE; // change this
		total = 0;
		count = 0;
	}
	
	// Methods
	public void add(double value) {
		total += value;
		count++;
		if(value > max || count == 1) {
			max = value;
		}
		if (value < min || count == 1) {
			min = value;
		}
	}
	
	public double getMax() {
		return max;
	}
	
	public double getMin() {
		return min;
	}
	
	public double getAvg() {
		return total / count; // division by 0?
	}
	
}
