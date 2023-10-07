import java.util.Scanner;

public class mftorreverde {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for the time to wake up
        System.out.print("What time do you want to wake up (in 24-hour format)? ");
        int wakeUpTime = scanner.nextInt();

        // Perform the daily routine
        System.out.println("~ Woke up at " + wakeUpTime + ":00 AM.");
        int snoozeCount = promptSnooze(scanner); // prompt user for the Alarm snooze
        System.out.print("How many glasses of cold water will you drink? ");
        int waterGlasses = promptWaterGlasses(scanner); // Drink cold water
        meditate(); // Meditate (for at least 10 minutes)
        organizeToDoList(); // Organize your thoughts and to-dos for todeys bidyow
        int exerciseRepetitions = promptExerciseRepetitions(scanner);
        exercise(exerciseRepetitions); // Exercise or free time
        bathAndSkincareRoutine("Morning Routine"); // Bath and skincare routine for AM
        System.out.print("*BREAKFAST* ");
        prepareMeal(scanner); //Breakfast
        checkPhone(scanner); // Check emails/ messages/ social media
        System.out.print("*LUNCH* ");
        prepareMeal(scanner);// Lunch

        FreeTime(); // Study/ house errands/ jogging/ exercise (free time)
        recreationalActivity(scanner); // Recreational activity
        checkPhone(scanner); // Check emails/ messages/ social media
        System.out.print("*DINNER* ");
        prepareMeal(scanner);// Dinner
        FreeTime(); // Study/ house errands/ jogging/ exercise (free time)
        bathAndSkincareRoutine("Evening Routine"); // Bath and skincare routine for PM
        meditate(); // Meditate (for at least 10 minutes)
        GoodNightSleep(scanner); //Sleep

        System.out.println("My Daily Routine by MARIANE TORREVERDE BSCS 2-A");
        scanner.close();
    }

    public static int promptSnooze(Scanner scanner) {
        int snoozeCount = 0;
        while (snoozeCount < 3) {
            System.out.print("(Snooze #" + (snoozeCount + 1) + ")" + " Turn off the alarm? (y/n): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("y")) {
                System.out.println("Good Morning!");
                break;
            }
            snoozeCount++;
            System.out.println("Alarm Snoozed for 10 minutes");
        }
        return snoozeCount;
    }

    public static int promptWaterGlasses(Scanner scanner) {
        int waterGlasses = scanner.nextInt();
        System.out.println("~ You drank " + waterGlasses + " glass(es) of cold water");

        return (0);
    }

    public static void meditate() {
        System.out.println("~ Meditated for 10 minutes.");
    }

    public static void organizeToDoList() {
        System.out.println("~ Organized your to-do list.");
    }

    public static int promptExerciseRepetitions(Scanner scanner) {
        System.out.print("*EXERCISE* How many set(s) will you do for today? ");
        return scanner.nextInt();
    }

    public static void exercise(int repetitions) {
        if (repetitions == 0) {
            System.out.println("Today's a Cheat Day then!");
        } else {
            System.out.println("~ Exercise for 30 minutes (repetitions: " + repetitions + " sets)");
        }
    }

    public static void bathAndSkincareRoutine(String timeOfDay) {
        System.out.println("~ Took a bath and did skincare routine for " + timeOfDay + ".");
    }

    public static void prepareMeal(Scanner scanner) { // Check the user's response to prepare a meal
        System.out.print("Do you want to prepare a meal (y/n)? ");
        String response = scanner.next();
        if (response.equalsIgnoreCase("y")) {
            eatMeal();
        } else {
            System.out.println("~ You chose not to prepare a meal.");
        }
    }

    public static void eatMeal() {
        System.out.println("~ Ate and left no crumbs");
    }

    public static void checkPhone(Scanner scanner) {
        System.out.print("Do you want to check your emails, messages, and surf social media (y/n)? ");
        String response = scanner.next();
        if (response.equalsIgnoreCase("y")) {
            System.out.println("~ All updated!");
        } else {
            System.out.println("~ Aight. You're free for today.");
        }
    }


    public static void FreeTime() {
        System.out.println("*FREE TIME* Go study, do house errands,or go jogging. Do whatever makes you happy :)");
    }

    public static void recreationalActivity(Scanner scanner) {
        System.out.print("What recreational activity would you like to do today? " +
                "(1) Paint, (2) Bake, or (3) Read books :");
        String response = scanner.next();

        if (response.equals("1")) {
            System.out.println("~ Painted something. Da Vinci who?");
        } else if (response.equals("2")) {
            System.out.println("~ Baked some cookies. I'm a Masterchef na lmao");
        } else if (response.equals("3")) {
            System.out.println("~ Read 10 pages of Agatha Christie book. I'm feeling a bit detective rn");
        } else {
            System.out.println("~ Please, go touch some grass or a field or a whole forest.");
        }
    }


    public static void GoodNightSleep(Scanner scanner) {
        System.out.println("It's getting pretty late. Do you want to sleep na? (y/n)");
        String response = scanner.next();
        if (response.equalsIgnoreCase("y")) {
            System.out.println("~ Good night. Sleep tight, my love.");
        } else {
            System.out.println("~ Go to sleep na or else.");
        }
    }
}


