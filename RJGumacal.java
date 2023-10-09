import java.util.Scanner;

public class RJGumacal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Uses scanner for inputs
		//The program starts asking the user what time the routine starts
		System.out.println("I start my morning routine at (e.g., 07:00 AM):");
		String morning = scanner.nextLine();

		System.out.println("I do things like (one task per line, type 'done' when finished):");
		String morningRoutine = inputTasks(scanner);

		System.out.println("\nI start my afternoon routine at (e.g., 12:00 PM):");
		String afternoon = scanner.nextLine();

		System.out.println("I do things like (one task per line, type 'done' when finished):");
		String afternoonRoutine = inputTasks(scanner);

		System.out.println("\nI start my night routine at (e.g., 08:00 PM):");
		String night = scanner.nextLine();

		System.out.println("I do things like (one task per line, type 'done' when finished):");
		String nightRoutine = inputTasks(scanner);
		scanner.close();

		//This part displays the tasks the user inputs
		printRoutine("\nMy Morning Routine starts at " + morning, morningRoutine);
		printRoutine("My Afternoon Routine starts at " + afternoon, afternoonRoutine);
		printRoutine("My Night Routine starts at " + night, nightRoutine);
		//This part displays the total time of the tasks (assuming the tasks take 1 hour)
		TotalTime(morningRoutine, "morning");
		TotalTime(afternoonRoutine, "afternoon");
		TotalTime(nightRoutine, "night");
	}

	public static String inputTasks(Scanner scanner) {
		StringBuilder routine = new StringBuilder();
		String input;
		while (!(input = scanner.nextLine()).equalsIgnoreCase("done")) { //When the user types "done" input stops
			routine.append(input).append("\n");
		}
		return routine.toString();
	}

	public static void printRoutine(String greeting, String routine) {
		System.out.println(greeting);
		System.out.println(routine);
	}
	//This part calculates the total time of the tasks
	public static void TotalTime(String routine, String time) {
		int tasks = routine.split("\n").length - 1; //Subtract 1 to exclude the 'done' entry
		int hours = 1; //Assuming each task takes 1 hour
		int total = tasks * hours;

		System.out.println("Total time spent on " + time + " routine: " + total + " hours");
	}
}

