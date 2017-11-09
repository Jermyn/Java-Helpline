import java.util.Scanner;

public class Lab2_3
{
    public static void main(String[] args)
    {
        Scanner choice = new Scanner(System.in);
        System.out.print("What is your choice plan? C/F ");
        String choicePlan = choice.nextLine();

        Scanner age = new Scanner(System.in);
        System.out.print("What is your age? ");
        int agePlan = age.nextInt();

        double price;
        
        if(choicePlan.equalsIgnoreCase("c"))
        {
            price = 15.00;
        }
        else if(choicePlan.equalsIgnoreCase("f"))
        {
            price = 28.00;
        }
        else {
            price = 0.0;
        }
        
        if(agePlan <= 16)
        {
            price = price * 0.8;
        }
        
        System.out.println("The total cost is " + price);

    }
}