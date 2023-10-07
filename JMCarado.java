import java.util.Scanner;

public class JMCarado {

    public static void showToDo(String[] myArray) {
        int i = 1;
        System.out.println("==========================================");
        for (String todo : myArray) {
            System.out.println(i + ". " + todo);
            i++;
        }
        System.out.println("==========================================");
    }

    public static boolean eat(String meal) {
        System.out.println("\n == == You are eating with " + meal + " as a meal.");

        try {
            Thread.sleep(500);
            for (int i = 0; i <= 2; i++) {
                System.out.println(" == == Eating...");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            // Handle interrupted exception (e.g., log or rethrow)
            Thread.currentThread().interrupt(); // Restore the interrupted status
        }

        System.out.println(" == == Done eating!");
        return true;
    }

    public static boolean shower(String soap, String shampoo) {
        System.out.println("\n == == You are currently in the shower.");

        try {
            System.out.println(" == == You are using " + soap + " as your soap.");
            Thread.sleep(1500);
            System.out.println(" == == You are using " + shampoo + " as your shampoo.");
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            // Handle interrupted exception (e.g., log or rethrow)
            Thread.currentThread().interrupt(); // Restore the interrupted status
        }

        return true;
    }

    public static boolean exercise(int sets) {
        System.out.println();
        try {

            for (int set = 1; set <= sets; set++) {
                System.out.println(" == == You are currently exercising @ Set " + set + ". ");
                Thread.sleep(200);
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(" == == You are now done with " + sets + " sets of exercises.");
        return true;
    }

    public static boolean nap(int minutes) {
        System.out.println("\n == == You are about to take a nap.");

        try {
            for (int i = 0; i < minutes; i++) {
                System.out.println(" == == Napping...");
                Thread.sleep(600);
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(" == == You have now woken up after " + minutes + " minutes of napping");
        return true;
    }

    public static boolean code(int hours, String language) {
        System.out.println("\n == == You are about to code");

        try {

            for (int i = 1; i <= hours; i++) {
                System.out
                        .println(" == == You have been coding with " + language + " language for " + i
                                + " hour(s) now.");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupted status
        }

        System.out.println(" == == You have now finished coding for " + hours + " hours with " + language + ".");
        return true;
    }

    public static boolean game(int hours, String game) {
        System.out.println("\n == == You are about to play a game");

        try {
            for (int i = 1; i <= hours; i++) {
                System.out
                        .println(" == == You have been playing with " + game + " game for " + i
                                + " hour(s) now.");
                Thread.sleep(600);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupted status
        }

        System.out.println(" == == You have now finished gaming for " + hours + " hours with " + game + ".");
        return true;
    }

    public static boolean halfbath(int minutes) {
        System.out.println("\n == == You are about to take a half bath.");

        try {
            for (int i = 1; i <= minutes; i++) {
                System.out.println(" == == Half Bathing...");
                Thread.sleep(600);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupted status
        }

        System.out.println(" == == You have now finished your half bath for " + minutes + " minutes.");
        return true;
    }

    public static boolean brushteeth(String toothpaste) {
        System.out.println("\n == == You are about to brush your teeth");

        try {
            for (int i = 0; i <= 2; i++) {
                System.out.println(" == == Brushing...");
                Thread.sleep(600);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupted status
        }

        System.out.println(
                " == == You have now finished brushing your teeth with " + toothpaste + " as your toothpaste.");
        return true;
    }

    public static boolean morning(Scanner inputInt, Scanner inputStr) {
        String[] MorningtoDo = { "Breakfast", "Shower", "Exercise" };

        boolean mtd1 = false;
        boolean mtd2 = false;
        boolean mtd3 = false;

        while (!(mtd1 && mtd2 && mtd3)) {
            System.out.println("\nMORNING ROUTINE");
            showToDo(MorningtoDo);
            System.out.println("0 to skip morning routine");
            System.out.println("==========================================");
            System.out.print("\n == Choice: ");

            int choice = inputInt.nextInt();

            if (choice == 0) {
                return false;
            }

            switch (choice) {
                case 1:
                    if (mtd1) {
                        System.out.println(" == You have already done breakfast!\n == Going Back.");
                        continue;
                    }
                    System.out.print(" == Input your meal choice: ");
                    String meal = inputStr.nextLine();
                    mtd1 = eat(meal);
                    break;

                case 2:
                    if (mtd2) {
                        System.out.println(" == You have already done shower!\n == Going Back.");
                        continue;
                    }
                    System.out.print(" == Input your soap choice: ");
                    String soap = inputStr.nextLine();

                    System.out.print(" == Input your shampoo choice: ");
                    String shampoo = inputStr.nextLine();
                    mtd2 = shower(soap, shampoo);
                    break;

                case 3:
                    if (mtd3) {
                        System.out.println(" == You have already done exercise!\n == Going Back.");
                        continue;
                    }
                    System.out.print(" == Input number of sets: ");
                    int sets = inputInt.nextInt();
                    mtd3 = exercise(sets);
                    break;

                default:
                    System.out.println(" == Invalid choice. Please select a valid option.");
                    showToDo(MorningtoDo);
                    break;
            }

        }

        return true;
    }

    public static boolean afternoon(Scanner inputInt, Scanner inputStr) {
        String[] todo = { "Eat Lunch", "Take a nap", "Code", "Play Games" };

        boolean mtd1 = false;
        boolean mtd2 = false;
        boolean mtd3 = false;
        boolean mtd4 = false;

        while (!(mtd1 && mtd2 && mtd3 && mtd4)) {
            System.out.println("\nAFTERNOON ROUTINE");
            showToDo(todo);
            System.out.println("Input 0 to skip afternoon routine");
            System.out.println("==========================================");
            System.out.print("\n == Choice: ");
            int choice = inputInt.nextInt();

            if (choice == 0) {
                return false;
            }

            switch (choice) {
                case 1:
                    if (mtd1) {
                        System.out.println(" == You already had lunch!\n == Going Back.");
                        continue;
                    }
                    System.out.print(" == Input your meal choice: ");
                    String meal = inputStr.nextLine();
                    mtd1 = eat(meal);
                    break;

                case 2:
                    if (mtd2) {
                        System.out.println(" == You have already taken a nap!\n == Going Back.");
                        continue;
                    }
                    System.out.print(" == Input your nap duration: ");
                    int minutes = inputInt.nextInt();
                    mtd2 = nap(minutes);
                    break;

                case 3:
                    if (mtd3) {
                        System.out.println(" == You have already done coding!\n == Going Back.");
                        continue;
                    }
                    System.out.print(" == Input number of hours: ");
                    int hours = inputInt.nextInt();
                    System.out.print(" == Input language: ");
                    String language = inputStr.nextLine();
                    mtd3 = code(hours, language);
                    break;

                case 4:
                    if (mtd4) {
                        System.out.println(" == You already played games!\n == Going Back.");
                        continue;
                    }
                    System.out.print(" == Input number of hours: ");
                    int hours_g = inputInt.nextInt();

                    System.out.print(" == Input game of choice: ");
                    String game = inputStr.nextLine();
                    mtd4 = game(hours_g, game);
                    break;

                default:
                    System.out.println(" == Invalid choice. Please select a valid option.");
                    showToDo(todo);
                    break;
            }
        }
        return true;

    }

    public static boolean evening(Scanner inputInt, Scanner inputStr) {
        String[] todo = { "Dinner", "Half Bath", "Brush Teeth" };

        boolean mtd1 = false;
        boolean mtd2 = false;
        boolean mtd3 = false;

        while (!(mtd1 && mtd2 && mtd3)) {
            System.out.println("\nEVENING ROUTINE");
            showToDo(todo);
            System.out.println("Input 0 to skip evening routine");
            System.out.println("==========================================");
            System.out.print("\nChoice: ");
            int choice = inputInt.nextInt();

            if (choice == 0) {
                return false;
            }

            switch (choice) {
                case 1:
                    if (mtd1) {
                        System.out.println(" == You already had Dinner!\n == Going Back.");
                        continue;
                    }
                    System.out.print(" == Input your meal choice: ");
                    String meal = inputStr.nextLine();
                    mtd1 = eat(meal);
                    break;

                case 2:
                    if (mtd2) {
                        System.out.println(" == You have already taken a half bath!\nGoing Back.");
                        continue;
                    }
                    System.out.print(" == Input your half bath duration: ");
                    int minutes = inputInt.nextInt();
                    mtd2 = halfbath(minutes);
                    break;

                case 3:
                    if (mtd3) {
                        System.out.println(" == You have already done brushing your teeth!\nGoing Back.");
                        continue;
                    }
                    System.out.print(" == Input choice of toothpaste: ");
                    String toothpaste = inputStr.nextLine();
                    mtd3 = brushteeth(toothpaste);
                    break;

                default:
                    System.out.println(" == Invalid choice. Please select a valid option.");
                    showToDo(todo);
                    break;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Today is Saturday! Ready?");
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);

        boolean morn = morning(inputInt, inputStr);

        if (morn) {
            System.out.println("\n == YOU HAVE NOW PASSED THE MORNING ROUTINE, CONTINUING TO AFTERNOON ROUTINES ==");
        }

        boolean af = afternoon(inputInt, inputStr);
        if (af) {
            System.out.println("\n == YOU HAVE NOW PASSED THE AFTERNOON ROUTINE, CONTINUING TO EVENING ROUTINES == ");
        }

        evening(inputInt, inputStr);
        System.out.println("\n == You have now finished your Saturday! Hope you had a great day!");
        inputInt.close();
        inputStr.close();

    }

}
