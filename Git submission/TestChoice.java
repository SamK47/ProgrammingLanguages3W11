public class TestChoice {
    public void chosenTest(int choice) {
        if (choice == 1) {
            LinearSearch linearSearch = new LinearSearch();
        } else if (choice == 2) {
            BinarySearch binarySearch = new BinarySearch();
        } else if (choice == 3) {
            System.out.println("Choice 3 not implemented.");
        } else if (choice == 4) {
            System.out.println("Choice 4 not implemented.");
        } else if (choice == 5) {
            System.out.println("Choice 5 not implemented.");
        }
    }

}