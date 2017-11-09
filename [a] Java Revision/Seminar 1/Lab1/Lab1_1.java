
public class Lab1_1
{
    public static void main(String[] args)
    {
        double num1 = Double.parseDouble(args [0]);
        double num2 = Double.parseDouble(args [1]);
        double num3 = Double.parseDouble(args [2]);
        
        double sum = num1 + num2 + num3;
        
        System.out.printf("Total sum is " + "%5.2f.\n", sum); //.\n is to add fullstop & newline/linefeed
        
        double avg = sum/3;
        
        System.out.printf("Average of the 3 numbers is " + "%5.2f.\n", avg);
        
    }
}
