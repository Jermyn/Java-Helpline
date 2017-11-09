import java.util.Scanner;

public class Lab2_1

{
    public static void main(String[] args)
    {
        Scanner input1 = new Scanner(System.in);

        System.out.print("What is the first number? ");
        int num1 = input1.nextInt();
        input1.nextLine(); // to clear buffer

        System.out.print("What is the second number? ");
        Scanner input2 = new Scanner(System.in);
        int num2 = input2.nextInt();

        if (num1 == num2)
        {
            System.out.println("The 2 numbers are the same");
        }
        else
        {
            System.out.println("The 2 numbers are not the same");
        }

    }
}