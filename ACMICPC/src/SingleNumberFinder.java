
public class SingleNumberFinder {
	public int singleNumber(int[] A) {
		int num = 0;
		
		for ( int arrIdx = 0; arrIdx < A.length; arrIdx++ )
		{
			num ^= A[arrIdx];
		}
		
		return num;
	}
}
