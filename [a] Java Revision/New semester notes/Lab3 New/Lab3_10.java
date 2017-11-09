import java.util.*;

public class Lab3_10
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int answer = (int)(Math.random() * 100) + 1;
        System.out.println(answer); //print out the answer to help
        int count = 0;
        
        while (true)
        {
            System.out.print("Enter your guess: ");
            int guess = console.nextInt();
            count++;
            if ( guess==answer)
            {
                System.out.println("You got it in " + count + " tries!");
                System.out.print("Continue (y/n)? ");
                console.nextLine(); //to clear buffer from nextInt();
                String reply = console.nextLine();
                if ( ! reply.equals("y") )
                    break;
                else
                {
                    answer = (int)(Math.random() * 100) +1;
                    count=0;
                }
            }
            else if (guess < answer)
                System.out.println("Too low. Try again!");
            else
                System.out.println("Too high. Try again!");
        }
    }
}