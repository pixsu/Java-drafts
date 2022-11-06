//ATM with loops 
import java.util.*;

public class AtmSwitchLoop{
  
  public static void main (String[] args){

    Scanner sc = new Scanner(System.in);

   double balance = 1000;

   System.out.print("Enter PIN: ");
   int pin = sc.nextInt();

   while(pin!=123456){
   System.out.println("**Invalid PIN**");
   System.out.println();
   System.out.print("Enter PIN: ");
   pin = sc.nextInt();
   }

        if(pin==123456){
        System.out.println();
        System.out.println("**Access granted**");
        System.out.println();

   while(true) {
   System.out.println("Choose Transaction: ");
   System.out.println("[W]- Withdraw");
   System.out.println("[D]- Deposit");
   System.out.println("[C]- Check balance");
   System.out.print("Enter here: ");
   String choose = sc.next();

   switch(choose){

     case "W":
     case "w":
         System.out.println("How much would you like to withdraw? ");
         double w = sc.nextDouble();
             if(w>balance){
             System.out.println("**Insufficient balance**");
             System.out.println();
             }
             else{  
             double w1 = balance - w;
             System.out.println(w+" was withdrawn");
             System.out.println("Your remaining balance is: "+w1);
             System.out.println("Thank you for banking with us!");
             System.out.println();
             System.exit(pin);
             }
    break;
    
    case "D":
    case "d":
        System.out.println("How much would you like to deposit? ");
        double d = sc.nextDouble();
        double d1 = balance + d;
        System.out.println(d+" was added");
        System.out.println("Your remaining balance is: "+d1);
        System.out.println("Thank you for banking with us!");
        System.out.println();
        System.exit(pin);
    break;

    case "C":
    case "c":
        System.out.println("Your remaining balance is: "+balance);
        System.out.println();
   
    break;

    default:
       System.out.println();
       System.out.println("**Invalid input**");
       System.out.println();
    break;
   }
  }
  }


  }
}
//Create a program that will process a basic transaction of an ATM. The program must have a withdrawal, deposit, and checking of balance. The default PIN is “123456”, the default cash on account is: 1000. 
//One transaction per execution of program to test. The program must test if the PIN is correct, it also check if the amount to withdraw is less than or equal to the current cash on account. 
//You can create your own message per test cases like: “Insufficient Fund”, “Incorrect PIN” etc
