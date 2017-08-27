import java.util.Scanner;

public class Question1_b
{
    public static void main (String [] args)
    {
        Scanner input1 = new Scanner (System.in);

        int choice = 0;

        System.out.println("Choose the type of monthly pass");
        System.out.println("1 - Primary Student");
        System.out.println("2 - Secondary Student");
        System.out.println("3 - Polytechnic Student");
        System.out.println("4 - University Student");
        System.out.println("5 - Full-Time National Serviceman");
        System.out.println("6 - Adult");
        System.out.println("7 - Senior Citizen");
        System.out.println("8 - Person with Disability");
        System.out.print("Your choice: ");
        choice = input1.nextInt();

        if (choice == 0)
        {
            System.out.println("Invalid type of person");
        }
        else 
        {

            switch (choice)
            {
                case 1: case 2: case 3: case 4: case 5: 
                System.out.println("Enter the type of monthly pass");
                System.out.println("B - Bus");
                System.out.println("T- Train");
                System.out.println("H - Hybrid (Bus and Train)");

                Scanner input2 = new Scanner (System.in);
                System.out.print("Your choice: ");
                String mthpasschoice = input2.nextLine();

                if (mthpasschoice.equalsIgnoreCase("B") && choice==1)
                {
                    System.out.print("Cost of pass = $22.50");                   
                }
                if (mthpasschoice.equalsIgnoreCase("T") && choice==1)
                {
                    System.out.print("Cost of pass = $20.00");                   
                }
                if (mthpasschoice.equalsIgnoreCase("H") && choice==1)
                {
                    System.out.print("Cost of pass = $41.00");                   
                }
                if (mthpasschoice.equalsIgnoreCase("B") && choice==2)
                {
                    System.out.print("Cost of pass = $27.50");                   
                }
                if (mthpasschoice.equalsIgnoreCase("T") && choice==2)
                {
                    System.out.print("Cost of pass = $25.00");                   
                }
                if (mthpasschoice.equalsIgnoreCase("H") && choice==2)
                {
                    System.out.print("Cost of pass = $51.00");            
                }
                if (mthpasschoice.equalsIgnoreCase("B") && choice==3)
                {
                    System.out.print("Cost of pass = $27.50");                   
                }
                if (mthpasschoice.equalsIgnoreCase("T") && choice==3)
                {
                    System.out.print("Cost of pass = $25.00");                   
                }
                if (mthpasschoice.equalsIgnoreCase("H") && choice==3)
                {
                    System.out.print("Cost of pass = $51.00");                   
                }
                if (mthpasschoice.equalsIgnoreCase("B") && choice==4)
                {
                    System.out.print("Cost of pass = $52.00");                   
                }
                if (mthpasschoice.equalsIgnoreCase("T") && choice==4)
                {
                    System.out.print("Cost of pass = $45.00");                   
                }
                if (mthpasschoice.equalsIgnoreCase("H") && choice==4)
                {
                    System.out.print("Cost of pass = $85.00");                   
                }
                if (mthpasschoice.equalsIgnoreCase("B") && choice==5)
                {
                    System.out.print("Cost of pass = $52.00");                   
                }
                if (mthpasschoice.equalsIgnoreCase("T") && choice==5)
                {
                    System.out.print("Cost of pass = $45.00");                   
                }
                if (mthpasschoice.equalsIgnoreCase("H") && choice==5)
                {
                    System.out.print("Cost of pass = $85.00");                   
                }
else
                {
                    System.out.print("Invalid type of pass");                         
                }
            }
            if (choice==6)
            {
                System.out.print("Cost of pass = $120.00");
            }
            if (choice==7 || choice==8)
            {
                System.out.print("Cost of pass = $60.00");
            }
        }
        System.out.println("\nStudent name: Wang Yuet Hua Jennifer");
        System.out.println("Student number: B1571734");
    }
}
