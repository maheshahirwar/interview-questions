package fibonacci_series;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumbers {

	public static void main(String[] args) {
		System.out.println("Fibonacci Numbers : " + new FibonacciNumbers().fibonacciSeries(20));
	}

	public List<Integer> fibonacciSeries(int n) {
		List<Integer> ans = new ArrayList<>();
		int a = 0, b = 1;
		ans.add(a);
		ans.add(b);
		n -= 2;
		while (n-- > 0) {
			int next = a + b;
			a = b;
			b = next;
			ans.add(next);
		}
		return ans;
	}

}
