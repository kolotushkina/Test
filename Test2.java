
public class Test2 {

	public static void main(String[] args) {
		int n = 200;
		System.out.println(nullsAtTheEndOfTheFactorial(n));
	}

	/*
	 * The number n ends in as many zeros as there are pairs of twos and fives
	 * in the decomposition of n into simple factors. Since in this
	 * decomposition there are more twos than fives, it is necessary to count
	 * the number of only fives. We can do this with the following method: Date:
	 * 14/01/2019 
	 * Author: Safiullin R.
	 */
	private static int nullsAtTheEndOfTheFactorial(int n) {

		int nulls = 0; // amount of nulls at the end of the factorial of number n
		while (n > 0) {
			n /= 5;
			nulls += n;
		}
		return nulls;
	}
}
