


public class Solution
{

	
	 public int solution(int[] A) 
	 {
		 int actualTotal = 0;
		 int expectedTotal = 0;
		 
		 // will have to loop at least once
		 for(int x = 0; x < A.length; x++)
		 {
			 actualTotal+= x+1;
			 expectedTotal+=A[x];
			 
			 
		 }
		 
		 return  Math.abs(expectedTotal - actualTotal - A.length -1) ;
		
	       
	 }
	 
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
