import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CDFalco {

    private static final List<String> activityHistory = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Daily Routine App!");

        // Get user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display menu options
        while (true) {
            System.out.println("\nSelect an activity category:");
            System.out.println("1. Eating");
            System.out.println("2. Doing School Works");
            System.out.println("3. Attending Class");
            System.out.println("4. Student Council Works");
            System.out.println("5. Call with Girlfriend");
            System.out.println("6. Break");
            System.out.println("7. Show History");
            System.out.println("8. Quit");

            // Get user choice
            int choice = getIntInput("Enter your choice (1-8): ");

            // Perform the selected activity
            switch (choice) {
                case 1:
                    handleEating();
                    break;
                case 2:
                    handleSchoolWorks();
                    break;
                case 3:
                    handleAttendingClass();
                    break;
                case 4:
                    handleStudentCouncilWorks();
                    break;
                case 5:
                    handleCallWithGirlfriend();
                    break;
                case 6:
                    handleBreak();
                    break;
                case 7:
                    showHistory();
                    break;
                case 8:
                    showHistory();
                    System.out.println("Goodbye, " + name + "!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }
        }
    }

    private static void handleEating() {
        System.out.println("\nEating Options:");
        System.out.println("1. Breakfast");
        System.out.println("2. Lunch");
        System.out.println("3. Dinner");
        System.out.println("4. Others");

        int eatingChoice = getIntInput("Select eating option (1-4): ");
        recordActivity("Eating", getOptionText("Eating", eatingChoice), getTimeInput());

        switch (eatingChoice) {
            case 1:
                System.out.println("Having a quick breakfast.");
                break;
            case 2:
                System.out.println("Having lunch.");
                break;
            case 3:
                System.out.println("Having dinner.");
                break;
            case 4:
                String otherMeal = getStringInput("Enter other meal: ");
                System.out.println("Having " + otherMeal + ".");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }
    }

    private static void handleSchoolWorks() {
        System.out.println("\nSchool Works Options:");
        System.out.println("1. Homework");
        System.out.println("2. Project");
        System.out.println("3. Study for exams");
        System.out.println("4. Others");

        int schoolWorksChoice = getIntInput("Select school works option (1-4): ");
        recordActivity("School Works", getOptionText("School Works", schoolWorksChoice), getTimeInput());

        switch (schoolWorksChoice) {
            case 1:
                System.out.println("Working on homework.");
                break;
            case 2:
                System.out.println("Working on a project.");
                break;
            case 3:
                System.out.println("Studying for exams.");
                break;
            case 4:
                String otherSchoolWorks = getStringInput("Enter other school works: ");
                System.out.println("Working on " + otherSchoolWorks + ".");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }
    }

    private static void handleAttendingClass() {
        System.out.println("\nAttending Class Options:");
        System.out.println("1. Morning Class");
        System.out.println("2. Afternoon Class");
        System.out.println("3. Evening Class");
        System.out.println("4. Others");

        int classChoice = getIntInput("Select class option (1-4): ");
        recordActivity("Attending Class", getOptionText("Attending Class", classChoice), getTimeInput());

        switch (classChoice) {
            case 1:
                System.out.println("Attending morning class.");
                break;
            case 2:
                System.out.println("Attending afternoon class.");
                break;
            case 3:
                System.out.println("Attending evening class.");
                break;
            case 4:
                String otherClass = getStringInput("Enter other class: ");
                System.out.println("Attending " + otherClass + ".");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }
    }

    private static void handleStudentCouncilWorks() {
        System.out.println("\nStudent Council Works Options:");
        System.out.println("1. Meeting");
        System.out.println("2. Planning Events");
        System.out.println("3. Administrative Tasks");
        System.out.println("4. Others");

        int councilWorksChoice = getIntInput("Select council works option (1-4): ");
        recordActivity("Student Council Works", getOptionText("Student Council Works", councilWorksChoice), getTimeInput());

        switch (councilWorksChoice) {
            case 1:
                System.out.println("Attending a student council meeting.");
                break;
            case 2:
                System.out.println("Planning upcoming events.");
                break;
            case 3:
                System.out.println("Working on administrative tasks.");
                break;
            case 4:
                String otherCouncilWorks = getStringInput("Enter other council works: ");
                System.out.println("Working on " + otherCouncilWorks + ".");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }
    }

    private static void handleCallWithGirlfriend() {
        System.out.println("\nCall with Girlfriend Options:");
        System.out.println("1. Morning Call");
        System.out.println("2. Afternoon Call");
        System.out.println("3. Evening Call");
        System.out.println("4. Others");

        int callChoice = getIntInput("Select call option (1-4): ");
        recordActivity("Call with Girlfriend", getOptionText("Call with Girlfriend", callChoice), getTimeInput());

        switch (callChoice) {
            case 1:
                System.out.println("Having a morning call with your girlfriend.");
                break;
            case 2:
                System.out.println("Having an afternoon call with your girlfriend.");
                break;
            case 3:
                System.out.println("Having an evening call with your girlfriend.");
                break;
            case 4:
                String otherCall = getStringInput("Enter other call time: ");
                System.out.println("Having a call with your girlfriend at " + otherCall + ".");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }
    }

    private static void handleBreak() {
        recordActivity("Break", "Taking a break", getTimeInput());
        System.out.println("Taking a break.");
    }

    private static void showHistory() {
        System.out.println("\nActivity History:");
        for (String activity : activityHistory) {
            System.out.println(activity);
        }
    }

    private static String getOptionText(String category, int choice) {
        String optionText = "";
        switch (category) {
            case "Eating":
                optionText = getEatingOptionText(choice);
                break;
            case "School Works":
                optionText = getSchoolWorksOptionText(choice);
                break;
            case "Attending Class":
                optionText = getClassOptionText(choice);
                break;
            case "Student Council Works":
                optionText = getCouncilWorksOptionText(choice);
                break;
            case "Call with Girlfriend":
                optionText = getCallOptionText(choice);
                break;
        }
        return optionText;
    }

    private static String getEatingOptionText(int choice) {
        switch (choice) {
            case 1:
                return "Having Breakfast";
            case 2:
                return "Having Lunch";
            case 3:
                return "Having Dinner";
            case 4:
                return "Having Other Meal";
            default:
                return "Unknown";
        }
    }

    private static String getSchoolWorksOptionText(int choice) {
        switch (choice) {
            case 1:
                return "Working on Homework";
            case 2:
                return "Working on a Project";
            case 3:
                return "Studying for Exams";
            case 4:
                return "Working on Other School Works";
            default:
                return "Unknown";
        }
    }

    private static String getClassOptionText(int choice) {
        switch (choice) {
            case 1:
                return "Attending Morning Class";
            case 2:
                return "Attending Afternoon Class";
            case 3:
                return "Attending Evening Class";
            case 4:
                return "Attending Other Class";
            default:
                return "Unknown";
        }
    }

    private static String getCouncilWorksOptionText(int choice) {
        switch (choice) {
            case 1:
                return "Attending Council Meeting";
            case 2:
                return "Planning Events";
            case 3:
                return "Working on Administrative Tasks";
            case 4:
                return "Working on Other Council Works";
            default:
                return "Unknown";
        }
    }

    private static String getCallOptionText(int choice) {
        switch (choice) {
            case 1:
                return "Having Morning Call";
            case 2:
                return "Having Afternoon Call";
            case 3:
                return "Having Evening Call";
            case 4:
                return "Having Call at Other Time";
            default:
                return "Unknown";
        }
    }

    // Time input
    private static String getTimeInput() {
        return getStringInput("Enter the time (e.g., 10:30 AM): ");
    }

    // If invalid
    private static int getIntInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            System.out.print(prompt);
            scanner.next();
        }
        return scanner.nextInt();
    }

    // Other input
    private static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // Details in History
    private static void recordActivity(String category, String details, String time) {
        String activity = category + ": " + details + " at " + time;
        activityHistory.add(activity);
    }
}
