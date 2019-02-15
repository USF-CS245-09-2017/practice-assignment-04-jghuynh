/**
 * Sorts a given array using Selection Sort: Repeatedly finding the minimum
 * value and putting it in the beginning of the array
 * @Author Justine Huynh
 * 02/15/2019
 */
public class SelectionSort {


    /**
     * Sorts a given array using Selection Sort: Repeatedly find the
     * minimun value and put it in the begging of array
     * @param myArray the array to be sorted
     * @param n the length of the array
     */
    public void sort(float[] myArray, int n)
    {
        /*
        Repeatedly find the minimum value and putting it in the beginning.
        Use 2 subarrays. One of them is sorted, the other is unsorted
         */
        int index = 0;
        for (index = 0; index < n - 1; index ++)
        {
            int minIndex = index;
            // go through the array..each time starting at a later index
            for (int j = index + 1; j < n; j ++)
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
    public void swap(float[] myArray, int minIndex, int outerInd)
    {
        float temp = myArray[outerInd];
        myArray[outerInd] = myArray[minIndex];
        myArray[minIndex] = temp;

    }
}
