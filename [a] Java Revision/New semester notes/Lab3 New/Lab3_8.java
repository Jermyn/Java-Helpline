import java.util.Scanner;

public class Lab3_8
{
    public static void main (String [] args)
    {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter String: ");
        String textInput = read.nextLine();

        System.out.print("Number of times to repeat: ");
        
        int numTimes = read.nextInt();
        read.nextLine();

        for (int i=1; i <= numTimes; i++)
        {
            System.out.println(textInput);
        }

    }
}