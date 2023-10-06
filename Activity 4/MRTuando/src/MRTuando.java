//Activity 4 - Daily Life Routine
//Michael Rey T. Tuando BSCS 2-A
import java.util.Scanner;

public class MRTuando {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Choose to start your day, learn more about
        // the program, or exit the program.
        while (true) {
            System.out.println("*******************************************************************************");
            System.out.println("Hey there! Welcome to your own Daily Routine Program featuring Expenses Tracker.");
            System.out.println("*******************************************************************************\n");
            System.out.println("Enter your choice.");
            System.out.println("1. Start your day");
            System.out.println("2. About");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            //Gets user input
            int choice = scanner.nextInt();
            scanner.nextLine();

            //Switch function made for each corresponding methods.
            switch (choice) {
                case 1:
                    startDay(scanner);
                    break;
                case 2:
                    about();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    //Method that gets user daily morning, afternoon, and evening routine and expenses.
    private static void startDay(Scanner scanner) {
        String morningRoutine = "";
        String afternoonRoutine = "";
        String eveningRoutine = "";
        double dailyExpenses = 0.0;
        double morningExpenses = 0.0;
        double afternoonExpenses = 0.0;
        double eveningExpenses = 0.0;

        //User can choose a specific day.
        System.out.println("Choose a day:");
        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        System.out.println("6. Saturday");
        System.out.println("7. Sunday");
        System.out.print("Enter your choice: ");

        int dayChoice = scanner.nextInt();
        scanner.nextLine();

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String selectedDay = days[dayChoice - 1];

        do {
            System.out.println("\n" + selectedDay + " Routine:");
            System.out.println("1. Morning");
            System.out.println("2. Afternoon");
            System.out.println("3. Evening");
            System.out.println("4. Done (Return to Welcome Page)");
            System.out.print("Enter your choice: ");

            int routineChoice = scanner.nextInt();
            scanner.nextLine();

            //User can choose what time of the day for their routine.
            switch (routineChoice) {
                case 1:
                    System.out.print("Enter your morning routine: ");
                    morningRoutine = scanner.nextLine();
                    morningExpenses = recordExpenses(scanner, "morning");
                    break;
                case 2:
                    System.out.print("Enter your afternoon routine: ");
                    afternoonRoutine = scanner.nextLine();
                    afternoonExpenses = recordExpenses(scanner, "afternoon");
                    break;
                case 3:
                    System.out.print("Enter your evening routine: ");
                    eveningRoutine = scanner.nextLine();
                    eveningExpenses = recordExpenses(scanner, "evening");
                    break;
                case 4:
                    System.out.println("Returning to the Welcome Page.");
                    showRoutine(selectedDay, morningRoutine, afternoonRoutine, eveningRoutine);
                    System.out.println("Total Expenses for the Day: ₱" + dailyExpenses);
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (true);
    }

    //Method that records the expenses of the user for a specific time.
    private static double recordExpenses(Scanner scanner, String timeOfDay) {
        double totalExpenses = 0.0;

        //User can choose yes if they want to record expenses
        // or no if no moneys were harmed during the day (jkjk).
        System.out.print("Did you have expenses this " + timeOfDay + "? (yes/no): ");
        String expenseChoice = scanner.nextLine().toLowerCase();

        //User can name their expenses along with the price.
        if (expenseChoice.equals("yes")) {
            do {
                System.out.print("Enter the name of the expense: ");
                String expenseName = scanner.nextLine();

                System.out.print("Enter the price of the expense: ₱");
                double expenseAmount = scanner.nextDouble();
                scanner.nextLine();

                totalExpenses += expenseAmount;

                //User can add more expenses.
                System.out.print("Do you want to add another expense this " + timeOfDay + "? (yes/no): ");
                expenseChoice = scanner.nextLine().toLowerCase();
            } while (expenseChoice.equals("yes"));
        }

        return totalExpenses;
    }

    //Method that displays daily routine.
    private static void showRoutine(String day, String morningRoutine, String afternoonRoutine, String eveningRoutine) {
        System.out.println("\nYour " + day + " Routine:");
        System.out.println("Morning Routine: " + morningRoutine);
        System.out.println("Afternoon Routine: " + afternoonRoutine);
        System.out.println("Evening Routine: " + eveningRoutine);
    }

    //Method that explains why this program was created.
    private static void about() {
        System.out.println("                     * * *                          ");
        System.out.println("      Hey, thanks for using this program!");
        System.out.println("There's no deep explanation about this program, like");
        System.out.println("for real, except that it does not only record a user's");
        System.out.println("daily routine, but it also has a feature that lets the");
        System.out.println("user list where they spend their money for the day.\n");

        System.out.println("Based on my personal experience, daily expenses should");
        System.out.println("always be monitored especially us students because");
        System.out.println("we sometimes lose track of our expenses which are more");
        System.out.println("likely caused by unnecessary but too pricy things. :/");

    }
}
