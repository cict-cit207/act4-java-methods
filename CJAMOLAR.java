import java.util.Scanner;

public class CJAmolar {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hey there! What would you like to do today? Enter 1 to rest and 2 to do something today: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            rest();
        } else if (choice == 2) {
            doSomething();
        } else {
            System.out.println("Invalid choice. Please try again.");
        }

        scanner.close();
    }
    public static void amRoutine() {
        System.out.println();
        print("Eating breakfast.");
        print("Taking a Shower.");
        print("Doing some light stretches.");
        print("Taking a Quick Jog around the neighborhood.");
        print("Doing Homeworks.");

        System.out.println();
        System.out.println("You're doing great! Press any key to continue.");
        keyPress();
        pmRoutine();
    }

    public static void pmRoutine() {
        System.out.println();
        print("Lunch Break!!");
        print("Playing Video Games.");
        print("Watching Anime.");
        print("Preparing Dinner.");
        print("Dinner.");
        print("Half bath.");
        print("Brushing teeth.");
        System.out.println();
        print("Preparing Bed.");
        print("Good night!");
    }

    public static void rest() {
        System.out.println();
        print("Sleeping.");
        print("More sleeping.");
		print("Still sleeping.")

        System.out.println();
        System.out.println("Ready to get up? Press any key to continue.");
        keyPress();
        amRoutine();
    }

    public static void doSomething() {
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