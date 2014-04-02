import java.util.*;

public class StringReverser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		reverseWords(sc.nextLine());
	}

	public static String reverseWords(String inputStr) {
		StringBuilder sb = new StringBuilder();
		inputStr = inputStr.trim();
		inputStr = inputStr.replaceAll(" +", " ");

		String reversedStr = new StringBuilder(inputStr).reverse().toString();
		for (String each : reversedStr.split(" ")) {
			sb.append(new StringBuilder(each).reverse().toString());
			sb.append(" ");
		}
		String resultStr = sb.toString().trim();
		System.out.println(resultStr);
		return resultStr;
	}
}