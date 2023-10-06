import java.util.Scanner;

public class MJChavez {

    private static final int typing_speed = 28; // Typing speed in milliseconds

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String day = "";

        // Greets user with typewriter effect
        typeWithDelay("A Daily Life Routine by Mherlie ");
        System.out.println();
        typeWithDelay("Here is Mherlie's daily routine in face-to-face classes. ");
        System.out.println();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println();

        // Get the user's chosen day
        System.out.print("Enter day of the week (Monday to Friday): ");
        day = scanner.nextLine().toLowerCase();
        System.out.println();

        typeWithDelay("Hello, " + name + "! Let's go through my daily routine.");
        System.out.println();


        // Display the routine schedule based on the chosen day in switch case
        switch (day.toLowerCase()){
            case "monday":
                displayMondaySchedule();
                break;
            case "tuesday":
                displayTuesdaySchedule();
                break;
            case "wednesday":
                displayWednesdaySchedule();
                break;
            case "thursday":
                displayThursdaySchedule();
                break;
            case "friday":
                displayFridaySchedule();
                break;
            default:
                System.out.println("Invalid day entered. Please choose a day from Monday to Friday.");
                System.out.println();
        }

        typeWithDelay("Thank you for taking time knowing my daily life routine, " + name + "! Have a great day.");
    }


    private static void typeWithDelay(String text) throws InterruptedException{
        for (char c : text.toCharArray()){
            System.out.print(c);
            Thread.sleep(typing_speed);
        }
        System.out.println();
    }

    // Define schedule for each day
    public static void displayMondaySchedule() {
        System.out.println("Bright Monday ✨");
        System.out.println("1. Wake up early.");
        System.out.println("2. Eat a healthy breakfast.");
        System.out.println("3. Prepare to go to school.");
        System.out.println("4. Attend the first class at 10:00 AM (CCS 223 Discrete Structures 2).");
        System.out.println("5. Eat lunch with classmates");
        System.out.println("6. Attend the next class at 1:00 PM (HUM 110 Art Appreciation).");
        System.out.println("7. Attend last class at 2:30 PM (SS 111 The Contemporary World).");
        System.out.println("8. Go home after a long day.");
        System.out.println("9. Study and do remaining tasks/homework.");
        System.out.println("10. Take a good sleep and rest.");
        System.out.println();
    }

    public static void displayTuesdaySchedule() {
        System.out.println("Optimistic Tuesday 🎉");
        System.out.println("1. Wake up very early.");
        System.out.println("2. Eat a healthy breakfast.");
        System.out.println("3. Prepare to go to school.");
        System.out.println("4. Attend the first class at 7:00 AM (CC 204 Data Structures and Algorithms).");
        System.out.println("5. Attend the second class at 7:00 AM (CCS 246 Intro to AI).");
        System.out.println("6. Eat lunch with my classmates.");
        System.out.println("7. Attend last class at 1:00 PM (SS 112 Ethics).");
        System.out.println("8. Gala or study with amazing classmates.");
        System.out.println("9. Take a short nap after going home.");
        System.out.println("10. Watch some movies.");
        System.out.println();
    }

    public static void displayWednesdaySchedule() {
        System.out.println("Energetic Wednesday 💃");
        System.out.println("1. Wake up feeling energized.");
        System.out.println("2. Eat a healthy and full breakfast.");
        System.out.println("3. Prepare to go to school while fresh.");
        System.out.println("4. Attend the first class at 8:00 AM (PATHFIT 3 Physical Education).");
        System.out.println("5. Attend the second class at 10:00 AM (CCS 223 Discrete Structures 2).");
        System.out.println("6. Eat lunch after a tiring PE class");
        System.out.println("7. Attend third class at 1:00 PM (HUM 110 Art Appreciation). ");
        System.out.println("8. Attend last class at 2:30 PM (SS 111 The Contemporary World).");
        System.out.println("9. Go home after a long tiring day.");
        System.out.println("10. Take a good sleep and rest.");
        System.out.println();
    }

    public static void displayThursdaySchedule() {
        System.out.println("Enthusiastic Thursday 🏆");
        System.out.println("1. Wake up so early again.");
        System.out.println("2. Eat a healthy breakfast.");
        System.out.println("3. Prepare to go to school.");
        System.out.println("4. Attend the first class at 7:00 AM (CC 204 Data Structures and Algorithms).");
        System.out.println("5. Attend the second class at 10:00 AM (CCS 246 Intro to AI).");
        System.out.println("6. Eat lunch with classmates.");
        System.out.println("7. Attend last class at 1:00 PM (SS 112 Ethics).");
        System.out.println("8. Grab coffee after class with expensive and rich classmates.");
        System.out.println("9. Go home and take nap.");
        System.out.println("10. Study and do remaining school works.");
        System.out.println();
    }

    public static void displayFridaySchedule() {
        System.out.println("Hopeful Friday 💡");
        System.out.println("1. Wake up early.");
        System.out.println("2. Eat a healthy breakfast.");
        System.out.println("3. Prepare to go to school.");
        System.out.println("4. Attend the only class with Sir Mark at 8:00 AM (CIT 207 Object-Oriented Programming.");
        System.out.println("5. Do fun tasks at lab.");
        System.out.println("6. End the day with Sir Mark's interesting lectures.");
        System.out.println("7. Hang out with classmates if we don't have exams.");
        System.out.println("8. Go home after a long day.");
        System.out.println("9. Rest and play with my pets.");
        System.out.println("10. Read book or watch a movie.");
        System.out.println();
    }

}
