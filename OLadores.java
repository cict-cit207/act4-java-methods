import static java.lang.System.out;

class OLadores {

    /**
     * InnerOLadores
     */
    public sealed interface Day permits SchoolDay, Weekend, Holiday {
        void startDay();

        void eatMeal();

        void shower();

        void sleep();

        void doChores();

        void leisure();

    }
    /**
     * Day
     */
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

        }

        public void eatMeal() {
            out.println("Eating meal 🍛..");
        }

        public void shower() {
            out.println("Showering 🚿..");
        }

        void learnatSchool() {
            out.println("Learning at school 🏫📚👨‍🎓..");
        }

        public void leisure() {
            out.println("Leisure time 🎮💻⚾..");
        }

        public void doChores() {
            out.println("Doing household chores 🧹🧽🏠..");
        }

        void doRequirements() {
            out.println("Doing requirements 📚📋👨‍💻..");
        }

        public void sleep() {
            out.println("Sleeping.. 🛌😴💤");
        }

    }

    /**
     * Weekend
     */
    final public class Weekend implements Day {
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
        }

        public void eatMeal() {
            out.println("Eating meal 🍛..");
        }

        public void shower() {
            out.println("Showering 🚿..");
        }

        public void leisure() {
            out.println("Leisure time 🎮💻⚾..");
        }

        void doRequirements() {
            out.println("Doing requirements 📚📋👨‍💻..");
        }

        public void doChores() {
            out.println("Doing household chores..");
        }

        public void sleep() {
            out.println("Sleeping.. 🛌😴💤");
        }

    }

    /**
     * Holiday
     */
    final public class Holiday implements Day {
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
        }

        public void eatMeal() {
            out.println("Eating meal..");
        }

        public void shower() {
            out.println("Showering..");
        }

        public void leisure() {
            out.println("Leisure time 🎮💻⚾..");
        }

        public void doChores() {
            out.println("Doing household chores 🧹🧽🏠..");
        }

        public void sleep() {
            out.println("Sleeping.. 🛌😴💤");
        }
    }

    /**
     * DayFactory
     */
    public class DayFactory {
        public static Day makeDay(String type) {
            OLadores o = new OLadores();
            switch (type.toLowerCase()) {
                case "school day", "regular day", "day" -> {
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
        Day day = DayFactory.makeDay("school day");
        day.startDay();
    }
}
