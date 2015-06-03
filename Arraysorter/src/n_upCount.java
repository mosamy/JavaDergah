public class n_upCount
{

	public n_upCount()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] Args)
	{
		// {1,2,-1,5,3,2,-3}
		int[] b =
		{ 2, 3, 1, -6, 8, -3, -1, 2 };
		int[] c =
		{ 2, 3, 1, -6, 8, -3, -1, 2 };
		int[] a = new int[3];
		a[0] = 6;
		a[1] = 3;
		a[2] = 1;
		System.out.println("The upcount 0f 6 in {6,3,1} is " + nUpCount(a, 6));
		System.out.println("The upcount 0f 20 in {2,3,1,-6,8,-3,-1,2} is "
				+ nUpCount(b, 20));
		System.out.println("The upcount 0f 5 in {2,3,1,-6,8,-3,-1,2} is "
				+ nUpCount(c, 5));
	}

	public static int nUpCount(int[] a, int n)
	{
		int sum = 0;
		int prevsum = 0;
		int upcount = 0;

		for (int x = 0; x < a.length; x++)
		{
			prevsum = sum;
			sum += a[x];
			if (sum > n && prevsum <= n)
			{
				upcount++;
			}
		}
		return upcount;
	}

}
