import java.util.Scanner;

public class Lab2_11
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first side: ");
        int first = input.nextInt();

        System.out.println("Enter second side: ");
        int second = input.nextInt();

        System.out.println("Enter third side: ");
        int third = input.nextInt();
        
        if (first + second <= third || first + third <= second || second + third <= first)
        {
            System.out.println("This cannot be a triangle.");
        }
        else if (first == second && first == third)
        {
            System.out.println("This is an equilateral triangle.");
        }
        else if (first == second || second == third || third == first)
        {
            System.out.println("This is an isoceles triangle.");
        }
        else
        {
            System.out.println("This is a scalene triangle.");
        }
        
    }
}