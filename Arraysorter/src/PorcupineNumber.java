public class PorcupineNumber
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.out.println(findPorcupineNumber(0));
	}

	public static int findPorcupineNumber(int n)
	{

		int currentprime = 0;
		int nextprime = 0;
		int nextnine = 0;

		nextnine = n;

	}

	public static boolean isEndsNine(int n)
	{
		if (n + 1 % 10 == 0)
		{
			return true;
		} else
		{
			return false;
		}
	}

	public static boolean isPrime(int n)
	{
		if (n > 0)
		{
			for (int x = n - 1; x > 1; x--)
			{
				if (n % x == 0)
				{

					return false;
				}
			}
			return true;
		}

		return false;
	}
}
