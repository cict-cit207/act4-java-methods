import java.util.Scanner;

public class JTorre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A Day as a WVSU student");

        System.out.println("-------------------------------");

        System.out.print("You woke up at? (e.g., 7:00 AM): ");

        String wakeUpTime = scanner.nextLine();

        
        String partOfDay;    // Check if am or pm
        if (isMorning(wakeUpTime)) {
            partOfDay = "Morning";
        } else {
            partOfDay = "Afternoon";
        }

        System.out.println("Good " + partOfDay + "!");

        
        System.out.print("Let's eat breakfast? (yes/no): "); // Ask you if you want to take breakfast
        String eatBreakfastChoice = scanner.nextLine().toLowerCase();
        if (eatBreakfastChoice.equals("yes")) {
            eatBreakfast(wakeUpTime);
        } else {
            System.out.println("Skipping breakfast.");
        }

        System.out.print("Are you going to West today? (yes/no): ");
        String goWorkChoice = scanner.nextLine().toLowerCase();
        if (goWorkChoice.equals("yes")) {
            System.out.print("Enter the time you go to school (e.g., 9:00 AM): ");
            String workStartTime = scanner.nextLine();
            goToWork(workStartTime);
            work();
            System.out.print("Let's go lunch? (yes/no): ");
            String eatLunchChoice = scanner.nextLine().toLowerCase();
            if (eatLunchChoice.equals("yes")) {
                System.out.print("Enter the time you eat lunch (e.g., 12:30 PM): ");
                String lunchTime = scanner.nextLine();
                eatLunch(lunchTime);
            } else {
                System.out.println("Skipping lunch.");
            }
            continueWorking();
        } else {
            System.out.println("Pahuway..");
        }

        System.out.print("Go home nata?? (yes/no): ");
        String returnHomeChoice = scanner.nextLine().toLowerCase();
        if (returnHomeChoice.equals("yes")) {
            System.out.print("You arrived at? (e.g., 6:00 PM): ");
            String returnHomeTime = scanner.nextLine();
            returnHome(returnHomeTime);
            relax();
            System.out.print("Time to sleep? (yes/no): ");
            String sleepChoice = scanner.nextLine().toLowerCase();
        if (sleepChoice.equals("yes")) {
                System.out.print("Enter the time you go to sleep (e.g., 10:00 PM): ");
                String sleepTime = scanner.nextLine();
                sleep(sleepTime);
        } else {
                System.out.println("Pulaww!");
            }

        } else {
            System.out.println("Pulaw gamay hahaha!");
        }

        scanner.close();
    }

    public static boolean isMorning(String time) {
        // Check if the time is in the morning (before noon)
        return time.contains("AM") || time.contains("am");
    }

    public static void eatBreakfast(String time) {
        System.out.println("Had breakfast at " + time);
    }

    public static void goToWork(String time) {
        System.out.println("Went to WEST at " + time);
    }

    public static void work() {
        System.out.println("Grinding in school..");
    }

    public static void eatLunch(String time) {
        System.out.println("Had lunch at " + time);
    }

    public static void continueWorking() {
        System.out.println("Continued grinding in school...");
    }

    public static void returnHome(String time) {
        System.out.println("Returned home at " + time);
    }

    public static void relax() {
        System.out.println("Relaxing...");
    }

    public static void sleep(String time) {
        System.out.println("Went to sleep at " + time);
    }
  
}
