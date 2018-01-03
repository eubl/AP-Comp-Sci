
public class PiEstimater {

	public static void main(String[] args) {
		
		System.out.println(estimatePi(1000000000));

	}

	public static double estimatePi(int times) {
		
		int count = 0;
		
		for(int i = 0; i <= times; i++) {
			double x = Math.random();
			double y = Math.random();
			if(Math.pow(x, 2) + Math.pow(y, 2) <= 1) {
				count++;
			}
		}
		
		double valueOfPi = (double) count / times;
		
		return valueOfPi * 4;
		
	}
}
