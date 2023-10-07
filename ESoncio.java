import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.ServiceInformationHolder;

public class ESoncio {
    public static void main(String[] args) {
        Start: {
            Scanner input = new Scanner(System.in);
            System.out.println("What is your name? ");
            String name = input.nextLine();
            System.out.println("Your name is " + name);

            System.out.println("Please Confirm (1 = Yes, 0 = No)");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("You will start your journey");
                Morning(name, input);
            } else if (choice == 0) {
                System.out.println("You May Try Again");
                break Start;
            } else {
                System.out.println("You have entered an invalid number, system will shut down.");
            }
        }
    }

    public static void Morning(String name, Scanner input) {
        System.out.println(name + " Woke Up!");
        System.out.println("What would you like to do? (1 = Go to Bathroom, 2 = Go to Kitchen)");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println(name + " is now in the bathroom");
            System.out.println(" Choose what to do next (1 = Wash Face, 2 = Take a Bath, 3 = Brush Teeth)");
            int choice2 = input.nextInt();
            if (choice2 == 1) {
                System.out.println(name + " Washed his face");
                Morning(name, input);
            } else if (choice2 == 2) {
                System.out.println(name + " Took a Bath");
                Morning(name, input);
            } else if (choice2 == 3) {
                System.out.println(name + " Brushed his teeth");
                Morning(name, input);
            } else {
                System.out.println(" You have entered an invalid number, Please Try Again");
                Morning(name, input);
            }

        } else if (choice == 2) {
            System.out.println(name + " Went downstairs");
            System.out.println(" Choose what to eat for breakfast (1 = Sandwich, 2 = Cereal, 3 = Rice Meal)");
            int choice2 = input.nextInt();
            if (choice2 == 1) {
                System.out.println(" You ate breakfast and you are now ready to go to school.");
                School(name, input);
            } else if (choice2 == 2) {
                System.out.println(" You ate breakfast and you are now ready to go to school.");
                School(name, input);
            } else if (choice2 == 3) {
                System.out.println(" You ate breakfast and you are now ready to go to school.");
                School(name, input);
            } else {
                System.out.println(" You have entered an invalid number, Please Try Again");
                Morning(name, input);
            }
        }
    }

    public static void School(String name, Scanner input) {
        System.out.println(" You have arrived at school with 30 mins left to spare, what do you want to do");
        System.out.println(" (1 = Study at the library, 2 = Hangout with friends, 3 = Buy food at coop)");
        int choice2 = input.nextInt();
        if (choice2 == 1) {
            System.out.println(" You Went to the library.");
            System.out.println(" You reviewed your previous lessons and made some notes");
            Class();
        } else if (choice2 == 2) {
            System.out.println(" You met your friends at your usual hangout spot in the shed");
            System.out.println(" You did some chika chika and went to class together");
            Class();
        } else if (choice2 == 3) {
            System.out.println(" You were hungry so you decided to buy fried siomai and coke for breakfast");
            Class();
        } else {
            System.out.println(" You have entered an invalid number, Please Try Again");
            School(name, input);
        }
    }

    public static void Class() {
        System.out.println("Time caught up to you and you decided to head to class.");
        System.out.println("You listened and participated in some of your classes");
        System.out.println("Although you tried so hard to listen, you can't help but fall asleep");
        System.out.println("You wake up and class is over.");
        Home();
    }

    public static void Home() {
        System.out.println("At home, you spent most of the time playing any games your friends invite you to");
        System.out.println("After a tiring day, you take a well deserved rest and start a new day again tomorrow.");
    }
}