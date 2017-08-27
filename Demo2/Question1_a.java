//import java.util.Scanner;

public class Question1_a
{
    public static void main(String args[])
    {
        System.out.println("Student name: Wang Yuet Hua Jennifer");
        System.out.println("Student number: B1571734");

        int output;

        //Scanner input1 = new Scanner(System.in);
        int num1 =  Integer.parseInt(args[0]);

        int x1 = num1 / 100;
        int x2 = (num1 % 100)/10;
        int x3 = num1 % 10;

        System.out.println("  " + x1 + " " + x2 + " " + x3);

        //Scanner input2 = new Scanner(System.in);
        int num2 =  Integer.parseInt(args[1]);

        int y1 = num2 / 100;
        int y2 = (num2 % 100)/10;
        int y3 = num2 % 10;

        System.out.println("- " + y1 + " " + y2 + " " + y3);
        System.out.println("---------");

        output = num1 - num2;

        int o1 = output / 100;
        int o2 = (output % 100)/10;
        int o3 = output % 10;

        System.out.println("  " + o1 + " " + o2 + " " + o3);
    }
}
