import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Question3
{
    
    //To record details of staff
        String[] StaffPositionCode = {"T", "M", "S", "J"};//StaffPositionCode[0] will be T

        //To record details of positions and AL entitlement
        String[] positionCode = {"T", "M", "S", "J"};
        int[] numleaves = {52, 28, 21, 14};

        ArrayList<String> StaffNames = new ArrayList<String>();
        ArrayList<Integer> staffNumleaves = new ArrayList<Integer>();

        Scanner input1 = new Scanner(System.in);
        String continue1 = "";
    public static void main (String [] args)
    {
        Scanner reader = new Scanner (System.in);
        int choice = 0;
        do {
            System.out.println("Menu");
            System.out.println("1. Add Staff");
            System.out.println("2. Remove Staff");
            System.out.println("3. Take Leave");
            System.out.println("4. List Staff Leave Details");
            System.out.println("0. Exit");
            System.out.print("Enter option: ");
            choice = reader.nextInt();

            switch (choice)
            {
                case 1:
                addStaff();
            }while (choice != 0);
        }
    } 
    
    public addStaff()
    {

        

        do 
        {
            /*System.out.println("Please enter your name: ");
            name.add(scanner.next());
            System.out.println("Please enter your number: ");
            phone.add(scanner.nextInt());*/                

            System.out.print("Enter name of staff to add: ");
            StaffNames.add(input1.next());
            System.out.print("Enter position code of staff to add (T, M, S or J): ");
            Scanner input2 = new Scanner (System.in);
            String positionInput = input2.nextLine();
            if (positionInput.equalsIgnoreCase("T"))
            {
                for (int i = 0; i < StaffNames.size(); i++)
                {
                    System.out.println("Successfully added " + StaffNames.get(i) + " with " + numleaves[0] + " days of leave");
                }
                continue1 = "yes";
                break;

            }

        } while (continue1.equals("yes"));
        if (continue1.equals("yes")); //want it to go back to start another direcotry here
        else
        {

            System.out.println("Thanks for adding to the directory");

        }

    }
    System.out.println("Closing application");
}
}
