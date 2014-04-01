import java.util.*;

public class Fibonacci_1003 {
	static int numOfZero, numOfOne;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfTests = sc.nextInt();
		ArrayList<Integer> testCases = new ArrayList<Integer>();
		for (int idx = 0; idx < numOfTests; idx++) {
			testCases.add(sc.nextInt());
		}
		for (int idx = 0; idx < numOfTests; idx++) {
			fibonacci(testCases.get(idx));
			printNums();
			zeroingVars();
		}
	}

	private static void printNums() {
		System.out.println(numOfZero + " " + numOfOne);
	}

	static int fibonacci(int n) {
		if (n == 0) {
			numOfZero++;
			return 0;
		} else if (n == 1) {
			numOfOne++;
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	static void zeroingVars() {
		numOfZero = 0;
		numOfOne = 0;
	}
}
