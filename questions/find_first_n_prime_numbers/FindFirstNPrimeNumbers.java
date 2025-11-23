package find_first_n_prime_numbers;

import java.util.ArrayList;
import java.util.List;

public class FindFirstNPrimeNumbers {

	public static void main(String[] args) {
		FindFirstNPrimeNumbers findFirstNPrimeNumbers = new FindFirstNPrimeNumbers();
		System.out.println("Prime Numbers : " + findFirstNPrimeNumbers.findFirstNPrimeNumbers(20));
	}

	public List<Integer> findFirstNPrimeNumbers(int n) {
		List<Integer> ans = new ArrayList<>();
		int number = 1;
		while (ans.size() != n) {
			if (isPrime(number))
				ans.add(number);
			number++;
		}
		return ans;
	}

	private boolean isPrime(int num) {
		if (num < 2)
			return false;

		for (int i = 2; i * i < num; i++) {
			if (num % i == 0)
				return false;

		}
		return true;
	}

}
