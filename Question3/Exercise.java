import java.util.Scanner;
public class Exercise
{
    public static void main(String [] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter no. of students: ");
        int numStudents = console.nextInt();          
        console.nextLine();

        //declare 2 arrays, a string array for name
        String[] names = new String[numStudents];
        //int arrays for marks
        int[] marks = new int[numStudents];

        for(int n=0; n<numStudents; n++)
        {
            System.out.println("Enter name: ");
            names[n] = console.nextLine();
            System.out.println("Enter mark: ");
            marks[n] = console.nextInt();
            console.nextLine(); //to clear the buffer
        }

        //Display the name and marks side by side
        //e.g. John 75
        for(int n=0; n< numStudents; n++)
        {
            System.out.println(names[n] + " " + marks[n]);
        }

        //display the name and the marks of the student with the highest mark
        int maxIndex = 0;
        /*The not so good method: String name = names[0];
        int max = marks[0];
        for(int n=1; n<numStudents; n++)
        {
            if (marks[n] > max)
            {
                max = marks[n];
                name = names[n];
            }
        }*/
        for(int n=1; n<numStudents; n++)
        {
            if (marks[n] > marks[maxIndex])
            {
                maxIndex = n;
            }
        }
        System.out.println("Max Marks is :" + marks[maxIndex] + "and he/she is" + names[maxIndex]);

        /*
        System.out.println("Enter no. of students: ");
        int numStudents = console.nextInt();
        int [] marks = new int[numStudents];
        int highest = 0;
        int sum = 0;
        for (int n=0; n<numStudents; n++)
        {
        System.out.print("Enter mark for student "+n+": ");
        marks[n] = console.nextInt();
        sum = sum + marks[n];

        if (marks[n]> highest)
        highest = marks[n];
        }

        System.out.println("Marks :");
        for(int n=0; n<numStudents; n++)
        {
        System.out.print( marks[n] + " " );
        if (marks[n] < 50)
        {
        System.out.println("F");
        }
        else
        {
        System.out.println("P");
        }
        }

        System.out.println("Highest mark is :"+highest);
        System.out.println("Avg mark is :"+((double)sum/numStudents));*/
    }
}
