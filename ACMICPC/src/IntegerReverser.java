
public class IntegerReverser {
	public IntegerReverser() {
		
	}

	public int reverse(int x) {
		int result = 0;
		int sign = 1;
		
		if ( x < 0)
		{
			sign = -1;
		}
		
		String numString = String.valueOf(Math.abs(x));
		StringBuffer stringBuffer = new StringBuffer(numString);
		stringBuffer.reverse();
		String reversedNum = stringBuffer.toString();
		result = Integer.parseInt(reversedNum);
		return result * sign;
	}
}
