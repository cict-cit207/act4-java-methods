import java.util.Scanner;


class DailyRoutine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Full Name: ");
        String name = scanner.next();
        System.out.print("Date: ");
        String date = scanner.next();
        System.out.print("==============================================================================\n");

        System.out.println("Choose the Routine time (1 - for Morning, 2 - for Afternoon, 3 - Evening): ");
        char timeofschedule = scanner.next().charAt(0);

        timeofschedule = Character.toUpperCase(timeofschedule);

        displayDailySchedule(timeofschedule);

        System.out.println("That's my routine in that time ");
        System.out.print("==============================================================================\n");

        System.out.println("Press 1 to exit and 2 to load again" );
        int schedule = scanner.nextInt();

        schedule = (schedule >= 1 && schedule <= 3) ? schedule : 3;

        chooseRoutine(schedule);

        scanner.close();
    }
    private static void performActivity(String activity) {
        System.out.println("Activity: " + activity);
    }

    private static void displayDailySchedule(char schedule) {
        // Display daily schedule based on the time of routine
        switch (schedule) {
            case '1':
                System.out.println("Morning routine");
                performMorningRoutine();
                wakeup();
                foldTheBeddings();
                cookbreakfast();
                takeAbathAndChangeClothes();
                eatBreakfast();
                doChores();
                preparinglunch();
                break;

            case '2':
                System.out.println("Afternoon routine");
                performAfternoonRoutine();
                cookandeatlunch();
                washdishes();
                takeanap();
                preparingDinner();
                break;

            case '3':
                System.out.println("Evening routine");
                performEveningRoutine();
                cookandeatdinner();
                washdishe();
                takeanap();
                cleanthemess();
                takeahalfbath();
                changetosleepclothes();
                studyanddohomework();
                preparethingsfortomorrow();
                sleep();
                break;
            default:
                System.out.println("Invalid day of the week.");
        }
    }
    private static void chooseRoutine(int schedule) {
        // Perform different routines based on the day of the week
        if (schedule >= 1 && schedule <= 3) {
            if (schedule == 1) {
                performActivity("the routine is end");

            } else if(schedule == 2 ) {
                performActivity("Try to run the code again");

            }
        }


    }
    // Define activities for each day using functions
    private static void performMorningRoutine() {
        System.out.println("let's start early in the Morning since we have a long day ahead");
    }

    private static void wakeup() {
        System.out.println("Wake-up at 7:00 in the Morning");
    }

    private static void foldTheBeddings() {
        System.out.println("Fix the bed");
    }

    private static void cookbreakfast() {
        System.out.println("Cook my breakfast");
    }

    private static void takeAbathAndChangeClothes() {
        System.out.println("Take a Nice bath and change to my comfortable clothes");
    }

    private static void eatBreakfast() {
        System.out.println("have my own breakfast");
    }

    private static void doChores() {
        System.out.println("Do the Household Chores");
    }

    private static void preparinglunch() {
        System.out.println("Prepare my Lunch");
    }

    private static void performAfternoonRoutine() {
        System.out.println("After a hardwork, there's a time for leisure in the Afternoon time.");
    }

    private static void cookandeatlunch() {
        System.out.println("After Preparing, i cook and eat my lunch.");
    }

    private static void washdishes() {
        System.out.println("wash my dishes");
    }

    private static void takeanap() {
        System.out.println(" watch movie, listening to music, playing games or Take a Nap");
    }

    private static void preparingDinner() {
        System.out.println("Preparing for Dinner");
    }
    private static void performEveningRoutine() {
        System.out.println("As a day comes to close, lets greet Evening by beauty and hope");
    }

    private static void cookandeatdinner() {
        System.out.println("Cook and eat my dinner");
    }

    private static void washdishe() {
        System.out.println("Wash dishes and cooking utensils");
    }

    private static void cleanthemess() {
        System.out.println("Clean my own mess");
    }

    private static void takeahalfbath() {
        System.out.println("Take my quick half bath.");
    }
    private static void changetosleepclothes() {
        System.out.println("Choose and change into my sleeping clothes");
    }private static void studyanddohomework() {
        System.out.println("Study and review materials for my homework and exam.");
    }private static void preparethingsfortomorrow() {
        System.out.println("Prepare thee needed thongs for tomorrow such as uniforms, bags, books and etc.");
    }
    private static void sleep() {
        System.out.println("Sleep early");
    }

}
