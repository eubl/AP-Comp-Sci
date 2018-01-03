
public class MoreArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[20];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i * i;
		}
		
		for(int i : nums) {
			System.out.println(i);
		}
		
	}

}
