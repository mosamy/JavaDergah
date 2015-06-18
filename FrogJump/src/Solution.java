// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution 
{
    public int solution(int Location, int Destination, int Distance) 
    {
    	int differenceCovered = Destination - Location;
    	
    	
    	//int numJumps = 0;
    	if (differenceCovered % Distance ==0)
    	{
    		return differenceCovered/Distance;
    	}
    	else
    	{
    		return (int)Math.round(differenceCovered/Distance +1);
    	}
    	
		
        // write your code in Java SE 8
    }
}