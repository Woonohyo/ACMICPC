import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Fibonacci fibonacci = new Fibonacci();
		// StringReverser strReverser = new
		// StringReverser("This is a test string");
		// DistributedProcessing distProcess = new DistributedProcessing();
		distProcess();
	}

	private static void distProcess() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> seqOfLastDigit = new ArrayList<Integer>();
		int numOfTests = sc.nextInt();
		int base, exponent;
		BigInteger totalData;
		for (int idxOfTests = 0; idxOfTests < numOfTests; idxOfTests++) {
			base = sc.nextInt();
			exponent = sc.nextInt();
			for (int i = 1; i < 5; i++) {
				totalData = BigInteger.valueOf(base).pow(i);
				seqOfLastDigit.add(totalData.mod(BigInteger.TEN).intValue() == 0 ? 10 : totalData.mod(BigInteger.TEN).intValue());
			}
			int fixedIdx = exponent % 4 == 0 ? 3 : exponent % 4 - 1;
			System.out.println(seqOfLastDigit.get(fixedIdx));
			seqOfLastDigit.clear();
		}
	}
}
