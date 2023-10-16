//Lemmuel Dave Dañosos
//BSCS 2A AI
//Daily Routine Activities

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

  class LDDañosos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Choose a mode:");
            System.out.println("1. Create a new daily routine");
            System.out.println("2. Add activities to an existing routine");
            System.out.println("3. Exit");
            System.out.print("Enter the mode (1, 2, or 3 to exit): "); // Back to the mode of choices after the end of the program.
            int mode = scanner.nextInt();

            List<Activity> dailyRoutine = new ArrayList<>();

            switch (mode) {
                case 1:
                    dailyRoutine = createNewRoutine(scanner);
                    break;
                case 2:
                    dailyRoutine = addActivitiesToRoutine(scanner, dailyRoutine);
                    break;
                case 3:
                    continueProgram = false; // Exit the program
                    break;
                default:
                    System.out.println("Invalid mode selected. Please choose 1, 2, or 3.");
            }

            if (mode != 3) {
                displayRoutine(dailyRoutine);
            }
        }

        scanner.close();
    }

     // Method to create a new daily routine
    public static List<Activity> createNewRoutine(Scanner scanner) {
        List<Activity> activities = new ArrayList<>();

        System.out.println("Enter daily routine activities (Enter 'done' to finish):");

        while (true) {
            System.out.print("Activity: ");
            String activityName = scanner.next();

            if (activityName.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Number of Hours: ");
            double hours = scanner.nextDouble();
            System.out.print("Number of Minutes: ");
            double minutes = scanner.nextDouble();

            activities.add(new Activity(activityName, hours, minutes));
        }

        return activities;
    }

    // Method to add activities to an existing routine
    public static List<Activity> addActivitiesToRoutine(Scanner scanner, List<Activity> existingRoutine) {
        List<Activity> updatedRoutine = new ArrayList<>(existingRoutine);

        System.out.println("Enter additional daily routine activities (Enter 'done' to finish):");

        while (true) {
            System.out.print("Activity: ");
            String activityName = scanner.next();

            if (activityName.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Number of Hours: ");
            double hours = scanner.nextDouble();
            System.out.print("Number of Minutes: ");
            double minutes = scanner.nextDouble();

            updatedRoutine.add(new Activity(activityName, hours, minutes));
        }

        return updatedRoutine;
    }

    // Method to display the daily routine
    public static void displayRoutine(List<Activity> activities) {
        System.out.println("\nMy Daily Routine:");

        for (int i = 0; i < activities.size(); i++) {
            Activity activity = activities.get(i);
            System.out.println((i + 1) + ". " + activity.getName() + ": " + activity.getHours() + " hours and " + activity.getMinutes() + " minutes");
        }

        double totalHours = calculateTotalHours(activities);
        System.out.println("\nTotal Hours Spent: " + (int) totalHours + " hours and " + (int) ((totalHours - (int) totalHours) * 60) + " minutes");
    }

    // Method to calculate total hours from a list of activities
    public static double calculateTotalHours(List<Activity> activities) {
        double totalHours = 0;

        for (Activity activity : activities) {
            totalHours += activity.getHours() + activity.getMinutes() / 60.0;
        }

        return totalHours;
    }
}
// Parameters
class Activity {
    private String name;
    private double hours;
    private double minutes;

    public Activity(String name, double hours, double minutes) {
        this.name = name;
        this.hours = hours;
        this.minutes = minutes;
    }

    public String getName() {
        return name;
    }

    public double getHours() {
        return hours;
    }

    public double getMinutes() {
        return minutes;
    }
}
