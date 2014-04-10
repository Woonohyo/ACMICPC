public class IntegerReverser {
	public IntegerReverser() {

	}

	public int reverseViaString(int x) {
		int result = 0;
		int sign = 1;

		if (x < 0) {
			sign = -1;
		}

		String numString = String.valueOf(Math.abs(x));
		StringBuffer stringBuffer = new StringBuffer(numString);
		stringBuffer.reverse();
		String reversedNum = stringBuffer.toString();
		result = Integer.parseInt(reversedNum);
		return result * sign;
	}

	public int reverseViaMath(int x) {
		int result = 0;
		int modular;
		while (x != 0) {
			modular = x % 10;
			x = x / 10;
			result = result * 10 + modular;
		}
		return result;
	}
}
