import java.util.Scanner;

public class JMCarado {

    public static void showToDo(String[] myArray) {
        int i = 1;
        for (String todo : myArray) {
            System.out.println(i + ". " + todo);
            i++;
        }
    }

    public static boolean eat(String meal) {
        System.out.println("You are eating with " + meal + " as a meal.");
        return true;
    }

    public static boolean shower(String soap, String shampoo) {
        System.out.println("You are currently in the shower.");
        System.out.println("You are using " + soap + " as your soap.");
        System.out.println("You are using " + shampoo + " as your shampoo.");
        return true;
    }

    public static boolean exercise(int sets) {
        System.out.println("You are currently exercising.");
        System.out.println("You are now done with " + sets + " sets of exercises.");
        return true;
    }

    public static boolean nap(int minutes) {
        System.out.println("You are about to take a nap.");
        System.out.println("You have now woken up after " + minutes + " minutes of napping");
        return true;
    }

    public static boolean code(int hours, String language) {
        System.out.println("You are about to code");
        System.out.println("You have now finished coding for " + hours + " hours with " + language + ".");
        return true;
    }

    public static boolean game(int hours, String game) {
        System.out.println("You are about to play a game");
        System.out.println("You have now finished gaming for " + hours + " hours with " + game + ".");
        return true;
    }

    public static boolean halfbath(int minutes) {
        System.out.println("You are about to take a half bath.");
        System.out.println("You have now finished your half bath for " + minutes + " minutes.");
        return true;
    }

    public static boolean brushteeth(String toothpaste) {
        System.out.println("You are about to brush your teeth");
        System.out.println("You have now finished brushing your teeth with " + toothpaste + " as your toothpaste.");
        return true;
    }

    public static void morning() {
        Scanner input = new Scanner(System.in);
        String[] MorningtoDo = { "Breakfast", "Shower", "Exercise" };

        boolean mtd1 = false;
        boolean mtd2 = false;
        boolean mtd3 = false;

        while (!(mtd1 && mtd2 && mtd3)) {
            System.out.println("\nMorning Routine To Do");
            showToDo(MorningtoDo);
            System.out.println("Input less than 0 to skip morning routine");
            System.out.print("\nChoice: ");
            int choice = input.nextInt();
            input.nextLine(); // Consume the newline character

            if (choice <= 0) {
                return;
            }

            switch (choice) {
                case 1:
                    if (mtd1) {
                        System.out.println("You have already done breakfast!\nGoing Back.");
                        continue;
                    }
                    System.out.print("Input your meal choice: ");
                    String meal = input.nextLine();
                    mtd1 = eat(meal);
                    break;

                case 2:
                    if (mtd2) {
                        System.out.println("You have already done shower!\nGoing Back.");
                        continue;
                    }
                    System.out.print("Input your soap choice: ");
                    String soap = input.nextLine();

                    System.out.print("Input your shampoo choice: ");
                    String shampoo = input.nextLine();
                    mtd2 = shower(soap, shampoo);
                    break;

                case 3:
                    if (mtd3) {
                        System.out.println("You have already done exercise!\nGoing Back.");
                        continue;
                    }
                    System.out.print("Input number of sets: ");
                    int sets = input.nextInt();
                    input.nextLine(); // Consume the newline character
                    mtd3 = exercise(sets);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    showToDo(MorningtoDo);
                    break;
            }

        }
    }

    public static void afternoon() {
        Scanner input = new Scanner(System.in);
        String[] todo = { "Eat Lunch", "Take a nap", "Code", "Play Games" };

        boolean mtd1 = false;
        boolean mtd2 = false;
        boolean mtd3 = false;
        boolean mtd4 = false;

        while (!(mtd1 && mtd2 && mtd3 && mtd4)) {
            System.out.println("\nAfternoon Routine To Do");
            showToDo(todo);
            System.out.println("Input less than 0 to skip afternoon routine");
            System.out.print("\nChoice: ");
            int choice = input.nextInt();
            input.nextLine(); // Consume the newline character

            if (choice <= 0) {
                input.close();
                return;
            }

            switch (choice) {
                case 1:
                    if (mtd1) {
                        System.out.println("You already had lunch!\nGoing Back.");
                        continue;
                    }
                    System.out.print("Input your meal choice: ");
                    String meal = input.nextLine();
                    mtd1 = eat(meal);
                    break;

                case 2:
                    if (mtd2) {
                        System.out.println("You have already taken a nap!\nGoing Back.");
                        continue;
                    }
                    System.out.print("Input your nap duration: ");
                    int minutes = input.nextInt();
                    mtd2 = nap(minutes);
                    break;

                case 3:
                    if (mtd3) {
                        System.out.println("You have already done coding!\nGoing Back.");
                        continue;
                    }
                    System.out.print("Input number of hours: ");
                    int hours = input.nextInt();
                    input.nextLine();
                    System.out.print("Input language: ");
                    String language = input.nextLine();
                    mtd3 = code(hours, language);
                    break;

                case 4:
                    if (mtd4) {
                        System.out.println("You already played games!\nGoing Back.");
                        continue;
                    }
                    System.out.print("Input number of hours: ");
                    int hours_g = input.nextInt();

                    // Consume the newline character
                    input.nextLine();

                    System.out.print("Input game of choice: ");
                    String game = input.nextLine();
                    mtd4 = game(hours_g, game);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    showToDo(todo);
                    break;
            }

        }
    }

    public static void evening() {
        Scanner input = new Scanner(System.in);
        String[] todo = { "Dinner", "Half Bath", "Brush Teeth" };

        boolean mtd1 = false;
        boolean mtd2 = false;
        boolean mtd3 = false;

        while (!(mtd1 && mtd2 && mtd3)) {
            System.out.println("\nEvening Routine To Do");
            showToDo(todo);
            System.out.println("Input less than 0 to skip evening routine");
            System.out.print("\nChoice: ");
            int choice = input.nextInt();
            input.nextLine(); // Consume the newline character

            if (choice <= 0) {
                return;
            }

            switch (choice) {
                case 1:
                    if (mtd1) {
                        System.out.println("You already had Dinner!\nGoing Back.");
                        continue;
                    }
                    System.out.print("Input your meal choice: ");
                    String meal = input.nextLine();
                    mtd1 = eat(meal);
                    break;

                case 2:
                    if (mtd2) {
                        System.out.println("You have already taken a half bath!\nGoing Back.");
                        continue;
                    }
                    System.out.print("Input your half bath duration: ");
                    int minutes = input.nextInt();
                    mtd2 = halfbath(minutes);
                    break;

                case 3:
                    if (mtd3) {
                        System.out.println("You have already done brushing your teeth!\nGoing Back.");
                        continue;
                    }
                    System.out.print("Input choice of toothpaste: ");
                    String toothpaste = input.nextLine();
                    mtd3 = brushteeth(toothpaste);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    showToDo(todo);
                    break;
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("Today is Saturday! Ready?");
        morning();
        afternoon();
        evening();
        System.out.println("You have now finished your Saturday! Hope you had a great day!");
    }

}
