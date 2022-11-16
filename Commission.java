import java.util.*;
public class Commission {
    public static void main(String[] args) {

        Scanner rd = new Scanner (System.in);

        String exitmain;
        String [] depcode={"1","2","3","4"};
        String prod;

        System.out.println("Department Code:");
        System.out.println("[1] - Toy Section");
        System.out.println("[2] - Ladies Wear Section");
        System.out.println("[3] - Mens Wear Section");
        System.out.println("[4] - Kiddie Section");
        System.out.print("Enter Sales Representatives' Name: ");
        String name=rd.nextLine();
        System.out.print("Enter ID Number: ");
        String idnum=rd.next();
        
        do{
        System.out.println("Enter Department Code: ");
        String code=rd.next();

        while (!code.equals(depcode[0])&&!code.equals(depcode[1])&&!code.equals(depcode[2])&&!code.equals(depcode[3])){
            System.out.println("Code is incorrect");
            System.out.print("Enter Department Code: ");
            code=rd.next();
        }

        if (code.equals(depcode[0])){
            Double [] toytotal={300.00,500.00};
            String [] toyprod={"A","B"};
            Double quan,comm;

            do{
                System.out.println("You are in Toy Section");
                System.out.println("Toy Section Available Products and Price");
                System.out.println("[A] - Toy Car    |300.00Php");
                System.out.println("[B] - Stuff Toys |500.00Php");
                System.out.println("Enter product: ");
                prod=rd.next();
                
                while (!prod.equalsIgnoreCase(toyprod[0])&&!prod.equalsIgnoreCase(toyprod[1])){
                    System.out.println("Code is incorrect! Try again.");
                    System.out.println("Enter product: ");
                    prod=rd.next();
                }
                if (prod.equalsIgnoreCase(toyprod[0])){
                    System.out.println("Enter Quantity: ");
                    quan=rd.nextDouble();
                    toytotal[0]*=quan;
                    if ((toytotal[0]>=15000)){
                        comm=toytotal[0]*0.30;
                        System.out.println("Total Amount: "+toytotal[0]);
                        System.out.println("Commission: "+comm);
                    }
                    else if ((toytotal[0]<=15000)&&(toytotal[0]>=10000)){
                        comm=toytotal[0]*0.20;
                        System.out.println("Total Amount: "+toytotal[0]);
                        System.out.println("Commission: "+comm);
                    }
                    else if ((toytotal[0]<=10000)&&(toytotal[0]>=5000)){
                        comm=toytotal[0]*0.10;
                        System.out.println("Total Amount: "+toytotal[0]);
                        System.out.println("Commission: "+comm);
                    }
                    else {
                        comm=toytotal[0]*0;
                        System.out.println("Total Amount: "+toytotal[0]);
                        System.out.println("Commission: "+comm);
                    }
                }
                else if (prod.equalsIgnoreCase(toyprod[1])){
                    System.out.println("Enter Quantity: ");
                    quan=rd.nextDouble();
                    toytotal[1]*=quan;
                if ((toytotal[1]>=15000))
                {
                    comm=toytotal[1]*0.30;
                    System.out.println("Total Amount: "+toytotal[1]);
                    System.out.println("Commission: "+comm);
                }
                else if ((toytotal[1]<=15000)&&(toytotal[1]>=10000))
                {
                    comm=toytotal[1]*0.20;
                    System.out.println("Total Amount: "+toytotal[1]);
                    System.out.println("Commission: "+comm);
                }
                else if ((toytotal[1]<=10000)&&(toytotal[1]>=5000))
                {
                    comm=toytotal[1]*0.10;
                    System.out.println("Total Amount: "+toytotal[1]);
                    System.out.println("Commission: "+comm);
                }
                else 
                {
                    comm=toytotal[1]*0;
                    System.out.println("Total Amount: "+toytotal[1]);
                    System.out.println("Commission: "+comm);
                }
            }
            else 
            {
                System.out.println("Error.");
            }
            System.out.println("Make another transaction in Toy section? <yes/no>");
            exitmain=rd.next();
            }while(exitmain.equalsIgnoreCase("yes"));
        }
        else if (code.equals(depcode[1]))
        {
            Double [] LWtotal={799.00,599.00,499.00};
            String [] LWprod={"A","B","C"};
            Double quan,comm;

            do
            {
            System.out.println("You are in Ladies Wear Section");
            System.out.println("Ladies Wear Section Available Products and Price");
            System.out.println("[A] - Pants     |799.00Php");
            System.out.println("[B] - Blouse    |599.00Php");
            System.out.println("[C] - Underwear |499.00Php");

            System.out.println("Enter product: ");
            prod=rd.next();

            while (!prod.equalsIgnoreCase(LWprod[0])&&!prod.equalsIgnoreCase(LWprod[1])&&!prod.equalsIgnoreCase(LWprod[2]))
            {
                System.out.println("Code is incorrect! Try again.");
                System.out.println("Enter product: ");
                prod=rd.next();
            }
            if (prod.equalsIgnoreCase(LWprod[0]))
            {
                System.out.println("Enter Quantity: ");
                quan=rd.nextDouble();
                LWtotal[0]*=quan;
                if ((LWtotal[0]>=15000))
                {
                    comm=LWtotal[0]*0.30;
                    System.out.println("Total Amount: "+LWtotal[0]);
                    System.out.println("Commission: "+comm);
                }
                else if ((LWtotal[0]<=15000)&&(LWtotal[0]>=10000))
                {
                    comm=LWtotal[0]*0.20;
                    System.out.println("Total Amount: "+LWtotal[0]);
                    System.out.println("Commission: "+comm);
                }
                else if ((LWtotal[0]<=10000)&&(LWtotal[0]>=5000))
                {
                    comm=LWtotal[0]*0.10;
                    System.out.println("Total Amount: "+LWtotal[0]);
                    System.out.println("Commission: "+comm);
                }
                else 
                {
                    comm=LWtotal[0]*0;
                    System.out.println("Total Amount: "+LWtotal[0]);
                    System.out.println("Commission: "+comm);
                }
            }
            else if (prod.equalsIgnoreCase(LWprod[1]))
            {
                System.out.println("Enter Quantity: ");
                quan=rd.nextDouble();
                LWtotal[1]*=quan;
                if ((LWtotal[1]>=15000))
                {
                    comm=LWtotal[1]*0.30;
                    System.out.println("Total Amount: "+LWtotal[1]);
                    System.out.println("Commission: "+comm);
                }
                else if ((LWtotal[1]<=15000)&&(LWtotal[1]>=10000))
                {
                    comm=LWtotal[1]*0.20;
                    System.out.println("Total Amount: "+LWtotal[1]);
                    System.out.println("Commission: "+comm);
                }
                else if ((LWtotal[1]<=10000)&&(LWtotal[1]>=5000))
                {
                    comm=LWtotal[1]*0.10;
                    System.out.println("Total Amount: "+LWtotal[1]);
                    System.out.println("Commission: "+comm);
                }
                else 
                {
                    comm=LWtotal[1]*0;
                    System.out.println("Total Amount: "+LWtotal[1]);
                    System.out.println("Commission: "+comm);
                }
            }
            else if (prod.equalsIgnoreCase(LWprod[2]))
            {
                System.out.println("Enter Quantity: ");
                quan=rd.nextDouble();
                LWtotal[2]*=quan;
                if ((LWtotal[2]>=15000))
                {
                    comm=LWtotal[2]*0.30;
                    System.out.println("Total Amount: "+LWtotal[2]);
                    System.out.println("Commission: "+comm);
                }
                else if ((LWtotal[2]<=15000)&&(LWtotal[2]>=10000))
                {
                    comm=LWtotal[2]*0.20;
                    System.out.println("Total Amount: "+LWtotal[2]);
                    System.out.println("Commission: "+comm);
                }
                else if ((LWtotal[2]<=10000)&&(LWtotal[2]>=5000))
                {
                    comm=LWtotal[2]*0.10;
                    System.out.println("Total Amount: "+LWtotal[2]);
                    System.out.println("Commission: "+comm);
                }
                else 
                {
                    comm=LWtotal[2]*0;
                    System.out.println("Total Amount: "+LWtotal[2]);
                    System.out.println("Commission: "+comm);
                }
            }
            else 
            {
                System.out.println("Error.");
            }
            System.out.println("Make another transaction in Ladies Wear section? <yes/no>");
            exitmain=rd.next();
            }while(exitmain.equalsIgnoreCase("yes"));
        }
        else if (code.equals(depcode[2]))
        {
            Double [] MWtotal={249.00,349.00,199.00};
            String [] MWprod={"A","B","C"};
            Double quan,comm;

            do
            {
            System.out.println("You are in Men Wear Section");
            System.out.println("Men Wear Section Available Products and Price");
            System.out.println("[A] - Necktie    |249.00Php");
            System.out.println("[B] - T-Shirt    |349.00Php");
            System.out.println("[C] - Belt       |199.00Php");

            System.out.println("Enter product: ");
            prod=rd.next();

            while (!prod.equalsIgnoreCase(MWprod[0])&&!prod.equalsIgnoreCase(MWprod[1])&&!prod.equalsIgnoreCase(MWprod[2]))
            {
                System.out.println("Code is incorrect! Try again.");
                System.out.println("Enter product: ");
                prod=rd.next();
            }
            if (prod.equalsIgnoreCase(MWprod[0]))
            {
                System.out.println("Enter Quantity: ");
                quan=rd.nextDouble();
                MWtotal[0]*=quan;
                if ((MWtotal[0]>=15000))
                {
                    comm=MWtotal[0]*0.30;
                    System.out.println("Total Amount: "+MWtotal[0]);
                    System.out.println("Commission: "+comm);
                }
                else if ((MWtotal[0]<=15000)&&(MWtotal[0]>=10000))
                {
                    comm=MWtotal[0]*0.20;
                    System.out.println("Total Amount: "+MWtotal[0]);
                    System.out.println("Commission: "+comm);
                }
                else if ((MWtotal[0]<=10000)&&(MWtotal[0]>=5000))
                {
                    comm=MWtotal[0]*0.10;
                    System.out.println("Total Amount: "+MWtotal[0]);
                    System.out.println("Commission: "+comm);
                }
                else 
                {
                    comm=MWtotal[0]*0;
                    System.out.println("Total Amount: "+MWtotal[0]);
                    System.out.println("Commission: "+comm);
                }
            }
            else if (prod.equalsIgnoreCase(MWprod[1]))
            {
                System.out.println("Enter Quantity: ");
                quan=rd.nextDouble();
                MWtotal[1]*=quan;
                if ((MWtotal[1]>=15000))
                {
                    comm=MWtotal[1]*0.30;
                    System.out.println("Total Amount: "+MWtotal[1]);
                    System.out.println("Commission: "+comm);
                }
                else if ((MWtotal[1]<=15000)&&(MWtotal[1]>=10000))
                {
                    comm=MWtotal[1]*0.20;
                    System.out.println("Total Amount: "+MWtotal[1]);
                    System.out.println("Commission: "+comm);
                }
                else if ((MWtotal[1]<=10000)&&(MWtotal[1]>=5000))
                {
                    comm=MWtotal[1]*0.10;
                    System.out.println("Total Amount: "+MWtotal[1]);
                    System.out.println("Commission: "+comm);
                }
                else 
                {
                    comm=MWtotal[1]*0;
                    System.out.println("Total Amount: "+MWtotal[1]);
                    System.out.println("Commission: "+comm);
                }
            }
            else if (prod.equalsIgnoreCase(MWprod[2]))
            {
                System.out.println("Enter Quantity: ");
                quan=rd.nextDouble();
                MWtotal[2]*=quan;
                if ((MWtotal[2]>=15000))
                {
                    comm=MWtotal[2]*0.30;
                    System.out.println("Total Amount: "+MWtotal[2]);
                    System.out.println("Commission: "+comm);
                }
                else if ((MWtotal[2]<=15000)&&(MWtotal[2]>=10000))
                {
                    comm=MWtotal[2]*0.20;
                    System.out.println("Total Amount: "+MWtotal[2]);
                    System.out.println("Commission: "+comm);
                }
                else if ((MWtotal[2]<=10000)&&(MWtotal[2]>=5000))
                {
                    comm=MWtotal[2]*0.10;
                    System.out.println("Total Amount: "+MWtotal[2]);
                    System.out.println("Commission: "+comm);
                }
                else 
                {
                    comm=MWtotal[2]*0;
                    System.out.println("Total Amount: "+MWtotal[2]);
                    System.out.println("Commission: "+comm);
                }
            }
            else 
            {
                System.out.println("Error.");
            }
            System.out.println("Make another transaction in Mens Wear section? <yes/no>");
            exitmain=rd.next();
            }while(exitmain.equalsIgnoreCase("yes"));
        }
        else if (code.equals(depcode[3]))
        {
            Double [] Kidtotal={99.00,899.00};
            String [] Kidprod={"A","B"};
            Double quan,comm;

            do
            {
            System.out.println("You are in Kiddie Section");
            System.out.println("Kiddie Section Available Products and Price");
            System.out.println("[A] - Milk Bottle    |99.00Php");
            System.out.println("[B] - Walker         |899.00Php");

            System.out.println("Enter product: ");
            prod=rd.next();

            while (!prod.equalsIgnoreCase(Kidprod[0])&&!prod.equalsIgnoreCase(Kidprod[1]))
            {
                System.out.println("Code is incorrect! Try again.");
                System.out.println("Enter product: ");
                prod=rd.next();
            }
            if (prod.equalsIgnoreCase(Kidprod[0]))
            {
                System.out.println("Enter Quantity: ");
                quan=rd.nextDouble();
                Kidtotal[0]*=quan;
                if ((Kidtotal[0]>=15000))
                {
                    comm=Kidtotal[0]*0.30;
                    System.out.println("Total Amount: "+Kidtotal[0]);
                    System.out.println("Commission: "+comm);
                }
                else if ((Kidtotal[0]<=15000)&&(Kidtotal[0]>=10000))
                {
                    comm=Kidtotal[0]*0.20;
                    System.out.println("Total Amount: "+Kidtotal[0]);
                    System.out.println("Commission: "+comm);
                }
                else if ((Kidtotal[0]<=10000)&&(Kidtotal[0]>=5000))
                {
                    comm=Kidtotal[0]*0.10;
                    System.out.println("Total Amount: "+Kidtotal[0]);
                    System.out.println("Commission: "+comm);
                }
                else 
                {
                    comm=Kidtotal[0]*0;
                    System.out.println("Total Amount: "+Kidtotal[0]);
                    System.out.println("Commission: "+comm);
                }
            }
            else if (prod.equalsIgnoreCase(Kidprod[1]))
            {
                System.out.println("Enter Quantity: ");
                quan=rd.nextDouble();
                Kidtotal[1]*=quan;
                if ((Kidtotal[1]>=15000))
                {
                    comm=Kidtotal[1]*0.30;
                    System.out.println("Total Amount: "+Kidtotal[1]);
                    System.out.println("Commission: "+comm);
                }
                else if ((Kidtotal[1]<=15000)&&(Kidtotal[1]>=10000))
                {
                    comm=Kidtotal[1]*0.20;
                    System.out.println("Total Amount: "+Kidtotal[1]);
                    System.out.println("Commission: "+comm);
                }
                else if ((Kidtotal[1]<=10000)&&(Kidtotal[1]>=5000))
                {
                    comm=Kidtotal[1]*0.10;
                    System.out.println("Total Amount: "+Kidtotal[1]);
                    System.out.println("Commission: "+comm);
                }
                else 
                {
                    comm=Kidtotal[1]*0;
                    System.out.println("Total Amount: "+Kidtotal[1]);
                    System.out.println("Commission: "+comm);
                }
            }
            else 
            {
                System.out.println("Error.");
            }
            System.out.println("Make another transaction in Kiddie section? <yes/no>");
            exitmain=rd.next();
            }while(exitmain.equalsIgnoreCase("yes"));
        }
        System.out.println("Would you like to make another transaction? <yes/no>");
        exitmain=rd.next();
        }while(exitmain.equalsIgnoreCase("yes"));
        System.out.println("Thank you!");


    }
} 
    

