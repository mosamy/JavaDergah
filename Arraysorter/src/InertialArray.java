public class InertialArray
{

	/*
	 * Write a function called isIntertial that accepts an integer array and
	 * returns 1 if the array is inertial; otherwise it returns 0.
	 */

	// I love purple comments
	public static void main(String[] Args)
	{

		int[] a =
		{ 11, 4, 20, 9, 2, 8 };
		int[] b =
		{ 12, 11, 4, 9, 2, 3, 10 };
		int[] c =
		{ 1 };

		int[] d =
		{ 2 };
		int[] e =
		{ 1, 2, 3, 4 };

		int[] f =
		{ 1, 1, 1, 1, 1, 1, 2 };

		int[] g =
		{ 2, 12, 4, 6, 8, 11 };
		int[] h =
		{ 2, 12, 12, 4, 6, 8, 11 };
		int[] i =
		{ -2, -4, -6, -8, -11 };
		int[] j =
		{ 2, 3, 5, 7 };
		int[] k =
		{ 2, 4, 6, 8, 10 };

		System.out.println("The array {11, 4, 20, 9, 2, 8}  is inertial = "
				+ isInertialv2(a));
		System.out.println("The array {12, 11, 4, 9, 2, 3, 10}  is inertial = "
				+ isInertialv2(b));
		System.out.println("The array {1}  is inertial = " + isInertialv2(c));
		System.out.println("The array {2}  is inertial = " + isInertialv2(d));

		System.out.println("The array {1, 2, 3, 4}  is inertial = "
				+ isInertialv2(e));

		System.out.println("The array {1, 1, 1, 1, 1, 1, 2}  is inertial = "
				+ isInertialv2(f));

		System.out.println("The array {2, 12, 4, 6, 8, 11}  is inertial = "
				+ isInertialv2(g));

		System.out.println("The array {2, 12, 12, 4, 6, 8, 11}  is inertial = "
				+ isInertialv2(h));

		System.out.println("The array {-2, -4, -6, -8, -11}  is inertial = "
				+ isInertialv2(i));

		System.out.println("The array {2, 3, 5, 7}  is inertial = "
				+ isInertialv2(j));

		System.out.println("The array {2, 4, 6, 8, 10}  is inertial = "
				+ isInertialv2(k));

	}

	public static int isInertial(int[] A)
	{
		/*
		 * a. it contains at least one odd value b. the maximum value in the
		 * array is even c. every odd value is greater than every even value
		 * that is not the maximum value.
		 */

		if (A.length == 1)
		{
			return 0;// fails both ways
		}

		boolean isatLeastoneOdd = false;
		boolean ismaxValueEven = false;
		boolean iseveryOddGreater = false;
		int maxEven = 0;
		int maxOdd = 0;
		int maxValue = A[0];

		int leastOdd = 0;
		boolean firstEven = true;

		for (int x = 0; x < A.length; x++)
		{
			if (x > 0)
				maxValue = A[x];

			if (A[x] > maxValue)
				maxValue = A[x];

			if (A[x] % 2 != 0)// odd
			{
				if (!isatLeastoneOdd)// first odd
				{
					leastOdd = A[x];
				}
				isatLeastoneOdd = true;
				if (A[x] < leastOdd)
				{
					leastOdd = A[x];

				} else
				{
					maxOdd = A[x];
				}
			}

			else
			// even
			{
				if (firstEven)
				{
					maxEven = A[x];
				} else
				{
					if (A[x] > maxEven)
					{
						maxEven = A[x];
					}
				}
			}

		}

		if (maxValue % 2 == 0)
		{
			ismaxValueEven = true;

			// check that every odd is greater than every even except max
			// must loop again
			iseveryOddGreater = true;
			for (int x = 0; x < A.length; x++)
			{
				if (A[x] % 2 == 0 && A[x] < maxEven)
				{
					if (leastOdd < A[x])
					{
						iseveryOddGreater = false;
					}
				}
			}

		} else
		{
			return 0; // max value is odd
		}

		// loop again to find second lRGEST EVEN

		if (isatLeastoneOdd && iseveryOddGreater && ismaxValueEven)
		{
			return 1; // TRUE
		} else
		{
			return 0; // FALSE
		}

	}

	public static int isInertialv2(int[] A)
	{
		/*
		 * a. it contains at least one odd value b. the maximum value in the
		 * array is even c. every odd value is greater than every even value
		 * that is not the maximum value.
		 */

		boolean isOneOdd = false;
		boolean ismaxValueEven = false;
		int evencount = 0;
		int oddcount = 0;
		if (A.length == 1)
		{
			return 0;// fails both ways
		}

		else
		{

			int maxOdd = A[0];
			int maxEven = A[0];
			int minEven = A[0];
			int minOdd = A[0];
			int secMaxEven = A[0];

			// loop array
			for (int x = 0; x < A.length; x++)
			{
				if (A[x] % 2 == 0)// even
				{
					evencount++;
					if (A[x] > maxEven)
					{
						secMaxEven = maxEven;
						maxEven = A[x];
					}
				} else
				// odd
				{
					oddcount++;

					if (A[x] > maxOdd)
					{
						maxOdd = A[x];
					} else
					{
						minOdd = A[x];
					}

				}

			}

			if (oddcount == 0 || evencount == 0) // failed to find odd or no
													// even
			{
				return 0;
			}

			if (evencount == 1) // just one even
			{
				return 0;
			}

			if (maxOdd > maxEven) // max not even
			{
				return 0;
			}

			if (minOdd < secMaxEven)
			{
				return 0;
			}

			return 1;

		}
	}
}
