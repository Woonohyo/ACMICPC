import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class DistributedProcessing {
	public DistributedProcessing() {
		Scanner sc = new Scanner(System.in);
		
		// period of last digit of powered number is 4. (ex. 2 4 8 6, 2 4 8 6, ...)
		ArrayList<Integer> seqOfLastDigit = new ArrayList<Integer>();
		
		int numOfTests = sc.nextInt();
		int base, exponent;
		int totalData;
		
		for (int idxOfTests = 0; idxOfTests < numOfTests; idxOfTests++) {
			base = sc.nextInt();
			exponent = sc.nextInt();

			// Adding 4 last digits to the list
			for (int exp = 0; exp < 4; exp++) {
				totalData = (int) Math.pow(base, exp + 1);
				int modular = totalData % 10;
				seqOfLastDigit.add(modular == 0 ? 10 : modular);
			}
			
			int fixedIdx = (exponent % 4 == 0) ? 3 : (exponent % 4 - 1);
		
			System.out.println(seqOfLastDigit.get(fixedIdx));
			seqOfLastDigit.clear();
		}

	}
}
