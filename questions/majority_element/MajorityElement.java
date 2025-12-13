package majority_element;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 3, 3, 1, 2, 3 };
		int result = majorityElement(nums);
		System.out.println("Majority element: " + result);

	}

	private static int majorityElement(int[] nums) {
		int candidate = nums[0];
		int count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == candidate) {
				count++;
			} else {
				count--;
				if (count == 0) {
					candidate = nums[i];
					count = 1;
				}
			}
		}
		return candidate;
	}

}
