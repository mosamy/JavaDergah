import java.util.Random;



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
	
	public static void main(String[] Args)
	{
		int[] anArray = new int[99999];
		Random randomGenerator = new Random();
		//
		for(int x = 0; x <99999 ; x++)
		{
		int randInt = randomGenerator.nextInt(100);
		anArray[x] = randInt;
		
		}
		
		Solution s = new Solution();
		long t1 = System.currentTimeMillis();
		System.out.println(s.solution(anArray));
		long t2 = System.currentTimeMillis();
		System.out.println((t2 - t1)/1000 + " seconds");
		System.out.println(s.totalArray);
	}

    public int solution(int[] A)
    {
        if (A.length ==2)
        {
            return Math.abs(A[0] - A[1]);
        }
        int diff = p(A,1);

        for(int x = 1; x < A.length ; x++)
        {
            if ( p(A,x) < diff) {
                diff = p(A, x);
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
        
        int totalBefore = 0;
        int totalAfter = 0;
       
        if(isFirstTime)
        {

       	 for (int x = 0; x < A.length; x++)
            {
            	if (x <= P-1)
            	{
                totalBefore+= A[x];
            	}
            	else
            	{
            		totalAfter+= A[x];
            	}
            		
            }
        }
        else
        {
        	
        	for (int x = 0; x < P-1 ; x++)
            {
            	
                totalBefore+= A[x];
            	
            	
            }
        	totalAfter = (int) (totalArray - totalBefore);
        }
        
        
       

        
        if (totalArray == Long.MIN_VALUE)
        {
        	totalArray = (long) (totalBefore + totalAfter);
        	isFirstTime = false;
        }
        return  Math.abs(totalBefore - totalAfter);
    }
}

