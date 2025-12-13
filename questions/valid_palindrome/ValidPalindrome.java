package valid_palindrome;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "RADAR";
		boolean result = isPalindrome(s);
		System.out.println("Is palindrome: " + result);

	}

	private static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		while (left <= right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
