

/**
 * Created by mohamed on 6/10/15.
 */
// you can also use imports, for example:
// import java.util.*;
// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");
class Solution
{
	public long totalArray = Long.MIN_VALUE;
	private Boolean isFirstTime = true;
	private int totalBefore = 0;
	private int totalAfter = 0;

	public static void main(String[] Args)
	{
//		int[] anArray = new int[99999];
//		Random randomGenerator = new Random();
//		//
//		for (int x = 0; x < 99999; x++)
//		{
//			int randInt = randomGenerator.nextInt(100);
//			anArray[x] = randInt;
//		}
//		Solution s = new Solution();
//		long t1 = System.currentTimeMillis();
//		System.out.println(s.solution(anArray));
//		long t2 = System.currentTimeMillis();
//		System.out.println((t2 - t1) / 1000 + " seconds");
//		System.out.println(s.totalArray);
		
		int[] anArray =  {3, 1, 2, 4, 3} ;
		SolutionV2 s = new SolutionV2();
		System.out.print(s.solutionV2(anArray));
	}

	public int solution(int[] A)
	{
		if (A.length == 2)
		{
			return Math.abs(A[0] - A[1]);
		}
		int diff = p(A, 1);
		int p  =0;
		for (int x = 2; x < A.length; x++)
		{
			p = p(A, x) ;
			if (p < diff)
			{
				diff = p;
				if (diff == 0)
				{
					return diff;
				}
			}
		}
		return diff;
	}

	public int p(int[] A, int P)
	{
		
		if (isFirstTime)
		{
			totalArray = 0;
			for (int x = 0; x < A.length; x++)
			{
				if (x <= P - 1)
				{
					totalBefore += A[x];
				} else
				{
					totalAfter += A[x];
				}
			}
			totalArray += totalBefore;
			totalArray += totalAfter;
			isFirstTime = false;
		}
		
		else // not first time
		{
			
				totalBefore += A[P-1];
			
			totalAfter = (int) (totalArray - totalBefore);
		}
		return Math.abs(totalBefore - totalAfter);
	}
}