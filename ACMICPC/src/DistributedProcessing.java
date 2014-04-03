import java.math.BigInteger;
import java.util.Scanner;

public class DistributedProcessing {
	public DistributedProcessing() {
		Scanner sc = new Scanner(System.in);
		int numOfTests = sc.nextInt();
		int base, exponent;
		BigInteger totalData;
		for (int idxOfTests = 0; idxOfTests < numOfTests; idxOfTests++) {
			base = sc.nextInt();
			exponent = sc.nextInt();
			totalData = BigInteger.valueOf(base).pow(exponent);
			System.out.printf("%d\n", totalData.mod(BigInteger.TEN));
		}

	}
}
