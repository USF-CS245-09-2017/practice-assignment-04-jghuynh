/**
 * Numerically sorts the array by the Insertion method
 * @Auhthor Justine Huynh
 * 02/15/2019
 */
public class InsertionSort {

    /**
     * Numerically sorts the array by the Insertion method
     * @param myArray the array to be sorted
     */
    public void sort(float[] myArray)
    {
        for (int index = 1; index < myArray.length; index ++)
        {
            float temp = myArray[index]; // create the temp variable for current value
            int prevIndex = index - 1;
            while (prevIndex >= 0 && myArray[prevIndex] > temp)
            {
                // if the previous value is greater than the temp/current value, switch
                myArray[index] = myArray[prevIndex];
                prevIndex --; // keep going back
            }
            myArray[prevIndex] = temp; // the current (smaller value) goes first.
        }

    }
}
