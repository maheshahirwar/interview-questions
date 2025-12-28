package product_of_array_except_self;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int[] result = productExceptSelf(nums);

		// Print the result
		for (int num : result) {
			System.out.print(num + " ");
		}

	}

	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];
		int prod = 1;
		ans[0] = prod;
		for (int i = 1; i < n; i++) {
			prod = prod * nums[i - 1];
			ans[i] = prod;
		}
		prod = 1;
		for (int i = n - 2; i >= 0; i--) {
			prod = prod * nums[i + 1];
			ans[i] = prod;
		}

		return ans;
	}

}
