import java.util.Scanner;

public class Lab3_5
{
    public static void main (String args[])
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input1 = read.nextLine();

        System.out.print("Enter how many times to repeat");
        int times = read.nextInt();
        read.nextLine();

        for (int x=1; x <= times; x++)
        {
        	System.out.println(input1);
        }
    }
}