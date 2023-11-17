import java.util.Scanner;
//GPT'd: added this to add flavor to da greeting.
import java.time.DayOfWeek;
import java.time.LocalDate;

public class AATacuel {
    //dont ask me how, it took me at least 5 hours figuring out I have to create the scanner globally instead of creating one for every function then closing them in every function as well.
    public static Scanner scanner = new Scanner(System.in);
    //made these global so that all functions can update and read the time.
    public static int Hour;
    public static int Minute;
    public static void main(String[] args) {
        //GPT'd: this block extracts the current time from the hardware and then stores it to variable crdate.
        LocalDate crdate= LocalDate.now();
        //this block uses getDayOfWeek function to extract the day of week from the date into variable dw.
        DayOfWeek dw = crdate.getDayOfWeek();


        //git dat name
        String USERNAME = askname();

        
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n"); //make space to 'clear' terminal texts
        //official greeting
        System.out.println("\n\n\n\n\n\n\n======================================");
        //made this output field to allcaps to be uniform with the dayofweek data type.
        System.out.println("HELLO, " + USERNAME.toUpperCase() + "! NICE " + dw + " ISN'T IT?");
        System.out.println("======================================\n\n");


        //storyteller start:
        System.out.print("You fell asleep.\n.\n.\n.\nWhat hour do you remember you set your first morning alarm? (HH): ");
            int startHour = scanner.nextInt();
            scanner.nextLine(); //nakita ko sa java4n00bs gintan aw ko, gabug ang int input functions kang java and need sang nextline() nga ni to clear buffer to resolve the bug so it what i did.
        System.out.print("\nWhat minute do you remember you set your first morning alarm? (MM): ");
            int startMinute = scanner.nextInt();
            scanner.nextLine();//clear buffer
            //the startHour and startMinute variables are buffers to be passed as values for function updateClock so that it does not bug out in contrast to letting the user decide the starting time.
            //since the user can input any value of integer and it would not pass through the main "time processor" of the program.
            updateClock(startHour, startMinute);
        
        
        // Start the day        
        System.out.println("You wake up to your alarm. Noisy as ever.\nYou instinctively rush to the bath thinking you are late\nfor class but you just got dropped because you were absent for 2 entire weeks\nwithout legal excuse. You don't have to go to school now. You don't know how to feel about this.\nYou brush your teeth and change to your loafers\n");
        //the narration will continue so long as the time has not reached or exceeded 23:00(mandatory sleep). Everytime an action plus subaction is made, it will return to this loop. It also prints time everytime the loop starts.
        while (Hour < 23) {
            System.out.printf("It is %s, what do you want to do?\n", TimeCheck());
            selectActions();
        }
        //finishing narration, this plays after the clock reaches or exceeds 23:00
        System.out.println("It's past everyone's bedtime. You feel drowsy and want to hug the bed and drift into dreamland. The day is over. Good night!");

        scanner.close();
    }



    //FUNCTIONS




    //dis function is to extract name from user
    public static String askname() {
        System.out.print("Can you input your name?: ");
        String username = scanner.nextLine();
        //check if the user input is "no" (case-insensitive)
        if (username.equalsIgnoreCase("no")) {
        username = "NICE ONE";
        }
        return username;
    }


    //function to receive the value of current Hour and Minute and return as a singular string formatted already HH:MM
    //everytime this function is called, it will automatically be used as a formatted text and be used to fill a format specifier.
    private static String TimeCheck() {
        //format %2d such that the numeric values would be default to 2 decimal places.
        String time = String.format("%2d:%2d", Hour, Minute);
        return time;
    }

    //dis da main action menu, select 1 of all choices and it will lead to the sub-action menu corresponding to the main action selected
    private static void selectActions() {
        System.out.println("1 - Go Back to Sleep");
        System.out.println("2 - Eat or Drink");
        System.out.println("3 - Go Watch Youtube");
        System.out.println("4 - Play a Video Game");
        System.out.println("5 - Practice 'Art'");
        System.out.println("6 - Go Out of your Mancave");

        int choice = scanner.nextInt();
        System.out.println("\n\n\n\n\n\n\n\n"); //just to make space between the choice menu + choice and then the narration.
        switch (choice) {
            case 1:
                GoBackToSleep();
                break;
            case 2:
                EatDrink();
                break;
            case 3:
                Youtube();
                break;
            case 4:
                VideoGame();
                break;
            case 5:
                Art();
                break;
            case 6:
                Out();
                break;
            default:
                System.out.println("There are only 6 options, starting from 1. Go figure.");
        }
    }

    //main action 1: Go Back to Sleep - select 1 of all the choices and will return a text and then update the clock depending on how much time is spent performing that sub-action.
    //update the clock: return a set amount of hour and minute elapsed and the clock updateClock() function will handle the update of da time.
    public static void GoBackToSleep() {
        System.out.println("You decide to go back to sleep, free of guilt of missing on schoolworks- or anything, really.");
        System.out.println("1 - Be at least a little bit responsible, set an alarm to wake before the day ends without doing anything.");
        System.out.println("2 - YOLO");
        int choice = scanner.nextInt();
        System.out.println("\n\n\n\n\n\n\n\n"); //just to make space between the choice menu + choice and then the narration.
        switch (choice) {
            case 1:
                int tempHour, tempMinute;
                System.out.print("How many hours from now do you want to wake up?(HH): ");
                tempHour = scanner.nextInt();
                scanner.nextLine(); //clear buffer (java bug)
                System.out.print("How many minutes paired with the hours from now do you want to wake up?(MM): ");
                tempMinute = scanner.nextInt();
                scanner.nextLine(); //clear buffer (java bug)
                updateClock(tempHour, tempMinute);
                System.out.println("\n\n\n\n\n\n\n\nYou wake up to your alarm. You stretch your back and arms,\nstill yawning but ready to decide on your next course of action.");
                break;
            case 2:
                System.out.println("No regrets. You go to sleep. Not thinking of the future, escaping into temporary inexistence.");
                updateClock(100, 0);
                break;
            default:
                System.out.println("There are only 2 options, starting from 1. Go figure.");
        }
    }

    //main action 2: Eat or Drink - select 1 of all the choices and will return a text and then update the clock depending on how much time is spent performing that sub-action.
    //update the clock: return a set amount of hour and minute elapsed and the clock updateClock() function will handle the update of da time.
    public static void EatDrink() {
        System.out.println("You want to eat something.\nYou look at the fridge and you see these:");
        System.out.println("1 - A bag of chips, half eaten.");
        System.out.println("2 - A can of spicy corned tuna.");
        System.out.println("3 - A pitcherful of milk, you see the expiration date. It's way past the date today.");
        System.out.println("4 - That crappy concoction of meat and water you bought from a carinderia yesterday, untouched.");
        System.out.println("5 - A slice of that pizza you didn't finish last week.");
        System.out.println("6 - Nearly a pitcherful of water.");
        System.out.println("7 - Some pandesal stuffed with sandwich spread mayonnaise you made.");
        int choice = scanner.nextInt();
        System.out.println("\n\n\n\n"); //just to make space between the choice menu + choice and then the narration.
        //sub-actions: select 1 of all the choices, returning a color text and calling the updateClock() function to simulate passing of time equivalent to time elapsed performing the specific action.
        switch (choice) {
            case 1:
                System.out.println("Mmm. Crunchy.");
                updateClock(0, 30);
                break;
            case 2:
                System.out.println("That's spicy, but good. You are now sweating but satisfied.");
                updateClock(0, 30);
                break;
            case 3:
                System.out.println("Mmm. It tastes like cheese- or death perhaps. Only time will tell from now.\nAnd speaking of time, you spent an entire couple hours barfing and clinging on to dear life from nausea.\nYou felt like you just saw your life flash before your eyes.");
                updateClock(2, 0);
                break;
            case 4:
                System.out.println("That tasted like how'd you'd expect from how it looked. You feel harassed knowing you wasted 80 pesos buying that thing.");
                updateClock(1, 0);
                break;
            case 5:
                System.out.println("Yum. Cold, stale pizza is the best!");
                updateClock(0, 30);
                break;
            case 6:
                System.out.println("Mmm. Waturrrr.");
                updateClock(0, 15);
                break;
            case 7:
                System.out.println("Tasty! Stale bread and some sandwich spread is very nice.");
                updateClock(0, 30);
                break;
            default:
                System.out.println("There are only 7 options, starting from 1. Go figure.");
        }
    }

    //main action 3: Youtube - select 1 of all the choices and will return a text and then update the clock depending on how much time is spent performing that sub-action.
    //update the clock: return a set amount of hour and minute elapsed and the clock updateClock() function will handle the update of da time.
    public static void Youtube() {
        System.out.println("You feel bored- nothing unusual.\nYou pick up your phone to get your daily dose of that internet.");
        System.out.println("1 - Watch some military equipment showcase.");
        System.out.println("2 - Browse for memes of the month.");
        System.out.println("3 - Watch some Apollo the African Grey Parrot videos.");
        System.out.println("4 - Watch the VOD of that new hit video game played by your favorite streamer.");
        System.out.println("5 - Watch those historical documentaries.");
        System.out.println("6 - Watch your favorite artist draw and teach you more about drawing and art.");
        System.out.println("7 - Watch John Townsend cook some tasty looking 18th century meals.");
        int choice = scanner.nextInt();
        System.out.println("\n\n\n\n"); //just to make space between the choice menu + choice and then the narration.
        //sub-actions: select 1 of all the choices, returning a color text and calling the updateClock() function to simulate passing of time equivalent to time elapsed performing the specific action.
        switch (choice) {
            case 1:
                System.out.println("Sheeeeeeesh. That was cool! The video was 25 minutes long.");
                updateClock(0, 25);
                break;
            case 2:
                System.out.println("That got a good laugh out of you. An hour has passed.");
                updateClock(1, 0);
                break;
            case 3:
                System.out.println("'Glasssk.' Haha! Never gets old.");
                updateClock(0, 20);
                break;
            case 4:
                System.out.println("Man, you wish you could afford to buy those games and play them yourself. D:\nThe gameplay took 2 hours and a half.");
                updateClock(2, 30);
                break;
            case 5:
                System.out.println("That was enlightening. Worth that 2 hours.");
                updateClock(2, 0);
                break;
            case 6:
                System.out.println("You feel like you have learned many new things and you now feel inspired! You feel like you can sit for 10 hours straight drawing just because of this!");
                updateClock(1, 0);
                break;
            case 7:
                System.out.println("Yum! you now feel hungry!");
                updateClock(0, 30);
                break;
            default:
                System.out.println("There are only 7 options, starting from 1. Go figure.");
        }
    }

    //main action 4: Play Video Game - select 1 of all the choices and will return a text and then update the clock depending on how much time is spent performing that sub-action.
    //update the clock: return a set amount of hour and minute elapsed and the clock updateClock() function will handle the update of da time.
    public static void VideoGame() {
        System.out.println("Gamer position: time to embrace scoliosis and carpal tunnel!");
        System.out.println("1 - Go dunk (or get dunked) at League of Legends.");
        System.out.println("2 - Relax by building your colony on RimWorld.");
        System.out.println("3 - Roleplay as the man you are in the OG Call of Duty Modern Warfare Series.");
        System.out.println("4 - Bathe on infected blood in Left 4 Dead and Left 4 Dead 2.");
        System.out.println("5 - Indulge in your loneliness. Play Generals: Command and Conquer alone with crappy bots.");
        System.out.println("6 - Unleash your autism only at League of Legends - Teamfight Tactics.");
        System.out.println("7 - Sit on the corner of the room. Pretend you are holding a PS4 controller and stare at the wall. Imagine you are playing Bloodborne.");
        int choice = scanner.nextInt();
        System.out.println("\n\n\n\n"); //just to make space between the choice menu + choice and then the narration.
        //sub-actions: select 1 of all the choices, returning a color text and calling the updateClock() function to simulate passing of time equivalent to time elapsed performing the specific action.
        switch (choice) {
            case 1:
                System.out.println("You feel nothing. Only grief, hatred and self-loathing. You rage queued for 5 hours straight- good job!");
                updateClock(5, 0);
                break;
            case 2:
                System.out.println("That satisfied the citybuilder child in you! You spent 4 good hours in happiness.");
                updateClock(4, 0);
                break;
            case 3:
                System.out.println("You can't really accept the fact that you can not be like the guy you play as in the game in real life. That was fun though, one game of the trilogy played for less than 6 hours.");
                updateClock(5, 45);
                break;
            case 4:
                System.out.println("Rip and Tear! Rip and Tear!");
                updateClock(5, 30);
                break;
            case 5:
                System.out.println("Jeez, those bots suck. You wish there was any other person in the world interested in the same niche as you are. D:");
                updateClock(1, 30);
                break;
            case 6:
                System.out.println("You feel like you have lost yet a couple more brain cells playing that game.");
                updateClock(0, 45);
                break;
            case 7:
                System.out.println("You see an Amygdala on the ceiling! You run to it, hoping you'd awake in the hunter's nightmare.");
                updateClock(2, 30);
                break;
            default:
                System.out.println("There are only 7 options, starting from 1. Go figure.");
        }
    }

    //main action 5: Do 'Art' - select 1 of all the choices and will return a text and then update the clock depending on how much time is spent performing that sub-action.
    //update the clock: return a set amount of hour and minute elapsed and the clock updateClock() function will handle the update of da time.
    public static void Art() {
        System.out.println("Time to pretend you are good at something!");
        System.out.println("1 - Practice gesture drawing.");
        System.out.println("2 - Exercise your brain with practicing complex structures.");
        System.out.println("3 - Go braindump with a few doodles.");
        System.out.println("4 - Study anatomy.");
        System.out.println("5 - Study light.");
        System.out.println("6 - Study perspective and foreshortening.");
        System.out.println("7 - Inspiration! Sit down and draw a piece for 10 hours straight.");
        int choice = scanner.nextInt();
        System.out.println("\n\n\n\n"); //just to make space between the choice menu + choice and then the narration.
        //sub-actions: select 1 of all the choices, returning a color text and calling the updateClock() function to simulate passing of time equivalent to time elapsed performing the specific action.
        switch (choice) {
            case 1:
                System.out.println("That felt awesome, you feel more confident with illustrating characters on tougher poses now.");
                updateClock(2, 00);
                break;
            case 2:
                System.out.println("You can smell blood now. You might be bleeding your brains out with how hard that exercise was but nothing in life comes free.");
                updateClock(3, 00);
                break;
            case 3:
                System.out.println("That was so good! You feel refreshed after letting your brain loose without perfectionist restraints.");
                updateClock(2, 45);
                break;
            case 4:
                System.out.println("Oh~ So that is how that works. Awesome!");
                updateClock(2, 30);
                break;
            case 5:
                System.out.println("You feel upset with how incapable you are of remembering surfaces but practice makes perfect.");
                updateClock(3, 30);
                break;
            case 6:
                System.out.println("You lose confidence seeing how bad you are at moving figure in 3D space. This just makes you more motivated to improve though!");
                updateClock(3, 20);
                break;
            case 7:
                System.out.println("Look at you go! You neglect your all aspects of your health but that does not matter because you just created something that you like- worth!");
                updateClock(10, 00);
                break;
            default:
                System.out.println("There are only 7 options, starting from 1. Go figure.");
        }
    }

    //main action 6: Go Outside - select 1 of all the choices and will return a text and then update the clock depending on how much time is spent performing that sub-action.
    //update the clock: return a set amount of hour and minute elapsed and the clock updateClock() function will handle the update of da time.
    public static void Out() {
        System.out.println("Time to inhale some fresh air.");
        System.out.println("1 - Go take a walk alongside Iloilo river.");
        System.out.println("2 - Go window shopping on some cheap places");
        System.out.println("3 - Visit relatives at Pavia.");
        System.out.println("4 - Explore City Proper.");
        System.out.println("5 - Go inside malls and chill on free aircon.");
        System.out.println("6 - Go to Jaro Plaza and embarass yourself with your crappy outfits.");
        System.out.println("7 - Go on a walkathon: walk from LaPaz Plaza to Molo Plaza and back.");
        int choice = scanner.nextInt();
        System.out.println("\n\n\n\n"); //just to make space between the choice menu + choice and then the narration.
        //sub-actions: select 1 of all the choices, returning a color text and calling the updateClock() function to simulate passing of time equivalent to time elapsed performing the specific action.
        switch (choice) {
            case 1:
                System.out.println("The entire place smelled like a giant unflushed toilet. Smell aside, the place looked great.");
                updateClock(1, 30);
                break;
            case 2:
                System.out.println("You just set your eye on some necessities you might need. You make a mental note for those items.");
                updateClock(1, 00);
                break;
            case 3:
                System.out.println("It's glad to know they are okay. You hung out there for a while, talking about stuff and go on your merry way back to your house.");
                updateClock(2, 45);
                break;
            case 4:
                System.out.println("'There is a new place getting built here? Woah!'\n'That old spot is now not there.'\n'There are lot of unfortunate beggars. You wish you had spare penny to give them. A few more spend though and you will be on the same place as they are.");
                updateClock(1, 30);
                break;
            case 5:
                System.out.println("You realize just how much hell the Philippines is right now. Feeling cold air makes you wish you can go somewhere further away from the equator.");
                updateClock(1, 30);
                break;
            case 6:
                System.out.println("You don't know what you are doing here, just doing teenager things you thought. Yeah- who are you kidding, go back home.");
                updateClock(1, 20);
                break;
            case 7:
                System.out.println("That felt great. You saw a lot of good places and feel exhilarated that you got to move your body a lot today- good job!");
                updateClock(4, 00);
                break;
            default:
                System.out.println("There are only 7 options, starting from 1. Go figure.");
        }
    }

    //this function handles how the clock work plus can be called to update the current time.
    public static void updateClock(int hoursToAdd, int minutesToAdd) {
        //this line uses the existing Hour and Minute variables and adds the minutes that the other functions return into the minutes of the current Minute. (HH:MM+minutestoAdd)
        Minute += minutesToAdd;
        //dis line makes sure the any pack of updated 60 minutes equals to an additional Hour of the current time.
        Hour += Minute / 60;
        //this line resets the minute by removing the excess packs of 60 minutes and leaving it with the remainder, those packs of 60 minutes have been converted to hours already in the above line.
        Minute %= 60;
        //this line now updates the hour by adding the Hour other functions return into the new current Hour.
        Hour += hoursToAdd;
        //after dis, the Hour and Minute variables have been appropriately updated and handled.
    }

}