/**
 * Numerically sorts a given array using the method Bubble Sort
 * @Author Justine Huynh
 * 02/15/2019
 */
public class BubbleSort {

    /**
     * Finds the index that contains the smallest value in a given array
     * @param myArray the given array
     * @param start the index to start looking
     * @return the index that has the smallest value
     */
    public int findSmallest(float[] myArray, int start)
    {
        int smallest = start; // assume that the starting index holds the smallest value
        for (int index = start + 1; index < myArray.length; index ++)
        {
            if (myArray[index] < myArray[smallest]) // if current index holds an even smaller value
            {
                smallest = index; // updates where the smallest index is
            }
        }
        return smallest; // returns the index where the smallest value is.
    }


    /**
     * Swaps 2 values in an array. It is implied that the value at
     * index = previous is bigger than the value at index = subsequent
     * @param myArray the floating array to be swapped
     * @param previous the previous index
     * @param subsequent the subsequent index
     */

    public void swap(float[] myArray, int previous, int subsequent)
    {
        float temp = myArray[previous]; // Ex: a, b
        myArray[previous] = myArray[subsequent]; // switch: b, b
        myArray[subsequent] = temp; // b, a
    }

    /**
     * Numerically sorts through a given array using the method Bubble Sort
     * @param myArray the array to be sorted
     */
    public void sort (float[] myArray)
    {
        for (int index = 0; index < myArray.length; index ++)
        {
            // if subsequent value is less than previous value, swap!
            if (myArray[index + 1] < myArray[index])
            {
                    swap(myArray, index, findSmallest(myArray, index));
            }
        }
    }
}

