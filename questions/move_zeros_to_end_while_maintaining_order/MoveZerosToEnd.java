package move_zeros_to_end_while_maintaining_order;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 0, 12 };
		moveZerosToEnd(nums);
		System.out.print("Array after moving zeros to end: ");
		for (int num : nums) {
			System.out.print(num + " ");
		}

	}

	private static void moveZerosToEnd(int[] nums) {
		int k = 0, i = 0;
		while (i < nums.length) {
			if (nums[i] == 0) {
				i++;
				continue;
			}
			nums[k++] = nums[i++];
		}
		while (k < nums.length) {
			nums[k++] = 0;
		}

	}

}
