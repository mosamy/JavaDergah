/**
 * Created by mohamed on 6/10/15.
 */
// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");
import  java.math.*;
class Solution
{


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

            }

        }
        return diff;


    }

    public int p(int[] A, int P)
    {
        
        int totalBefore = 0;
        int totalAfter = 0;
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

        


        return  Math.abs(totalBefore - totalAfter);
    }
}

