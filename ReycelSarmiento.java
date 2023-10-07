class ReycelSarmiento {
    public static void main(String[] args) {
  
      String name = "Reycel B. Sarmiento";
      int age = 20, time = 4, time1= 5, time2 = 6, time3= 8;
      String food = "rice and protein-rich food";
      String vehicle = "jeep";
      String activity = "use my phone", activity1 = "study and do my assignments.";
      String activity3 = "wash the dishes", activity4 = "pray";
  
  
  
      // Prints personal information
      info(name, age);
      System.out.println("My Daily Routine:\n");
      
      // Call methods to describe daily routine
      wake_up(time);
      breakfast(food, time1);
      departure(time2);
      atSchool();
      lunch();
      afternoonClass();
      goHome(time1, vehicle);
      atHome(activity, activity1);
      nightRoutine(time3, activity3, activity4);
  
    }
  
    public static void info(String name, int age) {
      // Print personal information
      System.out.println("Hi! I'm  " + name + " of BSCS 2-A - AI.");
      System.out.println("I'm  " + age + " years old.\n");
    }
  
    public static void wake_up(int time) {
      // Describe wake-up time
      System.out.println("I usually wake up at " + time + " AM.");
    }
  
    public static void breakfast(String food, int time1) {
      // Describes breakfast schedule
      System.out.println("I eat " + food + " for breakfast at " + time1 + " AM.");
    }
  
    public static void departure(int time2) {
      // Describes departure time for school
      System.out.println("I leave exactly at " + time2 + " AM so that I won't be late for school.");
    }
  
    public static void atSchool() {
      // Describes morning class schedule
      System.out.println("I attend my morning classes from 7 AM to 12:00 noon.");
    }
  
    public static void lunch() {
      // Describes lunchtime schedule
      System.out.println("Eat lunch from 12:00 noon - 1:00 PM");
    }
  
    public static void afternoonClass() {
      // Describes afternoon class schedule
      System.out.println("I attend my afternoon classes from 1 PM - 4 PM.");
    }
  
    public static void goHome(int time1, String vehicle) {
      // Describes going home
      System.out.println("I go home at " + time1 + " PM via " + vehicle);
    }   
  
     public static void atHome(String activity, String activity1) {
      // Describes routine after going home
      System.out.println("After going home I " + activity + " and then " + activity1);
    }   
    
    public static void nightRoutine(int time3, String activity3, String activity4) {
      // Describes routine after going home
      System.out.println("I eat my dinner usually at " + time3 + " and then " + activity3+"\n");
      System.out.println("Lastly, I "+activity4 + " and go to sleep.");
    } 
                    
  }
  