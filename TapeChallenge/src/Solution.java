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
        int diff = 1;

        for(int x = 0; x < A.length -1; x++)
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
        for (int x = 0; x < P-1; x++)
        {
            totalBefore+= A[x];
        }

        for (int y = P; y < A.length; y++)
        {
            totalAfter+= A[y];
        }


        return  Math.abs(totalBefore - totalAfter);
    }
}
