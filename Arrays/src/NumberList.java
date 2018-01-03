
public class NumberList {
	private int[] nums;
	
	public NumberList(int length) {
		nums = new int[length]; // full of 0
	}
	
	public void fillRandom(int a, int b) {
		// fills nums with random int from a to b inclusive
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * (b - a + 1) + a);
		}
	}
	
	public int sum() {
		// calculate and return the sum of all entries in nums
		int result = 0;
		for(int i : nums) {
			result += i;
		}
		return result;
	}
	
	public boolean contains(int x) {
		// linear or sequential search
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == x) {
				return true;
			}
		}
		return false;
	}
	
	public boolean allClose() {
		boolean update = false;
		for(int i = 1; i < nums.length - 1; i++) {
			if(Math.abs(nums[i] - nums[i-1]) <= 80 && Math.abs(nums[i] - nums[i+1]) <= 80) {
				update = true;
			}
			else {
				return false;
			}
		}
		return update;
	}
}
