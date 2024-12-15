import java.util.Scanner;

public class SearchSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TestChoice testChoice = new TestChoice();
        while (true) {
            System.out.println("Menu of Searching and Sorting Testbed." + "\n");

            System.out.println("1)  Linear searching.");
            System.out.println("2)  Binary searching.");
            System.out.println("3)  O(n^2) type of sorting.");
            System.out.println("4)  O(n*log(n)) type of sorting.");
            System.out.println("5)  Sorting performance.");

            System.out.println("\n" + "q/Q Quit");
            System.out.print("\n" + "Your choice: ");
            String menuChoice = scanner.nextLine();
            if (menuChoice.equals("q") || menuChoice.equals("Q")) {
                System.out.println("");
                System.out.println("You quit the program. Bye!");
                System.out.println("");
                break;
            } else {
                int menuChoiceNumber = Integer.parseInt(menuChoice);
                testChoice.chosenTest(menuChoiceNumber);

            }

        }

    }
}
