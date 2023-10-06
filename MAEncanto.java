//DAILY ROUTINE ACTIVITIES PROGRAM USING METHODS WITH PARAMETERS
//MARK ANDREI ENCANTO BSCS 2A

// this program uses methods to allow user to simulate MAEncanto's Life and summarizes all the activities
import java.util.Scanner;

public class MAEncanto {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // allows input
        //PRELIMINARIES
        System.out.println("Welcome to MAEncanto's Daily Routine, in this routine, you will be the one to simulate his routines.");
        System.out.println("________________________________________________________________________");
        System.out.print("What time will you wake up? [FORMAT: 03:23 AM | HH:MM AM/PM] ");
        String time = input.nextLine();
        System.out.println("Woke up at " + time);
        System.out.println("________________________________________________________________________");
        System.out.println("In this portion, You will simulate MAEncanto's life thoroughly by choosing his tasks.\n");

        boolean exit = false; //initialized exit to false for the loop to work

        //MENU BOX//
        while (!exit) { //loops until exit is located
        System.out.println("________________________________________________________________________");
        System.out.println("_\t\t\t TASKS FOR TODAY \t\t\t       _");
        System.out.println("________________________________________________________________________");
        System.out.println("\t1. Take a Bath");
        System.out.println("\t2. Eat Meal");
        System.out.println("\t3. Feed Pets");
        System.out.println("\t4. Do Schoolworks / Backlogs");
        System.out.println("\t5. Play Games");
        System.out.println("\t6. Do a Household Chore");
        System.out.println("\t7. Make Gala");
        System.out.println("\t8. Good Night's Sleep");
        System.out.println("________________________________________________________________________");
        System.out.print("Choice: ");
        int choice = input.nextInt(); // Read the user's choice
        menu(choice, input); // Pass choice and the Scanner to the menu method
    }
}



    // MENU FUNCTION
    public static void menu(int choice, Scanner input) 
    {
        switch(choice)
        {
            case 1: // TAKING A BATH
                takingBath(input); // function calls and executes takingBath method
                break;
            
            case 2: // EATING MEALS
                eatMeal(input); // function calls and executes eatMeal method
                break;

            case 3: // FEEDING PETS
                feedPets(input); // function calls and executes feedPets method
                break;

            case 4: //BACKLOGS
                doingBacklogs(input); // function calls and executes doingBacklogs method
                break;

            case 5:// PLAYING GAMES
                playingGames(input); // function calls and executes playingGames method
                break;

            case 6: // HOUSEHOLD CHORE 
                doingChores(input); // function calls and executes doingChores method
                break;

            case 7: //ROAMING AROUND
                roamingAround(input); // function calls and executes roaming around
                break;
            default:
                System.out.println("GOOD NIGHT! SEE YOU TOMORROW!");
                System.exit(0); // exit
        }
    }

    // TAKING A BATH FUNCTION
    public static void takingBath(Scanner input){
        System.out.print("How much time will it take you to take a bath? [In minutes] "); // prompts user to input bathDuration
        int bathDuration = input.nextInt(); // input bath duration
        System.out.print("What shampoo will your use? [Sunsilk, Palmolive] [NO SPACE] "); // [prompts user to input bath details]
        String bathShampoo = input.next(); // shampoo input
        System.out.print("What soap will you use? [Johnson's, Olay, Dove] [NO SPACE] "); // [prompts user to input bath details]
        String bathSoap = input.next(); // soap input

        System.out.println("--------------------------------------");
        System.out.println("\tBATHING SUMMARY"); // title to print information acquired
        System.out.println("--------------------------------------");
        System.out.println("Bathing Duration: " + bathDuration + "minutes");
        System.out.println("Bathing Shampoo: " + bathShampoo);
        System.out.println("Bathing Soap: " + bathSoap);
    }


    //EATING MEAL FUNCTION
    public static void eatMeal(Scanner input){
        System.out.print("How much will it take you to eat? [In Minutes] "); // prompts user to input eatingDuration
        int eatingDuration = input.nextInt(); // input eating duration
        System.out.print("What will main course will you eat? [NO SPACE] "); // [prompts user to input main course]
        String eatingMainCourse = input.next(); // main course input
        System.out.print("What will be the dessert? [NO SPACE] "); // [prompts user to input dessert]
        String eatingDessert = input.next(); // dessert input

        System.out.println("--------------------------------------");
        System.out.println("\tMEAL SUMMARY"); // title to print information acquired
        System.out.println("--------------------------------------");
        System.out.println("Eating Duration: " + eatingDuration + "minutes");
        System.out.println("Main Course: " + eatingMainCourse);
        System.out.println("Dessert: " + eatingDessert);
    }


    // FEEDING PETS FUNCTION
    public static void feedPets(Scanner input){
        System.out.print("What pet to feed? [Select One (1)] [NO SPACE] "); // [prompts user to input pet Type]
        String petType = input.next(); // main course input
        System.out.print("How much will it take you to feed your pet? [In Minutes]  "); // prompts user to input feedingDuration
        int feedingDuration = 0; // initialized to zero incase not chosen by the user for the computation of total time spent.
        feedingDuration = input.nextInt(); // input feeding duration

        System.out.println("--------------------------------------");
        System.out.println("\tFEEDING SUMMARY"); // title to print information acquired
        System.out.println("--------------------------------------");
        System.out.println("Feeding Duration: " + feedingDuration + "minutes");
        System.out.println("Pet Type: " + petType);
    }


    // DOING BACKLOGS FUNCTION
      public static void doingBacklogs(Scanner input){
        System.out.print("How many tasks do you have to finish "); // [prompts user to input number of tasks left]
        String tasksNum = input.next(); // input number of tasks left
        System.out.print("How much will it take you to finsih all of the tasks? [In Minutes] "); // prompts user to input finishingTasksDuration
        int finishingTasksDuration = input.nextInt(); // input finishing duration

        System.out.println("--------------------------------------");
        System.out.println("\tFINISHING TASKS SUMMARY"); // title to print information acquired
        System.out.println("--------------------------------------");
        System.out.println("Number of Tasks: " + tasksNum);
        System.out.println("Doing Backlogs Duration: " + finishingTasksDuration + "minutes");

    }

    
    // PLAYING GAMES FUNCTION
    public static void playingGames(Scanner input){
        System.out.print("What game to play? [Select one (1)] [NO SPACE] "); // [prompts user to input game to play]
        String gamePlayed = input.next(); // input the game of choice
        System.out.print("How long will you play? [In Minutes] "); // prompts user to input gameDuration
        int gameDuration = input.nextInt(); // input gameDuration

        System.out.println("--------------------------------------");
        System.out.println("\tPLAYING SUMMARY"); // title to print information acquired
        System.out.println("--------------------------------------");
        System.out.println("Game Played: " + gamePlayed);
        System.out.println("Playing Game Duration: " + gameDuration + "minutes");

    }


    //DOING HOUSEHOLD CHORES FUNCTION
    public static void doingChores(Scanner input){
        System.out.print("Choose a chore: [Wash Dishes, Sweep Floors, Wipe Windows] [NO SPACE] "); // [prompts user to input chore to do]
        String choreChosen = input.next(); // input the chore of choice
        System.out.print("How long will it take to finish the chore? [In Minutes] "); // prompts user to input choreDuration
        int choreDuration = input.nextInt(); // input choreDuration

        System.out.println("--------------------------------------");
        System.out.println("\tCLEANING SUMMARY"); // title to print information acquired
        System.out.println("--------------------------------------");
        System.out.println("Household Chore: " + choreChosen);
        System.out.println("Cleaning Duration: " + choreDuration + "minutes");

    }


    // ROAMING AROUND THE PLACE FUNCTION
    public static void roamingAround(Scanner input){
        System.out.print("Choose a desitination: [NO SPACE] "); // [prompts user to input destination]
        String destinationChosen = input.next(); // input the destination of choice
        System.out.print("How much time will you spend on roaming? [In Minutes] "); // prompts user to input roamingDuration
        int roamingDuration = input.nextInt(); // input roamingDuration

        System.out.println("--------------------------------------");
        System.out.println("\tPLAYING SUMMARY"); // title to print information acquired
        System.out.println("--------------------------------------");
        System.out.println("Destination: " + destinationChosen);
        System.out.println("Roaming Duration: " + roamingDuration + "minutes");

    }
}