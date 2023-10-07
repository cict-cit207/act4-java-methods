//Activity 4 in OOP
//This java program outputs my daily routine

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class MMBergancia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //for inputs
        int positiveFeedbacks = 0;  //counts the number of positive feedbacks from the user
        boolean isWeekday = RandomGenerator.getDefault().nextBoolean();        //true if day is a weekday
        boolean isAwakeAtFive = RandomGenerator.getDefault().nextBoolean();    //true if is awake at five AM
        boolean inGoodMood = RandomGenerator.getDefault().nextBoolean();       //true if I'm in a good mood

        boolean isOnlineClass = (isWeekday == true) ? RandomGenerator.getDefault().nextBoolean() : false;    //true if class is held online, automatically false if isWeekday ==false

        greetings(sc);

        instructions(isWeekday, isAwakeAtFive, inGoodMood, isOnlineClass, sc);

        wakeUp(sc);

        getCoffee(sc);

        //if awake at five AM in the morning, do workout routine
        if (isAwakeAtFive == true) {
                //Exercise routine - positiveFeedbacks increments by 1 if feedback is positive
                positiveFeedbacks = (workoutRoutine(sc) == 'Y') ? ++positiveFeedbacks : positiveFeedbacks;
                inGoodMood = true;
        }

        else{
            System.out.println("Oh no, I did not have enough time for my exercise");
            System.out.println("I must redeem myself tomorrow.\n");
            inGoodMood = false;
        }

        shower(sc);

        //variable positiveFeedbacks increments when user likes breakfast routine
        positiveFeedbacks = (breakfast(sc) == 'Y') ? ++positiveFeedbacks : positiveFeedbacks;

        //if today is a weekday, attend class
        if (isWeekday == true){
            attendClass(isOnlineClass, sc);
        }
        //otherwise, get entertainment
        else {
            entertainment(sc);
          }

        //variable positiveFeedbacks increments when user likes lunch routine
        positiveFeedbacks =  (lunch(sc) == 'Y') ? ++positiveFeedbacks : positiveFeedbacks;

        goOutside(sc);

        goHome(sc);

        //variable positiveFeedbacks increments when user likes dinner routine
        positiveFeedbacks = (dinner(sc) == 'Y') ? ++positiveFeedbacks : positiveFeedbacks;

        inGoodMood = midnightThoughts(sc);

        //counting positive feedbacks
        getStats(positiveFeedbacks, sc);

        sc.close();

    }

    //method for greeting user
    public static void greetings(Scanner sc){
        System.out.println("\nGreetings, User!");
        System.out.println("My name is Mauricio Manuel F. Bergancia");
        System.out.println("I am a 2nd year computer science major at West Visayas State University (WVSU)\n");
        pressAnyKeyToContinue(sc);
    }

    //method for instructions
    public static void instructions(boolean isWeekday, boolean isAwakeAtFive, boolean inGoodMood, boolean isOnlineClass, Scanner sc){
        System.out.println("This program shows my daily routine.\nMy daily routine is diverse, but this program does its best to show what I do on a daily basis.");
        System.out.println("My daily decisions are made by several factors. My mood, waking up early, classes on " +
                "weekdays, and the modality of class can affect my choices.\n");
        System.out.println("Get to know more about me by reading my daily activities, rating my daily routines, and giving me recommendations!");
        //pause
        System.out.println("The state of the factors that affect my decisions are randomized to enable variety of situations.\n");

        System.out.println("       Current State:");
        System.out.println("====================================");
        System.out.println("In good mood: " + inGoodMood );
        System.out.println("Awake at 5 A.M: " + isAwakeAtFive);
        System.out.println("Today's a weekday: " + isWeekday);
        System.out.println("Online class: " + isOnlineClass);
        System.out.println("=====================================\n");

        pressAnyKeyToContinue(sc);
    }

    //method for waking up
    public static void wakeUp(Scanner sc){
        System.out.println("The first thing that I do everyday is waking up.");
        System.out.println("I mentally prepare myself for the day until I do my next task\n");
        pressAnyKeyToContinue(sc);
    }

    //method for getting coffee
    public static void getCoffee(Scanner sc){
        System.out.println("I start my day with a cup of coffee ☕");
        System.out.println("My favorite is pure black coffee 🖤\n");
        pressAnyKeyToContinue(sc);
    }

    //method for showing my workout routine
    public static char workoutRoutine(Scanner sc){
        System.out.println("Afterwards, I start my workout routine");
        System.out.println("Exercise is good for the mind and body!\nHere is my routine:");

        System.out.println("Time            Duration                    Activity");
        System.out.println("5:00 AM:        15 minutes                  Stretching");
        System.out.println("5:15 AM:        1 hr and 30 minutes         Jogging");
        System.out.println("6:45 AM:        30 minutes                  Arm Exercises");
        System.out.println("7:15 AM:        30 minutes                  Leg Exercises");
        System.out.println("7:45 AM:        15 minutes                  Rest");

        //ask user for feedback
        System.out.print("\nDo you like my exercise routine? (Y/n) ");

        return getFeedback(sc);
    }

    public static char getFeedback(Scanner sc){
        char answer = sc.next().charAt(0);
        int attempts = 0; //stores the number of attempts
        do {
            if (answer == 'Y'){
                System.out.println("Thank you for the positive feedback 💕\n");
                pressAnyKeyToContinue(sc);
                break;
            }
            else if (answer == 'n'){
                System.out.println("Thanks for your honesty 🤍\n");
                pressAnyKeyToContinue(sc);
                break;
            }
            else if (attempts == 2){
                throw new ArithmeticException("Error! Too many attempts"); //error once user exceeds 3 attempts
            }
            else{
                System.out.print("Try again: ");
                answer = sc.next().charAt(0);
            }
            attempts++;
        } while (answer != 'Y' || answer != 'n');

        return answer;
    }

    //method for taking a shower
    public static void shower(Scanner sc){
        System.out.println("I move onto the next activity and prepare myself for shower");
        System.out.println("I start scrubbing and do my best to clean each body part 😎");
        System.out.println("When I'm done showering, I prepare myself for the next activity.\n");
        pressAnyKeyToContinue(sc);
    }

    //method for having breakfast
    public static char breakfast(Scanner sc){
        System.out.println("Breakfast is said to be the most important meal of the day, but I think that every meal is supposed to have the same level of importance");
        System.out.println("Nonetheless, I usually start breakfast after shower.");
        System.out.println("I eat a balanced breakfast and drink plenty of water!");
        System.out.println("\nHere is a list of my usual go-to meals!\n");

        System.out.println("========================");
        System.out.println("- Sinangag");
        System.out.println("- Tapsilog");
        System.out.println("- Tocino");
        System.out.println("- Longganisa");
        System.out.println("- Pandesal");
        System.out.println("========================\n");

        System.out.print("Would you approve my breakfast meal list? (Y/n) ");

        return getFeedback(sc);
    }

    //method for entertainment
    public static void entertainment(Scanner sc){
        System.out.println("Entertainment is next on my list of activities!");
        System.out.println("During this time, I watch movies, play games, or do some other fun activities! 🎮🎬🍿");
        System.out.println("I do this for a few hours. Sometimes, I lose track of time and overdo this activity \n");

        System.out.println("What movies/games will you recommend me?");
        String recommendation = sc.nextLine();
        System.out.println("Great choice! I will look that up!\n");
        pressAnyKeyToContinue(sc);
    }

    //method for having lunch
    public static char lunch(Scanner sc){
        System.out.println("The next thing to do will be lunch.");
        System.out.println("I eat a balanced and healthy meal that will allow me to continue pushing on for the day!");
        System.out.println("Here are some of my daily lunch dishes:\n");

        System.out.println("==============================================");
        System.out.println("- Adobo");
        System.out.println("- Sinigang");
        System.out.println("- Ala King");
        System.out.println("- Kare kare");
        System.out.println("- Pancit");
        System.out.println("==============================================");

        System.out.print("\nDo you like my go-to lunch meals? (Y/n) ");
        return getFeedback(sc);
    }

    //method for attending class
    public static void attendClass(boolean isOnlineClass, Scanner sc){
        System.out.println("Attending classes is a must!");
        System.out.println("I try to give my full attention whenever we have a learning session.");
        if (isOnlineClass == true){
            System.out.println("I prepare my phone and laptop and wait for the lecture to begin.");
        }
        else{
            System.out.println("My classmates and I prepare for class in the classroom.");
        }
        System.out.println("After class, I proceed to the next activiy!\n");
        pressAnyKeyToContinue(sc);
    }

    //method for going outside
    public static void goOutside(Scanner sc){
        System.out.println("Going outside in the afternoon and enjoying some fresh air is one of the activities I look up to every day.");
        System.out.println("I play with my dogs, watch the greenery, and get some motivation for continuing my daily tasks and achieving my goals in life.\n");
        pressAnyKeyToContinue(sc);
    }

    //method for going Home
    public static void goHome(Scanner sc){
        System.out.println("After doing all the tiring tasks all day, I finally go back to my home or my boarding house.");
        System.out.println("I rest for a while in my bed and prepare for the final sets of activities to be done.\n");
        pressAnyKeyToContinue(sc);
    }

    //method for having dinner
    public static char dinner(Scanner sc){
        System.out.println("The next course of action would be dinner!");
        System.out.println("I take light meals for easy digesting");
        System.out.println("Here are some of my favorite dinner dishes:\n");

        System.out.println("==============================================");
        System.out.println("- Tinola");
        System.out.println("- Sinugbang isda");
        System.out.println("- Barbeque");
        System.out.println("- Pritong isda");
        System.out.println("- Gulay");
        System.out.println("==============================================\n");

        System.out.print("Do you like my dinner dishes? (Y/n) ");
        return getFeedback(sc);
    }

    //method for midnight thinking
    public static boolean midnightThoughts(Scanner sc){
        System.out.println("After doing all the tasks, I reflect on the events that happened on the day.");
        System.out.println("These thoughts of mine vary, and their effect to my overall mood is very influential.");
        System.out.println("There are times that I become very sad because of them, but I also become very happy and uplifted when I think of the beautiful and fun moments.");
        System.out.println("Because of that, I think of this task as an action that has a very unpredictable aftereffect to my everyday life.\n");
        pressAnyKeyToContinue(sc);
        //since this method is unpredictable, returning a random boolean is reasonable mwehehe
        return RandomGenerator.getDefault().nextBoolean();
    }

    //method for stats of user
    public static void getStats(int positiveFeedbacks, Scanner sc){
        System.out.println("==============================================");
        System.out.println("Total no. of positive feedbacks: " + positiveFeedbacks);
        System.out.println("Statistics: " + ((float) positiveFeedbacks / 3)*100 + "%");
        switch (positiveFeedbacks){
            case 0:
                System.out.println("Thank you for being honest! It takes great courage to voice out friendly criticism!");
                pressAnyKeyToContinue(sc);
                break;
            case 1:
                System.out.println("We may not get along that well, but I'm glad we have something in common!");
                pressAnyKeyToContinue(sc);
                break;
            case 2:
                System.out.println("We should be friends ❤️");
                pressAnyKeyToContinue(sc);
                break;
            case 3:
                System.out.println("Slay po labyu po baby baby you're my sun and moon 💓💓💓");
                pressAnyKeyToContinue(sc);
                break;
            default:
                throw new ArithmeticException("Invalid amount!");
        }
    }

    //method for pausing
    public static void pressAnyKeyToContinue(Scanner sc)
    {
        System.out.println("Press any key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }
}
