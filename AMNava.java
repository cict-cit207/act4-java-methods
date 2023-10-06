import java.util.Scanner;

public class AMNava {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hey there! This is how my weekends go, and you're trying it out. Enter 1 to sleep in and 2 to start your day productively: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            sleepIn();
        } else if (choice == 2) {
            beProductive();
        } else {
            System.out.println("Invalid choice. Please try again. You have no choice but to go about your day, sorry!");
        }

        scanner.close();
    }

    public static void amRoutine() {
        System.out.println();
        print("Eating breakfast...");
        print("Showering...");
        print("Taking a walk around the neighborhood...");
        print("Organizing to-do list for the day...");

        System.out.println();
        System.out.println("You're doing great! Press any key to continue.");
        keyPress();
        nnRoutine();
    }

    public static void nnRoutine() {
        System.out.println();
        print("Lunch...");
        print("Accomplishing to-do list...");
        print("Free time...");

        System.out.println();
        System.out.println("Almost done with the day! Press any key to continue.");
        keyPress();
        pmRoutine();
    }

    public static void pmRoutine() {
        System.out.println();
        print("Dinner...");
        print("Half bath...");
        print("Skincare...");
        print("Brushing teeth...");
        System.out.println();
        print("Good night!");
    }

    public static void sleepIn() {
        System.out.println();
        print("Sleeping...");
        print("More sleeping...");

        System.out.println();
        System.out.println("Ready to get up? Press any key to continue.");
        keyPress();
        amRoutine();
    }

    public static void beProductive() {
        amRoutine();
    }

    public static void print(String message) {
        System.out.print(message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println();
    }

    public static void keyPress() {
        scanner.next(); 
    }
}