import java.util.Scanner;

class CIArtacho {
    // Your routine methods with parameters

    public static void Morning_Exercises(int day){
        switch(day){
            case 1:
                System.out.println("====Morning Exercises====");
                System.out.println("========================"); //general exercises
                System.out.println("2 Kilometer Jogging");
                System.out.println("20 Jumping Jacks");
                System.out.println("5 Curl Ups");
                System.out.println("30 Seconds Planks");
                System.out.println("========================");
            break;
            case 2:
                System.out.println("====Morning Exercises====");
                System.out.println("========================"); //for muscular strength
                System.out.println("4 Push Ups");
                System.out.println("4 Squats");
                System.out.println("10 Minutes Equipment use: Barbels");
                System.out.println("========================");
            break;
            case 3:
                System.out.println("====Morning Exercises====");
                System.out.println("========================"); //for muscular endurance
                System.out.println("2 Kilometer Jogging");
                System.out.println("30 seconds Planks");
                System.out.println("8 Repetitions Lunges");
                System.out.println("10 Minutes Equipment use: Elliptical Machine");
                System.out.println("========================");
            break;
            case 4:
                System.out.println("====Morning Exercises====");
                System.out.println("========================"); //for Agility
                System.out.println("10 Lunge repetitions");
                System.out.println("5 Minutes Equipment use: Jump Rope");
                System.out.println("10 Minutes Equipment use: Agility Ladder");
                System.out.println("========================");
            break;
            case 5:
                System.out.println("====Morning Exercises====");   
                System.out.println("========================"); //for Speed
                System.out.println("2 Kilometer Jogging");
                System.out.println("300 meter sprint");
                System.out.println("10 Minutes Equipment use: Treadmill");
                System.out.println("========================");
            break;
            case 6:
                System.out.println("====Morning Exercises====");
                System.out.println("========================"); //for Balance and Coordination
                System.out.println("2 Minutes Stork Exercise: Right and Left");
                System.out.println("10 Minutes Equipment use: Jumping Rope");
                System.out.println("========================");
            break;
            case 7:
                System.out.println("====Morning Exercises====");
                System.out.println("========================"); //for Balance and Coordination
                System.out.print("Rest Day, No Exercises.");
                System.out.println("========================");
            break;
        }
    }  

    public static void Afternoon_Activities(int day){
        switch(day){
            case 1:
                System.out.println("==Afternoon Activities==");
                System.out.println("========================");
                System.out.println("Review Data Structures and AI");
                System.out.println("Naptime");
                System.out.println("========================");
            break;
            case 2:
                System.out.println("==Afternoon Activities==");
                System.out.println("========================");
                System.out.println("Review The Contemporary World");
                System.out.println("Naptime");
                System.out.println("========================");
            break;
            case 3:
                System.out.println("==Afternoon Activities==");
                System.out.println("========================");
                System.out.println("Review Data Structures and AI");
                System.out.println("Naptime");
                System.out.println("========================");
            break;
            case 4:
                System.out.println("==Afternoon Activities==");
                System.out.println("========================");
                System.out.println("Review Object Oriented programming");
                System.out.println("Rush Weeklies in Limbus Company");
                System.out.println("========================");
            break;
            case 5:
                System.out.println("==Afternoon Activities==");
                System.out.println("========================");
                System.out.println("Afternoon Naptime");
                System.out.println("========================");
            break;
            case 6:
                System.out.println("==Afternoon Activities==");
                System.out.println("========================");
                System.out.println("Do Assignments");
                System.out.println("Afternoon Naptime");
                System.out.println("========================");
            break;
            case 7:
                System.out.println("==Afternoon Activities==");
                System.out.println("========================");
                System.out.println("Afternoon Naptime");
                System.out.println("========================");
            break;
        }
    }

    public static void Nighttime_Activities(int day){
        switch (day){
            case 1:
                System.out.println("==Night Extra Activities==");
                System.out.println("========================");
                System.out.println("Game Time: Genshin Impact");
                System.out.println("Game Time: Honkai Star Rail");
                System.out.println("Extra: Sleep Early");
                System.out.println("Extra: Create Reviewers and Study");
                System.out.println("========================");
            break;
            case 2:
                System.out.println("==Afternoon Activities==");
                System.out.println("========================");
                System.out.println("Game Time: Genshin Impact");
                System.out.println("Game Time: Honkai Star Rail");
                System.out.println("Game Time: Punishing: Gray Raven");
                System.out.println("Extra: Create Reviewers and Study");
                System.out.println("========================");
            break;
            case 3:
                System.out.println("==Afternoon Activities==");
                System.out.println("========================");
                System.out.println("Game Time: Genshin Impact");
                System.out.println("Game Time: Honkai Star Rail");
                System.out.println("Extra: Sleep Early");
                System.out.println("Extra: Create Reviewers and Study");
                System.out.println("========================");
            break;
            case 4:
                System.out.println("==Afternoon Activities==");
                System.out.println("========================");
                System.out.println("Game Time: Genshin Impact");
                System.out.println("Game Time: Honkai Star Rail");
                System.out.println("Extra: Sleep Early");
                System.out.println("Extra: Create Reviewers and Study");
                System.out.println("========================");
            break;
            case 5:
                System.out.println("==Afternoon Activities==");
                System.out.println("========================");
                System.out.println("Game Time: Genshin Impact");
                System.out.println("Game Time: Honkai Star Rail");
                System.out.println("Game Time: Punishing: Gray Raven");
                System.out.println("Extra: Create Reviewers and Study");
                System.out.println("========================");
            break;
            case 6:
                System.out.println("==Afternoon Activities==");
                System.out.println("========================");
                System.out.println("Game Time: Genshin Impact");
                System.out.println("Game Time: Honkai Star Rail");
                System.out.println("Game Time: Punishing: Gray Raven");
                System.out.println("Extra: Create Reviewers and Study");
                System.out.println("========================");
            break;
            case 7:
                System.out.println("==Afternoon Activities==");
                System.out.println("========================");
                System.out.println("Extra: Create Reviewers and Study");
                System.out.println("Extra: Sleep Early");
                System.out.println("========================");
            break;
        }
    }

    public static void main(String[] args) {
    // Your method calls
        String day;
        System.out.println("System Functioning");
        System.out.println("What day of the week do you want to choose? ");
        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        System.out.println("6. Saturday");
        System.out.println("7. Sunday");
        System.out.print("Choice: ");
        Scanner n = new Scanner(System.in);
        day = n.nextLine();
        n.close();
            switch(day){
            case "Monday" :
                System.out.println("You Chose Monday.");
                Morning_Exercises(1);
                Afternoon_Activities(1);
                Nighttime_Activities(1);
            break;
            case "Tuesday":
                System.out.println("You Chose Tuesday.");
                Morning_Exercises(2);
                Afternoon_Activities(2);
                Nighttime_Activities(2);
            break;
            case "Wednesday":
                 System.out.println("You Chose Wednesday.");
                Morning_Exercises(3);
                Afternoon_Activities(3);
                Nighttime_Activities(3);
            break;
            case "Thursday":
                System.out.println("You Chose Thursday.");
                Morning_Exercises(4);
                Afternoon_Activities(4);
                Nighttime_Activities(4);
            break;
            case "Friday":
                 System.out.println("You Chose Friday.");
                Morning_Exercises(5);
                Afternoon_Activities(5);
                Nighttime_Activities(5);
            break;
            case "Saturday":
                System.out.println("You Chose Saturday.");
                Morning_Exercises(6);
                Afternoon_Activities(6);
                Nighttime_Activities(6);
            break;
            case "Sunday":
                System.out.println("You Chose Sunday.");
                Morning_Exercises(7);
                Afternoon_Activities(7);
                Nighttime_Activities(7);
            default: System.out.print("Wrong Choice. Please Restart the System");
            }
    }       
}