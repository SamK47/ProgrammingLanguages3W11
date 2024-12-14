// Class implementing the Merge Sort algorithm.
public class MergeSort {

    // Constructor to sort the array using the Merge Sort algorithm.
    public MergeSort(int[] array) {
        mergeSort(array);
    }

    // Method to perform the Merge Sort algorithm.
    public static void mergeSort(int[] array) {

        // Base case: If the array has 1 or no elements, it is already sorted.
        if (array.length <= 1) return;

        // Temporary array to store merged results.
        int[] temp = new int[array.length];

        // Perform iterative merge sort by dividing the array into subarrays of increasing sizes.
        for (int size = 1; size < array.length; size = size * 2) {

            // Merge subarrays for the current size.
            for (int leftStart = 0; leftStart < array.length; leftStart += 2 * size) {

                int left = leftStart;                         // Start index of the left subarray.
                int mid = Math.min(left + size, array.length); // End index of the left subarray / start of the right subarray.
                int right = Math.min(left + 2 * size, array.length); // End index of the right subarray.

                // Merge the two subarrays.
                merge(array, temp, left, mid, right);
            }
        }
    }

    // Method to merge two sorted subarrays.
    private static void merge(int[] array, int[] temp, int left, int mid, int right) {

        // Copy the original array into the temporary array.
        for (int i = left; i < right; i++) {
            temp[i] = array[i];
        }

        int i = left;  // Pointer for the left subarray.
        int j = mid;   // Pointer for the right subarray.
        int k = left;  // Pointer for the merged array.

        // Merge the two subarrays while comparing their elements.
        while (i < mid && j < right) {
            if (temp[i] <= temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left subarray.
        while (i < mid) {
            array[k] = temp[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right subarray.
        while (j < right) {
            array[k] = temp[j];
            j++;
            k++;
        }
    }

    // Method to print the array.
    public static void printarrayay(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
