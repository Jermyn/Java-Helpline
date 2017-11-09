import java.util.Scanner;

public class Lab2_5
{
    public static void main(String[] args)

    {
        Scanner input1 = new Scanner(System.in);
        System.out.print("What is the grade for the coursework?");
        int coursework = input1.nextInt();
        input1.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.print("What is the grade for the exam?");
        int exams = input2.nextInt();
        input2.nextLine();

        if (coursework >= 40 && exams >= 40 && coursework+exams>=100)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
