
public class BubbleSort {
    public BubbleSort(int[] array) {
        sort(array);
    }

    // Method to sort the array.
    public void sort(int[] array) {
        // int[] array = {6, 4, 2, 9, 8, 99};
        // Print array before sorting.
        System.out.println("\n" + "Data set before insertion sorting: ");
        for (int number : array) {
            System.out.print(number + " ");
        }

        // Sorting logic for ascending order.
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) // If the next int is smaller than the current int.
                {
                    int temp = array[j]; // Store the current int for later use.
                    array[j] = array[j + 1]; // Make the current int, to be new the smaller next int.
                    array[j + 1] = temp;// Make the next int, into the new bigger current int.
                }
            }
        }

        // Print array after sorting.
        System.out.println("\n" + "Data set after insertion sorting: ");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println("");
        System.out.println("");
    }

}
