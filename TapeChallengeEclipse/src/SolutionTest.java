import static org.junit.Assert.*;

import org.junit.Test;


public class SolutionTest
{

	@Test
	public void testSolution()
	{
		Solution s = new Solution();
	    int [] A = new int[5];
	    A[0] = 3;
	    A[1] = 1;
	    A[2] = 2;
	    A[3] = 4;
	    A[4] = 3;
		assertEquals(1, s.solution(A));
		//fail("Not yet implemented");
	}
	
	@Test
	public void testp()
	{
		Solution s = new Solution();
		   int [] A = new int[5];
		    A[0] = 3;
		    A[1] = 1;
		    A[2] = 2;
		    A[3] = 4;
		    A[4] = 3;
		    
		    assertEquals(7, s.p(A, 1));
	}

}
