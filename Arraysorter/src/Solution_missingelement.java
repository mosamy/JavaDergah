import java.util.Random;

public class Solution_missingelement
{

	public static int solutionv2(int[] A)
	{
		int arrLength = A.length;
		boolean found = false;
		int currentValue = -1;
		int missingValue = -1;
		int x;
		for (x = 0; x < arrLength; x++)
		{
			found = false;
			// search for each index until you find the missing one
			currentValue = x + 1;
			for (int y = 0; y < arrLength; y++)
			{

				// System.out.println(y);
				// search for item at index x
				if (A[y] == currentValue)
				{
					found = true;
					break;
				}

			}
			if (!found)
			{
				missingValue = currentValue;
				break;

			}

		}// end for

		return missingValue;
	}

	public static void swap(int[] A, int index1, int index2)
	{
		int temp = A[index1];
		A[index1] = A[index2];
		A[index2] = temp;

	}

	public static void main(String[] args)
	{

		int[] A = new int[4]; // = GenerateRandomArray(1000000, 1000000);

		A[0] = 2;
		A[1] = 3;
		A[2] = 1;
		A[3] = 5;

		long starttime = System.currentTimeMillis();

		System.out.println(solutionv2(A));
		long endtime = System.currentTimeMillis();

		long elapsedtime = endtime - starttime;

		System.out.println("Elapsed time: " + (double) elapsedtime / 1000
				+ " seconds");

	}

	// print any array
	public static void printarray(int[] array)
	{

		for (int x = 0; x < array.length; x++)
		{
			System.out.println(array[x]);
		}
	}

	public static int[] GenerateRandomArray(int size, int maxvalue)
	{
		Random randomGenerator = new Random();
		int randInt = randomGenerator.nextInt(100000);

		int[] A = new int[size];

		for (int x = 0; x < A.length; x++)
		{
			if (x == randInt)
			{
				x++;
			}
			A[x] = x + 1;

		}

		return A;

	}

}
