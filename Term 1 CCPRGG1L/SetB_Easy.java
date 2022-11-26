import java.util.*;
public class SetB_Easy {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double units;

        System.out.print("Hi, Freshmen, What's your name?: ");
        String name = sc.nextLine();
        System.out.println("Here's our courses: ");
        System.out.println("Press 1 for BSIT (Bachelor of Science in Instant tunganga)");
        System.out.println("Press 2 for BSAB (Bachelor of Science in Antay Biyaya)");
        System.out.println("Press 3 for BSTM (Bachelor of Science in Tiktok magdamag)");
        System.out.println("Press 4 for BSFAM (Bachelor of Science in Forever Asa sa Magulang)");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        while(choice!=1 && choice !=2 && choice!=3 && choice!=4){
            System.out.println("Invalid input");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
        }

        switch(choice){

            case 1:
            System.out.println("You chose BSIT.");
            System.out.println("The enrollment price is 1500");
            System.out.println("The cost pet unit is 167");
            System.out.println("Max available units per term is 34");
            System.out.println("Enter number of units to take: ");
            units = sc.nextDouble();

            while(units>34 || units<0){
                System.out.println("Invalid input, try again");
                System.out.println("Enter number of units to take: ");
                units = sc.nextDouble();
            }
            if(units<=34 && units>0){
            double totalunits = 1500 +(167 * units);
            System.out.println("Total costing will be: 1500 + (167*"+units+") ="+totalunits);
            System.out.println("Thank you for enrolling "+name+" and welcome to college of BSIT");
            System.exit(0);
            }
            else{
                System.out.println("Invalid input, try again");
            }
            break;

            case 2:
            System.out.println("You chose BSAB.");
            System.out.println("The enrollment price is 1200");
            System.out.println("The cost pet unit is 125");
            System.out.println("Max available units per term is 22");
            System.out.println("Enter number of units to take: ");
            units = sc.nextDouble();

            while(units>22 || units<0){
                System.out.println("Invalid input, try again");
                System.out.println("Enter number of units to take: ");
                units = sc.nextDouble();
            }
            if(units<=22 && units>0){
            double totalunits = 1200 +(125 * units);
            System.out.println("Total costing will be: 1200 + (125*"+units+") ="+totalunits);
            System.out.println("Thank you for enrolling "+name+" and welcome to college of BSAB");
            System.exit(0);
            }
            else{
                System.out.println("Invalid input, try again");
            }
            break;

            case 3:
            System.out.println("You chose BSTM.");
            System.out.println("The enrollment price is 1750");
            System.out.println("The cost pet unit is 220");
            System.out.println("Max available units per term is 24");
            System.out.println("Enter number of units to take: ");
            units = sc.nextDouble();

            while(units>24 || units<0){
                System.out.println("Invalid input, try again");
                System.out.println("Enter number of units to take: ");
                units = sc.nextDouble();
            }
            if(units<=24 && units>0){
            double totalunits = 1750 +(220 * units);
            System.out.println("Total costing will be: 1750 + (220*"+units+") ="+totalunits);
            System.out.println("Thank you for enrolling "+name+" and welcome to college of BSTM");
            System.exit(0);
            }
            else{
                System.out.println("Invalid input, try again");
            }
            break;

            case 4:
            System.out.println("You chose BSFAM.");
            System.out.println("The enrollment price is 2800");
            System.out.println("The cost pet unit is 150");
            System.out.println("Max available units per term is 27");

            System.out.println("Enter number of units to take: ");
            units = sc.nextDouble();

            while(units>27 || units<0){
                System.out.println("Invalid input, try again");
                System.out.println("Enter number of units to take: ");
                units = sc.nextDouble();
            }
            if(units<=27 && units>0){
            double totalunits = 2800 +(150 * units);
            System.out.println("Total costing will be: 2800 + (150*"+units+") ="+totalunits);
            System.out.println("Thank you for enrolling "+name+" and welcome to college of BSTM");
            System.exit(0);
            }
            else{
                System.out.println("Invalid input, try again");
            }
            break;

            default:
            System.out.println("Invalid input");
            break;
        }
/*
 * Write a program which will work like an enrollment system
 * 
 *Given: 
*   Course   |  Enrollment Price  |  Cost per unit  |  Max Units |
*   BSIT     |      1500          |       167       |     34     |
*   BSAB     |      1200          |       125       |     22     |
*   BSTM     |      1750          |       220       |     24     |
*   BSFAM    |      2800          |       150       |     27     |
*
*Output:
* Hi freshmen, What's your name? Gelo (inputted)
* Here's our courses:
* Press 1 for BSIT(Bachelor of Science in Instant Tunganga)
* Press 2 for BSAB(Bachelor of Science in Antay Biyaya)
* Press 3 for BSTM(Bachelor of Science in Tiktok Magdamag)
* Press 4 for BSFARM(Bachelor of Science in Forever Asa Sa Magulang)
* Enter your choice: 2 (inputted)
* You choose BSAB
* The enrollment price is 1200
* The cost per unit is 125
* Max available units per term is 22
* 
* Enter number of units to take: 21(inputted)
* Total costing will be: 1200 + (125*21) = 3825
* Thank you for enrolling Gelo and welcome to college of BSAB
*/

    }
}
