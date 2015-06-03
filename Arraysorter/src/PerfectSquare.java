public class PerfectSquare
{

	public PerfectSquare()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stx
		System.out.println("the next perfect square after 6 is "
				+ nextPerfectSquare(6));

	}

	//
	public static int nextPerfectSquare(int x)
	{
		if (x < 0)
			return 0;
		double res = 0;
		boolean found = false;
		while (!found)
		{
			x++;
			res = Math.sqrt(x);
			if (res == (int) res)
			{
				res = res * res;
				found = true;
			}
		}

		return (int) res;

	}

}
