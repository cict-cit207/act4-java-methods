import static java.lang.System.out;

import java.util.Scanner;

public class OLadores {

  // Using a sealed interface for nice pattern matching
  public sealed interface Day permits SchoolDay, Weekend, Holiday {
    void startDay();

    default void eatMeal() {
      out.println("Eating meal 🍛..");
    }

    default void shower() {
      out.println("Showering 🚿..");
    }

    default void sleep() {
      out.println("Sleeping.. 🛌😴💤");
    }

    default void doChores() {
      out.println("Doing household chores 🧹🧽🏠..");
    }

    default void leisure() {
      out.println("Leisure time 🎮💻⚾..");
    }

    // With exhaustive pattern matching, no need for default case here
    default void summary() {
      switch (this) {
        case SchoolDay day -> {
          out.println("Finished school day.");
        }
        case Weekend day -> {
          out.println("Finished weekend.");
        }
        case Holiday day -> {
          out.println("Finished holiday.");
        }
      }
    }
  }

  final class SchoolDay implements Day {

    public void startDay() {
      out.println("Starting school day!");
      shower();
      eatMeal();
      learnatSchool();
      eatMeal();
      learnatSchool();
      shower();
      eatMeal();
      doRequirements();
      doChores();
      leisure();
      sleep();
      summary();
    }

    void learnatSchool() {
      out.println("Learning at school 🏫📚👨‍🎓..");
    }

    void doRequirements() {
      out.println("Doing requirements 📚📋👨‍💻..");
    }

  }

  public final class Weekend implements Day {
    public void startDay() {
      out.println("Starting weekend!");
      eatMeal();
      leisure();
      shower();
      doRequirements();
      doChores();
      eatMeal();
      sleep();
      doChores();
      eatMeal();
      doRequirements();
      leisure();
      sleep();
      summary();
    }

    void doRequirements() {
      out.println("Doing requirements 📚📋👨‍💻..");
    }
  }

  public final class Holiday implements Day {
    public void startDay() {
      out.println("Starting holiday!");
      eatMeal();
      doChores();
      shower();
      leisure();
      eatMeal();
      doChores();
      sleep();
      leisure();
      eatMeal();
      doChores();
      leisure();
      sleep();
      summary();
    }
  }

  public class DayFactory {
    public static Day makeDay(String type) throws IllegalArgumentException {
      OLadores o = new OLadores();
      switch (type.toLowerCase()) {
        case "school day", "schoolday", "regular day", "day" -> {
          return o.new SchoolDay();
        }
        case "weekend" -> {
          return o.new Weekend();
        }
        case "holiday", "vacation" -> {
          return o.new Holiday();
        }
        default -> {
          throw new IllegalArgumentException("Not a valid day.");
        }
      }
    }
  }

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      String inputDay;
      // do-while doesn't work here
      out.println("\nInput type of day [school day/regular day/day, weekend, holiday/vacation], [q] to quit:");
      while (input.hasNextLine()) {
        inputDay = input.nextLine();
        switch (inputDay) {
          case "q" -> {
            out.println("Exiting program...");
            System.exit(0);
          }
          default -> {
            var day = DayFactory.makeDay(inputDay);
            day.startDay();
          }
        }
        out.println("\nInput type of day [school day/regular day/day, weekend, holiday/vacation], [q] to quit:");
      }
    } catch (IllegalArgumentException e) {
      e.printStackTrace();
      System.exit(0);
    }
  }
}
