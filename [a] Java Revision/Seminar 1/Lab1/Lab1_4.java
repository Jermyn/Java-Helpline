
public class Lab1_4
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(args[0]);
        
        int firstDigit = num / 100;
        int secondDigit = (num % 100) / 10;
        int thirdDigit = num % 10;
        
        int sum = firstDigit + secondDigit + thirdDigit;
        
        System.out.println("Sum of the 3 digits " + firstDigit + ", " + secondDigit + " and " + thirdDigit + " is " + sum + ".");
    }
}