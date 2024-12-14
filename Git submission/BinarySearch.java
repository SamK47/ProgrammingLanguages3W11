import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {
    public BinarySearch() {
        binarySearch();
    }

    private void binarySearch() {

        int valueChosen = 0;
        while (true) {
            System.out.print("In the list are values 0, ..., 9; which value would you like to search with binary search? ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                valueChosen = scanner.nextInt();
                break;
            } else {
                System.out.println("Please integers only!");
            }
        }

        boolean found = false;
        int[] arrayPreDefined = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int low = 0;
        int high = arrayPreDefined.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (valueChosen == arrayPreDefined[mid]) {
                found = true;
                break;
            } else if (valueChosen > arrayPreDefined[mid]) {
                low = mid + 1;
            } else if (valueChosen < arrayPreDefined[mid]) {
                high = mid - 1;
            }
        }

        if (found) {
            System.out.println("");
            System.out.println("Found!");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("Not found!");
            System.out.println("");
        }
    }
}
