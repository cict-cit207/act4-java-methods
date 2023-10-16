import java.util.Scanner;

public class CAPanique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nHey Christian! Wondering what you should do for the day?");
        
        while (true) {
            System.out.println("\nEnter the time of day (morning, midday, evening), or type 'exit' to quit: ");
            String timeOfDay = scanner.nextLine().toLowerCase();
            
            if (timeOfDay.equals("exit")) {
                System.out.println("Goodbye!");
                break; 
            }

            switch (timeOfDay) {
                case "morning":
                    morningRoutine();
                    break;
                case "midday":
                    middayRoutine();
                    break;
                case "evening":
                    eveningRoutine();
                    break;
                default:
                    System.out.println("Invalid time of day entered. Please try again.");
            }
        }

        scanner.close();
    }

    public static void morningRoutine() {
        System.out.println("\nMorning Routine:");
        freshenUp();
        boolean hasSchool = getYesOrNo("Do you have school today? (yes/no): ");
        if (hasSchool) {
            getReadyForSchool("Math", "Programming");
        } else {
            enjoyDayOff();
        }
    }

    public static void middayRoutine() {
        System.out.println("\nMidday Routine:");
        completeTasks("homework", "project");
        boolean inSchool = getYesOrNo("Are you currently at school? (yes/no): ");
        if (inSchool) {
            study("Java programming");
        } else {
            relax();
        }
    }

    public static void eveningRoutine() {
        System.out.println("\nEvening Routine:");
        haveDinner("healthy meal");
        relax();
        doHomework("Java");
    }

    public static void freshenUp() {
        System.out.println("1. Freshen up by brushing your teeth, taking a shower, and having breakfast.");
    }

    public static boolean getYesOrNo(String message) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("yes")) {
                return true;
            } else if (input.equals("no")) {
                return false;
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }
    }

    public static void getReadyForSchool(String... subjects) {
        System.out.print("2. Get ready for school and leave on time. Subjects to study: ");
        for (String subject : subjects) {
            System.out.print(subject + ", ");
        }
        System.out.println();
    }

    public static void enjoyDayOff() {
        System.out.println("2. Enjoy your day off! Make sure to relax and have fun!");
    }

    public static void completeTasks(String... tasks) {
        System.out.print("1. Complete tasks: ");
        for (String task : tasks) {
            System.out.print(task + ", ");
        }
        System.out.println();
    }

    public static void study(String subject) {
        System.out.println("2. Take time to study " + subject + ". You can never be too sure.");
    }

    public static void relax() {
        System.out.println("2. Take time to relax! Relaxing is also part of a routine. Do something recreational!");
    }

    public static void haveDinner(String meal) {
        System.out.println("1. Have a nutritious dinner with a focus on " + meal + ".");
    }

    public static void doHomework(String assignments) {
        System.out.println("3. Don't forget to do your homework for " + assignments + "!");
    }
}
