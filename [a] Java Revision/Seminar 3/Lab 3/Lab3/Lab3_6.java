import java.util.Scanner;

public class Lab3_6
{
    public static void main (String args[])
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = read.nextInt();
        read.nextLine();

        for (int x=1; x <= number; x++)
        {
        	System.out.println(x + " x " + number + " = " + x*number);
        }
    }
}