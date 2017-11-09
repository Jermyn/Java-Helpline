import java.util.Scanner;

public class Lab2_9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Pls key in age: ");
        int age = input.nextInt();
        input.nextLine();
        
        if (age <16)
        {
            System.out.println("Can watch PG movies");
        }
        else if (age < 18)
        {
            System.out.println("Can watch NC16 movies");
        }
        else if (age < 21)
        {
            System.out.println("Can watch M18 movies");
        }
        else
        {
            System.out.println("Can watch RA movies");
        }
    }
}