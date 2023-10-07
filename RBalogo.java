import java.util.Scanner;

public class RBalogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Your Daily Routine Simulator!");
        System.out.println("---------------------------------------");
        
        // Get user's name
        System.out.print("Enter your name: \n");
        String name = scanner.nextLine();
        
        // Display the menu
        displayMenu(name);
        
        int choice;
        do {
            // Get user's choice
            System.out.print("Enter your choice (Choose from 1-5 to perform activities, 0 to exit):\n ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    wakeUp(name);
                    break;
                case 2:
                    eatBreakfast(name);
                    break;
                case 3:
                    work(name);
                    break;
                case 4:
                    exercise(name);
                    break;
                case 5:
                    relax(name);
                    break;
                case 0:
                    System.out.println("Talk to me again if you want to do another activity. Have a great day, " + name + "!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.\n");
                    break;
            }
        } while (choice != 0);
        
        scanner.close();
    }
    
    // Method to display the menu
    public static void displayMenu(String name) {
        System.out.println("\nHello, " + name + "! What would you like to do today?\n");
        System.out.println("1. Go for a jog");
        System.out.println("2. Eat Breakfast");
        System.out.println("3. Watch Anime");
        System.out.println("4. Play Basketball");
        System.out.println("5. Relax");
        System.out.println("0. Exit\n");
    }
    
    // Method for waking up
    public static void wakeUp(String name) {
        System.out.println("\n"+name + " went for a jog outside.\n");
    }
    
    // Method for eating breakfast
    public static void eatBreakfast(String name) {
        System.out.println("\n"+name + " enjoys a healthy and delicious breakfast.\n");
    }
    
    // Method for working
    public static void work(String name) {
        System.out.println("\n"+name + " is watching a whole season of Anime\n");
    }
    
    // Method for exercising
    public static void exercise(String name) {
        System.out.println("\n"+name + " plays basketball at the gym with friends\n");
    }
    
    // Method for relaxing
    public static void relax(String name) {
        System.out.println("\n"+name + " takes a break from school works to relax.\n");
    }
}
