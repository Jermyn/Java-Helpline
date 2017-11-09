import java.util.Scanner;

public class Lab2_10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter operator (+, -, *, /): ");
        String s = input.nextLine();

        System.out.println("Enter value1: ");
        double value1 = input.nextDouble();

        System.out.println("Enter value2: ");
        double value2 = input.nextDouble();
        
        double answer = 0;
        
        switch (s)
        {
            case "+": answer = value1 + value2;
            break;
            
            case "-": answer = value1 - value2;
            break;
            
            case "*": answer = value1 * value2;
            break;
            
            case "/": answer = value1 / value2;
            break;
        }
        System.out.printf("Result of " + value1 + " " + s + " " + value2 + " = " + answer);
    
    }
}