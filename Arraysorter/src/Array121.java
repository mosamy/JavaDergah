import java.util.HashMap;

public class Array121
{

	private HashMap Salary = new HashMap();

	public Array121()
	{

		// TODO Auto-generated constructor stub
	}

	public static void main(String[] Args)
	{

		int[] a =
		{ 1, 1, 2, 2, 2, 1, 1, 1 };
		System.out
				.println("The array {1, 1, 2, 2, 2, 1, 1, 1} is a 121 array = "
						+ is121Array(a) + "");
	}

	public static int is121Array(int[] a)
	{
		// only contains 1s and 2s
		// starts with ones
		// ends with ones (same number as start)i
		int startOnes = 0;
		int endOnes = 0;
		boolean stopcounting = false;
		int lastTwoindex = 0;
		boolean isfollowingOne = false;
		if (a[0] != 1)
		{
			return 0;
		}
		if (a[a.length - 1] != 1)// doesn't end in 1
		{
			return 0;
		}

		for (int x = 0; x < a.length; x++)
		{
			if (a[x] > 2 || a[x] < 1) // contains number other than 1,2
			{
				return 0;
			}

			// if we get to here, a started with 1 and ends with 1
			if (a[x] == 1 && stopcounting == false)
			{
				startOnes++;
			} else
			{
				stopcounting = true;
				lastTwoindex = x;

			}

			if (stopcounting) // now that we hit a 2 make sure there is no 1
								// followed by 2
			{
				if (a[x] == 1)
				{
					isfollowingOne = true;
				}

				if (isfollowingOne && a[x] == 2) // we hit 2 then we hit 1 again
													// now 2 e.g. 212
				{
					return 0;
				}
			}
		}
		// reset stopcounting
		stopcounting = false;

		// loop backwards
		for (int x = a.length - 1; x > 0; x--)
		{
			if (a[x] == 1 && stopcounting == false)
			{
				endOnes++;
			} else
			{
				stopcounting = true;
				break; // no need to continue as we hit a 2;
			}

		}

		if (startOnes == endOnes)
		{
			return 1;
		} else
		{
			return 0;
		}

	}

}
