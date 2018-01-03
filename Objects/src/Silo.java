
public class Silo {
	
	private String contents;
	private double capacity;
	private double amount;
	
	public Silo(String contents, double capacity, double amount) {
		this.contents = contents;
		this.capacity = capacity;
		this.amount = amount;
	}
	
	public Silo(String contents, double capacity) {
		this(contents, capacity , 0);
	}
	
	// add the given quantity of stuff to the silo
	// return true if there was enough room
	//		false if there was not
	public boolean add(double x) {
		if(capacity - amount >= x) {
			amount += x;
			return true;
		}
		else {
			amount = capacity; 
			return false;
		}
	}
	
	// signature: fill()
	public void fill() {
		amount = capacity;
	}
	
	// signature: fill(double)
	public void fill(double percent) {
		double space = capacity - amount;
		double toAdd = space * percent;
		amount += toAdd;
	}
	
	// signature: fill(String, int)
	public void fill(String s, int y) {
		// whatever
	}
	
	// methods can have the same name as long as the signatures are different
	
}











