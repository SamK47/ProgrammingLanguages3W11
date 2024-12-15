import java.util.Scanner;

public class LinearSearch {
    public LinearSearch() {
        linearSearch();
    }

    // Method to perform linear search.
    public void linearSearch() {
        System.out.print("In the list are values 0, ..., 9; which value would you like to search with linear search? ");

        Scanner scanner = new Scanner(System.in);
        int valueChosen = scanner.nextInt();
        boolean found = false;
        int[] arrayPreDefined = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        
        // Linear search algorithm.
        for (int number : arrayPreDefined)
            if (number == valueChosen)
                found = true;

        // Prints the result.
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