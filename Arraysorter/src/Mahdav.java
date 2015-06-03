public class Mahdav
{

	public static void main(String[] Args)
	{
		int[] a =
		{ 2, 1, 1 };
		int[] b =
		{ 18, 9, 10, 6, 6, 6 };
		System.out.println(ismahdav(b));

	}

	public static int ismahdav(int[] a)
	{

		// int loopfor = 1;
		int itemsum = 0;
		int i, x;
		// retrieve first item
		// int firstitem = a[0];

		for (i = 1; i < a.length; ++i)
		{

			for (x = i; x <= i + 1; x++)
			{
				itemsum += a[x];
			}
			i = x;

			if (a[0] == itemsum)
			{
				// good
			} else
			{
				return 0; // false
			}

		}// endf for
		return 1; // 0 if false 1 if true
	}

}
