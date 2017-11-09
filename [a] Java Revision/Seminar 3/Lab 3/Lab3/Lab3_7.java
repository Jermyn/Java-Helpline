import java.util.Scanner;

public class Lab3_7
{
	public static void main (String args[])
	{
		Scanner read = new Scanner (System.in);
		int optionChoice=0;

		do
		{
			System.out.println("\t Menu");
			System.out.println("1. Option 1");
			System.out.println("2. Option 2");
			System.out.println("3. Option 3");
			System.out.println("4. Quit");
			System.out.print("Enter choice: ");
			optionChoice = read.nextInt();

			switch (optionChoice)
			{
				case 1:
				case 2:
				case 3:
				System.out.println("Option " + optionChoice + " selected");
				break;
				case 4:
				break;

				default: System.out.println("Please select valid option");
			}
		}

		while (optionChoice != 4);
		
		System.out.println("End of program");

	}
}