public class Factorial
{

	public static void main(String[] Args)
	{
		System.out.println("The factorial of 100 (recursion) is "
				+ factorial_recursive(20) + "");
		System.out.println("The factorial of 100 (iteration) is "
				+ factorial_iterative(20) + "");
	}

	// facorial recursive
	public static long factorial_recursive(int number)
	{
		long retval = 1;
		if (number == 0 || number == 1)
		{
			return 1;
		} else
		{
			if (number > 1)
			{

				retval = number * factorial_recursive(number - 1);
			}
		}

		return retval;
	}

	public static long factorial_iterative(int number)
	{

		long retval = 1;
		if (number == 0 || number == 1)
		{
			return 1;
		} else
		{
			if (number < 0)
			{
				return 1;
			} else
			{
				for (int x = number; x >= 1; x--)
				{
					retval = retval * x;
				}

			}

			return retval;
		}
	}

	// constructor1
	public Factorial()
	{

	}
}
