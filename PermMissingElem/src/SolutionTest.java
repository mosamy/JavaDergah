import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */

/**
 * @author mohamed
 *
 */
public class SolutionTest
{

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}

	/**
	 * Test method for {@link Solution#solution(int[])}.
	 */
	@Test
	public void testSolution()
	{
		int [] A = new 	int [4];
		A[0] = 2;
		A[1] = 3 ;
		A[2] = 1 ;
		A[3] = 5 ;
		Solution s = new Solution();
		
		assertEquals(4, s.solution(A));
	}

}
