/**
 * Numerically sorts a given array using the method Bubble Sort:
 * Repeatedly switch every values.
 * @author Justine Huynh
 * 02/15/2019
 */
public class BubbleSort implements SortingAlgorithm {

    /**
     * Finds the index that contains the smallest value in a given array
     * @param myArray the given array
     * @param start the index to start looking
     * @return the index that has the smallest value
     */
    public int findSmallest(int[] myArray, int start)
    {
        int smallestInd = start; // assume that the starting index holds the smallest value
        for (int index = start + 1; index < myArray.length; index ++)
        {
            if (myArray[index] < myArray[smallestInd]) // if current index holds an even smaller value
            {
                smallestInd = index; // updates where the smallest index is
            }
        }
        return smallestInd; // returns the index where the smallest value is.
    }


    /**
     * Swaps 2 values in an array. It is implied that the value at
     * index = previous is bigger than the value at index = subsequent
     * @param myArray the floating array to be swapped
     * @param previous the previous index
     * @param subsequent the subsequent index
     */

    private void swap(int[] myArray, int previous, int subsequent)
    {
        int temp = myArray[previous]; // Ex: a, b
        myArray[previous] = myArray[subsequent]; // switch: b, b
        myArray[subsequent] = temp; // b, a
    }

    /**
     * Numerically sorts through a given array using the method Bubble Sort
     * @param myArray the array to be sorted
     */

    public void sort(int[] myArray)
    {
        for (int i = 0; i < myArray.length - 1; i ++)
        {
            for (int index = 0; index < myArray.length - i - 1; index ++)
            {
                if (myArray[index] > myArray[index + 1])
                {
                    swap(myArray, index, index + 1);
                }
            }
        }

    }

    public static void main(String[] args)
    {
        //int[] myArray = {12, 3, 0, 4, 7};
    }
}

