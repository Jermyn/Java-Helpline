import java.util.Scanner;

public class Lab3_3
{
	public static void main (String [] args)
	{
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the beginning number: ");
		int startNum = read.nextInt();
		System.out.print("Enter the last number: ");
		int endNum = read.nextInt();

		int temp;

		if (startNum > endNum)
		{
			temp = startNum;
			startNum = endNum;
			endNum = temp;
		}

		int x = startNum;

		while (x<=endNum)
		{
			System.out.println(x);
			x++;
		}
	}
}