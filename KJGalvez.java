import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class KJGalvez{  

    public static void main(String[] args){

        String error = "error : input Does Not Match Any Choices";

        Scanner input = new Scanner(System.in);
        char c, choice;
        char cheese = 'a';

        while(cheese != 'n'){
            menu(); //main interface
            c = input.next().charAt(0);
    
            if(c == '1'){

                System.out.println("\n\n\t\t\t  STUDENT LIFE!");
                format();
                choice = input.next().charAt(0);

                if(choice == '1')
                    school();
                else if(choice == '2')
                    request(1);
                else
                    System.out.print(error);
            }
            else if(c == '2'){
                
                format();
                choice = input.next().charAt(0);

                if(choice == '1')
                    nonSchool();
                else if(choice == '2')
                    request(2);
                else
                    System.out.print(error);
            }
            else{
                System.out.print(error);
                System.exit(1);
            }

            System.out.print("\nAny Key to ReRun while Enter N if youre not handsome : ");
            cheese = input.next().charAt(0);
        }

        System.out.println("\n\t\t\t\t      --------Youre Handsomer--------\n");
    }

    public static void format(){
       System.out.println("\n=================================================================");
       System.out.println("=\t\t\t\t\t\t\t\t=");
       System.out.println("=\t\t1\t Display Routine\t\t\t=");
       System.out.println("=\t\t2\t Request Routine At Current Time\t=");
       System.out.println("=\t\t\t\t\t\t\t\t=");
       System.out.println("=================================================================");
       System.out.print("Enter: ");
    }

    public static void menu(){
        System.out.println("\n=================================================================\n=\t\tMy Daily Routine By Khee Jay Galvez\t\t=");
        System.out.println("=\t\t\t\t\t\t\t\t=");
        System.out.println("=\t\t1\t School Days\t\t\t\t=");
        System.out.println("=\t\t2\t Non-School Days\t\t\t=");
        System.out.println("=\t\t\t\t\t\t\t\t=");
        System.out.println("=================================================================");
        System.out.print("Enter: ");
    }

    public static void school(){
        System.out.println("\n\n");
        System.out.println("=========================================FULL SCHOOL DAY ROUTINE=========================================");
        System.out.println("\n\t\tTime\t\t\t\tActivity\t\t\t\tDuration");
        System.out.println("\n\t      6 : 00 AM\t\t\t      Baby Wake Up\t\t\t\t  ---");
        System.out.println("\t\t\t\t\t      Take a Bath\t\t\t\t20 Minutes");
        System.out.println("\t\t\t\t\t     Eat Breakfast\t\t\t\t5 Minutes");
        System.out.println("\t\t\t\t\t      School Time\t\t\t\t Unfixed");
        System.out.println("\n\t     12 : 00 PM\t\t\t       Lunch Time!\t\t\t\t10 Minutes\n");
        System.out.print("\t\t\t\t\t   Chill in the Library\t\t\t\t30 Minutes");
        System.out.println("\n\t      5 : 00 PM\t\t\t       Back to BH\t\t\t\t  ---");
        System.out.print("\t\t\t\t\t       Quick Bath\t\t\t\t5 Minutes\n");
        System.out.println("\t\t\t\t\t  Games/Scroll on my Fyp\t\t\t3 Hours");
        System.out.println("\n\t     12 : 00 PM\t\t\t   Have my Body Rest Up\t\t\t\t  :)");
        System.out.println("\n=========================================================================================================");
    }

    public static void nonSchool(){
        System.out.println("\n\n");
        System.out.println("========================================= NON-SCHOOL DAY ROUTINE =========================================");
        System.out.println("\n\t\tTime\t\t\t\tActivity\t\t\t\tDuration");
        System.out.println("\n\t      5 : 00 AM\t\t\t      Baby Wake Up\t\t\t\t  ---");
        System.out.println("\t\t\t\t\t       Streching\t\t\t\t10 Minutes");
        System.out.println("\t\t\t\t\t      Prepare Meal \t\t\t\t25 Minutes");
        System.out.println("\t\t\t\t\t   Have Some Work Out\t\t\t\t20 Minutes");
        System.out.println("\t\t\t\t\t Manage my School Works\t\t\t\t30 Minutes");
        System.out.println("\t\t\t\t\t         Sleep\t\t\t\t\t2 Hours");
        System.out.println("\n\t     11 : 30 AM\t\t\t       Lunch Time\t\t\t\t10 Minutes");
        System.out.println("\t\t\t\t    Watch Youtube Influencers I Followed\t\t20 Minutes");
        System.out.println("\t\t\t\t\t       Have a Nap\t\t\t\t  ---");
        System.out.println("\n\t      5 : 00 PM\t\t\t    Hit Some Work Out\t\t\t\t  ");
        System.out.print("\t\t\t\t\t    Legs and Strength\t\t\t\t30 Minutes");
        System.out.println("\n\t\t\t\t\t       Chill Out\t\t\t\t  ---");
        System.out.println("\t\t\t\t\t\t Sleep\t\t\t\t\t   :)");
        System.out.println("\n=========================================================================================================");
    }
    
    //Methods That Uses Parameter
    public static void request(int type){ 
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH");
        Integer now = Integer.parseInt(currentTime.format(formatter));

        if(type == 1){

            if(now >= 6 && now <= 22)
                print(1);
            else
                print(3);
        }
        else{

            if(now >= 6 && now <= 10)
                print(1);
            else if(now > 10 && now <= 12)
                print(4);
            else if(now > 12 && now <= 20)
                print(2);
            else
                print(3);
        }
    }

    public static void print(int type){
        switch(type){
            case 1:
            System.out.print("\n\n");
            System.out.println("\t* * * * * * * * * * * * * * * * * * * * *");
            System.out.println("\t*- - - - - - - - - - - - - - - - - - *");
            System.out.println("\t*- - - - - - STUDY- - - - - - - - *");
            System.out.println("\t*- - - - - - - - - - - - - - - - - - *");
            System.out.println("\t* * * * * * * * * * * * * * * * * * * * *\n\n");
                break;
            case 2:
            System.out.print("\n\n");
            System.out.println("\t   **********                       **********");            
            System.out.println("\t****************      GYM        ****************");
            System.out.println("\t*************************************************");
            System.out.println("\t****************                 ****************");
            System.out.println("\t   **********                       **********\n\n");
                break;
            case 3:
            System.out.print("\n\n");
            System.out.println("\t         ZZZZZZZZZZZZZZ"); 
            System.out.println("\t      Z                  Z");
            System.out.println("\t    z                      z");
            System.out.println("\t  z                          z");
            System.out.println("\t*             SLEEP            *");
            System.out.println("\t  z                          z");
            System.out.println("\t    z                      z");
            System.out.println("\t      Z                  Z");
            System.out.println("\t         ZZZZZZZZZZZZZZ\n\n");
                break;
            case 4:
            System.out.print("\n\n");
            System.out.println("\t*           *");
            System.out.println("\t*   *   *   *");
            System.out.println("\t*   *   *   *");
            System.out.println("\t*   *   *   *");
            System.out.println("\t  *  * *  *");
            System.out.println("\t     * *");
            System.out.println("\t     * *");
            System.out.println("\t     * *");
            System.out.println("\t     * *");
            System.out.println("\t     * *");
            System.out.println("\t   *  *  *");
            System.out.println("\t   *  *  *");
            System.out.println("\t     * *\n\n");
            default:
                break;
        }
    }

}
