//Activity 4 in OOP
//This java program outputs my daily routine

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class MMBergancia {

    public static void main(String[] args) {

        //boolean variables are set to random for variety
        Scanner sc = new Scanner(System.in); //for inputs
        int positiveFeedbacks = 0;  //counts the number of positive feedbacks from the user
        boolean isWeekday = RandomGenerator.getDefault().nextBoolean();          //true if day is a weekday
        boolean isAwakeAtFive = RandomGenerator.getDefault().nextBoolean();      //true if is awake at five AM
        boolean inGoodMood = RandomGenerator.getDefault().nextBoolean();         //true if I'm in a good mood
        boolean isOnlineClass = RandomGenerator.getDefault().nextBoolean();      //true if class is held online

        //greeting the user
        greetings();

        //waking up
        wakeUp();

        //getting coffee
        getCoffee();

        //if awake at five AM in the morning, do workout session
        if (isAwakeAtFive == true) {
                //Exercise routine
                //positiveFeedbacks increments by 1 if feedback is positive
                positiveFeedbacks = (workoutRoutine(sc) == 'Y') ? ++positiveFeedbacks : positiveFeedbacks;
                inGoodMood = true; // inGoodMood == true
        }

        //take a shower
        shower();

        //eat breakfast
        breakfast();

        //check if today is a weekday
        if (isWeekday == true){
            //attend the class
            attendClass(isOnlineClass);
        }

        else {
            //entertainment time
            entertainment(sc);
        }

        //have lunch
        lunch();

        //going outside and enjoying fresh air
        goOutside();

        //

        sc.close();
        System.out.println("Counter: " + positiveFeedbacks);

    }

    //method for greeting user
    public static void greetings(){
        System.out.println("\nGreetings, User!");
        System.out.println("My name is Mauricio Manuel F. Bergancia");
        System.out.println("I am a 2nd year computer science major at West Visayas State University (WVSU)\n");
        System.out.println("My daily routine:\n");
    }

    //method for waking up
    public static void wakeUp(){
        System.out.println("The first thing that I do everyday is waking up.");
        System.out.println("I mentally prepare myself for the day until I do my next task\n");
    }

    //method for getting coffee
    public static void getCoffee(){
        System.out.println("I start my day with a cup of coffee ☕");
        System.out.println("My favorite is pure black coffee 🖤\n");
    }

    //method for showing my workout routine
    public static char workoutRoutine(Scanner sc){
        System.out.println("Afterwards, I start my workout routine");
        System.out.println("Exercise is good for the mind and body!\nHere is my routine:");

        System.out.println("Time            Duration                    Activity");
        System.out.println("7:00 AM:        15 minutes                  Stretching");
        System.out.println("7:15 AM:        1 hr and 30 minutes         Jogging");
        System.out.println("8:45 AM:        30 minutes                  Arm Exercises");
        System.out.println("9:15 AM:        30 minutes                  Leg Exercises");
        System.out.println("9:45 AM:        15 minutes                  Rest");

        //ask user for feedback
        System.out.print("\nDo you like my exercise routine? (Y/n) ");
        char answer = sc.next().charAt(0);

        do {
            if (answer == 'Y'){
                System.out.println("Thank you for the positive feedback 💕\n");
                break;
            }
            else if (answer == 'n'){
                System.out.println("Thanks for your honesty 🤍\n");
                break;
            }
            else{
                System.out.print("Try again: ");
                answer = sc.next().charAt(0);
            }
        } while (answer != 'Y' || answer != 'n');

        return answer;
    }

    //method for taking a shower
    public static void shower(){
        System.out.println("After my work-out session and having rested, I prepare myself for shower");
        System.out.println("I start scrubbing and do my best to clean each body part 😎");
        System.out.println("When I'm done showering, I prepare myself for the next activity.\n");
    }

    //method for having breakfast
    public static void breakfast(){
        System.out.println("Breakfast is said to be the most important meal of the day, but I think that every meal is as important as the other.");
        System.out.println("Nonetheless, I usually start breakfast after shower.");
        System.out.println("I eat a balanced breakfast and drink plenty of water!");
        System.out.println("I then proceed to do the next activity\n");
    }

    //method for entertainment
    public static void entertainment(Scanner sc){
        sc = new Scanner(System.in);
        System.out.println("Entertainment is next on my list of activities!");
        System.out.println("During this time, I watch movies, play games, or do some other fun activities! 🎮🎬🍿");
        System.out.println("I do this for a few hours. Sometimes, I lose track of time and overdo this activity \n");

        System.out.println("What movies/games will you recommend me?");
        String recommendation = sc.nextLine();
        System.out.println(recommendation);
        System.out.println("Great choice! I will look that up!\n");
    }

    //method for having lunch
    public static void lunch(){
        System.out.println("The next thing to do will be lunch.");
        System.out.println("I eat a balanced and healthy meal that will allow me to continue pushing on for the day!");

    }

    //method for attending class
    public static void attendClass(boolean isOnlineClass){
        System.out.println("Attending classes is a must!");
        System.out.println("I try to give my full attention whenever we have a learning session.");
        if (isOnlineClass == true){
            System.out.println("I prepare my phone and laptop and wait for the lecture to begin.");
        }
        else{
            System.out.println("Me and my classmates prepare for class in the classroom.");
        }
        System.out.println("After class, I proceed to the next activiy!");
    }

    //method for going outside
    public static void goOutside(){
        System.out.println("Going outside and enjoying some fresh air is one of the activities I look up to every day.");
        System.out.println("I play with my dogs and get some motivation for continuing my daily tasks and achieving my goals in life.");
    }








}
