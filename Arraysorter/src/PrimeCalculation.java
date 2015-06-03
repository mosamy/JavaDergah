public class PrimeCalculation
{

	public static boolean isPrime(long n)
	{
		if (n <= 1)
		{
			return false;
		}
		int SQRT = (int) Math.sqrt(n) + 1;
		// 2 is is prime
		if (n == 2 || n == 3)
			return true;

		// not divisable by 2
		if (n % 2 == 0)
		{
			return false;
		}

		for (int x = 3; x < SQRT; x += 2)// no evens
		{
			if (n % x == 0)
			{
				return false;
			}
		}

		return true;

	}

	// main
	public static void main(String[] Args)
	{

		System.out
				.println("The prime count for 11-29 is " + primeCount(-10, 6));

	}

	public static long primeCount(long start, long end)
	{
		long pC = 0;
		for (long x = start; x <= end; x++)
		{
			if (isPrime(x))
			{
				pC++;
			}
		}
		return pC;
	}
}
