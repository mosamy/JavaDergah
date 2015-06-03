import java.util.Random;

public class ArraySorter {

	public static void main(String[] args) {
		int[] anArray = new int[10];
		Random randomGenerator = new Random();
		//
		for (int x = 0; x < 10; x++) {
			int randInt = randomGenerator.nextInt(100);

			anArray[x] = randInt;

		}

		System.out.println("Unsorted Array");
		for (int x = 0; x < 10; x++) {
			System.out.println(anArray[x]);
		}

		System.out.println("The Highest value of the array = "
				+ HighestValue(anArray));
		System.out.println("The lowest value of the array is = "
				+ LowestValue(anArray));
		System.out.println("Average of the array = " + ArrayAverage(anArray));
		System.out.println("The array has " + anArray.length + " members");

		System.out.println("Bubble Sorted");
		printarray(bubbleSort(anArray));

	}

	// sort values ascending
	public static int[] bubbleSort(int[] unsorted) {
		int temp;
		Boolean swap = true;
		int x = 0;
		while (swap == true) {
			x++;

			swap = false;
			// System.out.println("Pass " + x);
			for (int i = 0; i < unsorted.length - 1; i++) {

				if (unsorted[i] > unsorted[i + 1]) {
					temp = unsorted[i];
					unsorted[i] = unsorted[i + 1];
					unsorted[i + 1] = temp;
					swap = true;
				}

			}

			/*
			 * for (int z = 0; z < 10; z++) { System.out.println(unsorted[z]); }
			 */

		}

		return unsorted;

	}

	// return array average
	public static Double ArrayAverage(int[] AnArray) {
		int arrayLength = AnArray.length;
		int arraySum = ArraySum(AnArray);
		return (double) (arraySum / arrayLength);

	}

	public static int HighestValue(int[] AnArray) {
		int hValue = AnArray[0];
		for (int x = 0; x < AnArray.length; x++) {
			if (AnArray[x] > hValue) {
				hValue = AnArray[x];
			}

		}
		return hValue;
	}

	public static int LowestValue(int[] AnArray) {
		int lValue = AnArray[0];
		for (int x = 0; x < AnArray.length; x++) {
			if (AnArray[x] < lValue) {
				lValue = AnArray[x];
			}

		}
		return lValue;
	}

	// sum of Array
	public static int ArraySum(int[] AnArray) {
		int arrayLength = AnArray.length;
		int arraySum = 0;
		for (int x = 0; x < arrayLength - 1; x++) {
			arraySum += AnArray[x];

		}
		return arraySum;
	}

	// print any array
	public static void printarray(int[] array) {

		for (int x = 0; x < array.length; x++) {
			System.out.println(array[x]);
		}
	}

	// swap any two values
	public static void swap(int int1, int int2) {
		int temp = int1;
		int1 = int2;
		int2 = temp;

	}

	public static int oddMember() {
		return 0;
	}
}
