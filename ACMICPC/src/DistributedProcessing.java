import java.util.ArrayList;
import java.util.Scanner;

public class DistributedProcessing {
	public DistributedProcessing() {
		Scanner sc = new Scanner(System.in);

		// period of last digit of powered number is at most 4. (ex. 2 4 8 6, 2 4 8 6, ...)
		ArrayList<Integer> seqOfLastDigit = new ArrayList<Integer>();
		int numOfTests = sc.nextInt();
		int base, exponent, totalData, lastDigit, exp, idxOfTests;

		for (idxOfTests = 0; idxOfTests < numOfTests; idxOfTests++) {
			base = sc.nextInt();
			exponent = sc.nextInt();

			// Adding 4 last digits to the list
			for (exp = 0; exp < 4; exp++) {
				totalData = (int) Math.pow(base, exp + 1);
				lastDigit = totalData % 10;
				seqOfLastDigit.add(lastDigit == 0 ? 10 : lastDigit);
			}

			int fixedIdx = (exponent % 4 == 0) ? 3 : (exponent % 4 - 1);

			System.out.println(seqOfLastDigit.get(fixedIdx));
			seqOfLastDigit.clear();
		}

	}
}
