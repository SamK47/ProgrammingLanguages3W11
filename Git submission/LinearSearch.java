import java.util.Scanner;

public class LinearSearch {
    public LinearSearch() {
        linearSearch();
    }
    public void linearSearch() {
        System.out.print("In the list are values 0, ..., 9; which value would you like to search with linear search? ");

        Scanner scanner = new Scanner(System.in);
        int valueChosen = scanner.nextInt();
        boolean found = false;
        int[] arrayPreDefined = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int number : arrayPreDefined)
            if (number == valueChosen)
                found = true;
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