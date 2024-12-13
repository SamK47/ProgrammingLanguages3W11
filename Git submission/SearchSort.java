import java.util.Scanner;

public class SearchSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TestChoice testChoice = new TestChoice();
        while (true) {
            System.out.println("Menu of Searching and Sorting Testbed.");
            System.out.println("0. Quit the program.");
            System.out.println("1. Linear searching.");
            System.out.println("2. Binary searching.");
            System.out.println("3. 0(n^2) type of sorting.");
            System.out.println("4. 0(n*log(n)) type of sorting.");
            System.out.println("5. Sorting performance.");

            System.out.print("Your choice is: ");
            int menuChoice = scanner.nextInt();
            if (menuChoice == 0) {
                System.out.println("");
                System.out.println("You quit the program. Bye bye!");
                System.out.println("");
                break;
            } else {
                testChoice.chosenTest(menuChoice);

            }

        }

    }
}
