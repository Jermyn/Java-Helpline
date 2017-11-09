import java.util.Scanner;

public class Lab3_2

{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		System.out.print("Enter beginning number: ");
		int startNum = read.nextInt();
		System.out.print("Enter ending number: ");
		int endNum = read.nextInt();
		
		int sum = 0;

		for (int x=startNum; x<=endNum; x++)
		{
			System.out.println(x);
			sum += x;
		}

		System.out.println("The total sum of number from beginning to ending is: " + sum);
	}
}