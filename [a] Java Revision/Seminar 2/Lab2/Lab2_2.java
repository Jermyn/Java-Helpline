import java.util.Scanner;

public class Lab2_2
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Key in the number here: ");
        int number1 = read.nextInt();
        
        if (number1%2 != 0)
        {
            System.out.println("This is an odd number.");
        }
        else
        {
            System.out.println("This is an even number.");
        }
    }
}