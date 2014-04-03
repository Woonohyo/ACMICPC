import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class DistributedProcessing {
	public DistributedProcessing() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> seqOfLastDigit = new ArrayList<Integer>();
		
		int numOfTests = sc.nextInt();
		int base, exponent;
		BigInteger totalData;
		
		for (int idxOfTests = 0; idxOfTests < numOfTests; idxOfTests++) {
			base = sc.nextInt();
			exponent = sc.nextInt();

			for (int exp = 0; exp < 4; exp++) {
				totalData = BigInteger.valueOf(base).pow(exp + 1);
				int modular = totalData.mod(BigInteger.TEN).intValue();
				seqOfLastDigit.add(modular == 0 ? 10 : modular);
			}
			
			int fixedIdx = (exponent % 4 == 0) ? 3 : (exponent % 4 - 1);
		
			System.out.println(seqOfLastDigit.get(fixedIdx));
			seqOfLastDigit.clear();
		}

	}
}
