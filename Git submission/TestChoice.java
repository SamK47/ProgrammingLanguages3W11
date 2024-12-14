import java.util.Random;

public class TestChoice {
    public void chosenTest(int choice) {
        if (choice == 1) {
            LinearSearch linearSearch = new LinearSearch();
        } else if (choice == 2) {
            BinarySearch binarySearch = new BinarySearch();
        } else if (choice == 3) {
            BubbleSort bubbleSort = new BubbleSort(randomTen());
        } else if (choice == 4) {
            MergeSort mergeSort = new MergeSort(randomTen());
        } else if (choice == 5) {
            System.out.println("Choice 5 not implemented.");
        }
    }

    public int[] randomTen() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200) - 99;
        }
        return array;

    }
}