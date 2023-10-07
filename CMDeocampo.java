// ACTIVITY 4 - JAVA METHODS 
// CHERILYN MARIE DEOCAMPO BSCS 2A
import java.util.InputMismatchException;
import java.util.Scanner;

public class CMDeocampo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Greet the user
        System.out.println("Hello! I am Ray, who will be assisting you for today.");

        // Get user's name
        System.out.print("May I first know your name? ");
        String name = scanner.nextLine();

        System.out.println();
        System.out.println("Nice to meet you, " + name + "!");

        boolean exit = false;

        while (!exit) {
            // Ask the user for their plans
            System.out.println("What would you like to do today?");
            System.out.println("1. Wake up");
            System.out.println("2. Enjoy a meal");
            System.out.println("3. Clean the house");
            System.out.println("4. Relax");
            System.out.println("5. Watch Anime");
            System.out.println("6. Play Games");
            System.out.println("7. Read Manga");
            System.out.println("8. Sleep");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        wakeUp(name);
                        break;
                    case 2:
                        eatMeal(name, scanner);
                        break;
                    case 3:
                        cleanHouse(name);
                        break;
                    case 4:
                        relax(name);
                        break;
                    case 5:
                        watchAnime(name);
                        break;
                    case 6:
                        playGames(name);
                        break;
                    case 7:
                        readManga(name);
                        break;
                    case 8:
                        sleep(name);
                        break;
                    case 9:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose a valid activity.");
                }

                // Add a dividing line after each activity
                System.out.println("-------------------------------------------------------------");
                System.out.println("-------------------------------------------------------------");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Consume the invalid input
            }
        }

        System.out.println("Thank you for using me as your assistant. Have a great day!");
        scanner.close();
    }

    // Activity methods with comments

    public static void wakeUp(String name) {
        // Print a blank line for separation
        System.out.println();

        // Print a message describing waking up with the user's name
        System.out.println(name + ", you wake up feeling refreshed and ready for the day. It's time to start your morning routine.");
    }

    public static void eatMeal(String name, Scanner scanner) {
        // Print a blank line for separation
        System.out.println();

        // Print a message asking what meal to eat with the user's name
        System.out.print(name +", it's mealtime. What would you like to have for your meal? ");
        String mealChoice = scanner.nextLine();
        // Print a message describing the user's meal
        System.out.println("You enjoy a delicious " + mealChoice + " for your meal.");
    }

    public static void cleanHouse(String name) {
        // Print a blank line for separation
        System.out.println();

        // Print a message describing cleaning the house with the user's name
        System.out.println(name + ", you spend time cleaning the house and making it look tidy. A clean environment can make you feel more productive.");
    }

    public static void relax(String name) {
        // Print a blank line for separation
        System.out.println();

        // Print a message describing relaxing with the user's name
        System.out.println(name + ", you take some time to unwind and relax. Consider listening to soothing music or practicing mindfulness.");
    }

    public static void watchAnime(String name) {
        // Print a blank line for separation
        System.out.println();

        // Print a message describing watching anime with the user's name
        System.out.println(name + ", you have a great time watching your favorite anime. It's a fantastic way to immerse yourself in exciting stories and characters.");
    }

    public static void playGames(String name) {
        // Print a blank line for separation
        System.out.println();

        // Print a message describing playing games with the user's name
        System.out.println(name + ", you have a blast playing games. Whether it's video games, board games, or card games, gaming is a fun way to spend your time.");
    }

    public static void readManga(String name) {
        // Print a blank line for separation
        System.out.println();

        // Print a message describing reading manga with the user's name
        System.out.println(name + ", you have a great time reading your favorite manga. Manga can transport you to different worlds and adventures.");
    }

    public static void sleep(String name) {
        // Print a blank line for separation
        System.out.println();

        // Print a message describing going to sleep with the user's name
        System.out.println(name + ", you go to bed, feeling grateful for the day, and drift into a peaceful sleep. Sweet dreams!");
    }
}
