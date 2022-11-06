import java.util.Scanner; 
public class LeapYearOrNot {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a year : ");
      int year = sc.nextInt();

// %(modulo) = mod or remainder
      if (year % 4 == 0) {
            if (year % 100 == 0)  {
                 if (year % 400 == 0)   
                 System.out.println("A leap year");
                 else 
                 System.out.println("Not a leap year");
                 }
            else 
            System.out.println("A leap year");
      }
      else 
         System.out.println("Not a leap year");
 
   }
}
// a leap year happens every four years / if february has 29 days instead of 28 it means the year have 366 days
