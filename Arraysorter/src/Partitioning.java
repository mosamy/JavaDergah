//partitioning class for the quick sort algorithm
public class Partitioning {
	public int[] theArray;
	public int theArraySize;

	// class constructor
	public Partitioning(int[] theInputArray) {
		private theArraySize = theArray.length;
		private theArray = theInputArray;
        int pivotValue = theArray[theArraySize -1];
		int leftPointer = -1;
		int rightPointer = theArraySize;
		
		while(true)
		{
			while (leftPointer <  theArraySize -1 && theArray[++leftPointer] >= pivotValue)
			{
				;
			}
			
			while (rightPointer > -1 && theArray[--rightPointer] <= pivotValue)
			{
				;
			}
			
			
			
			if (leftPointer >= rightPointer)
			{
				break;
			}
			else
			{
				swap(leftPointer, rightPointer);
			}
		}
		
		
				
	}

	// swap any two values
	public void swap(int index1, int index2) {
		int temp = theArray[index1];
		theArray[index1] = theArray[index2];
		theArray[index2] = temp;

	}

}
