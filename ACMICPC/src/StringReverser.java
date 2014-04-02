import java.util.*;

public class StringReverser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resultStr = reverseWords(sc.nextLine());
		System.out.println(resultStr);
	}

	public static String reverseWords(String inputStr) {
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(inputStr);
		while (st.hasMoreTokens()) {
			sb.insert(0, st.nextToken() + " ");
		}
		return sb.toString().trim();

		// inputStr = inputStr.replaceAll(" +", " ");
		//
		// String reversedStr = new
		// StringBuilder(inputStr).reverse().toString();
		// for (String each : reversedStr.split(" ")) {
		// sb.append(new StringBuilder(each).reverse().toString());
		// sb.append(" ");
		// }
		// String resultStr = sb.toString().trim();
		
	}
}