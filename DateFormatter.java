import java.util.*;
public class DateFormatterSwitch {
    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter Month number: ");
      int month = sc.nextInt();
      System.out.print("Enter Date: ");
      int date = sc.nextInt();
      System.out.print("Enter Year: ");
      int year = sc.nextInt();

      String monthWord = "";
     
      switch (month) {
         case 1:
           monthWord = "January";
           break;
         case 2:
           monthWord = "February";
           break;
         case 3:
           monthWord = "March";
           break;
         case 4:
           monthWord = "April";
           break;
         case 5:
           monthWord = "May";
           break;
         case 6:
           monthWord = "June";
           break;
         case 7:
           monthWord = "July";
           break;
         case 8:  
           monthWord = "August";
           break;
         case 9:
           monthWord = "September";
           break;
         case 10:
           monthWord = "October";
           break;
         case 11:
           monthWord = "November";
           break;
         case 12:  
           monthWord = "December";
           break;
         default: 
         //no statement/condition after the "default: " is fine
      }

      if(monthWord.equals("")) 
      System.out.println("Month is invalid");
      else  {
        if(date>31 || date<0) 
        System.out.println("Date Invalid");
        else 
        System.out.println(monthWord+" "+ date+", "+year);
      }


    }
   }
//Date Formatter
//Create a program that will make the user input Month, Date, and Year as integers then use switch statements and concatenation to display it in this format:
/*Sample output:
 * Month: 1
 * Date: 13
 * Year: 2020
 * 
 * January 13, 2020
 */
// tell the user if the month or date is invalid using conditional statements
    
   
    
