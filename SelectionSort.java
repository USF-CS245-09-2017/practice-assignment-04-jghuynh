/**
 * Sorts a given array using Selection Sort: Repeatedly finding the minimum
 * value and putting it in the beginning of the array
 * @author Justine Huynh
 * 02/15/2019
 */
public class SelectionSort implements SortingAlgorithm {

    /**
     * Sorts a given array using Selection Sort: Repeatedly find the
     * minimun value and put it in the begging of array
     * @param myArray the array to be sorted
     */
    public void sort(int[] myArray)
    {
        /*
        Repeatedly find the minimum value and putting it in the beginning.
        Use 2 subarrays. One of them is sorted, the other is unsorted
         */
        for (int index = 0; index < myArray.length - 1; index ++)
        {
            int minIndex = index;
            // go through the array..each time starting at a later index
            for (int j = index + 1; j < myArray.length; j ++)
            {
                // if current value is less than our supposed min value
                // swap!
                if (myArray[j] < myArray[minIndex])
                {
                    minIndex = j; // update the minIndex
                }
                // swap the min element with the curent element
            }
            swap(myArray, minIndex, index);
        }
    }

    /**
     * Swaps 2 values in a given array
     * @param myArray the given array
     * @param minIndex the index
     * @param outerInd the index
     */
    private void swap(int[] myArray, int minIndex, int outerInd)
    {
        int temp = myArray[outerInd];
        myArray[outerInd] = myArray[minIndex];
        myArray[minIndex] = temp;

    }
}
