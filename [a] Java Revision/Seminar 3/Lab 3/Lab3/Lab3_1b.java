import java.util.Scanner;

public class Lab3_1b
{
	public static void main (String [] args)
	{
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the beginning number: ");
		int startNum = read.nextInt();
		System.out.print("Enter the last number: ");
		int endNum = read.nextInt();

		int x = startNum;
		int sum = 0;

		while (x<=endNum)
		{
			sum += x;
			x++;
		}

		System.out.println("The sum of " + startNum + " to " + endNum + " is " + sum);
	}
}