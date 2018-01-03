
public class NumberSetTester {
	public static void main(String[] args) {
		
		NumberSet nums = new NumberSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		System.out.println("Max: " +  nums.getMax());
		System.out.println("Min: " + nums.getMin());
		System.out.println("Avg: " + nums.getAvg());
	}
}
