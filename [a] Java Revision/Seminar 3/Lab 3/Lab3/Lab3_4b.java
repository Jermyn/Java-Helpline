public class Lab3_4b
{
	public static void main (String args[])
	{
		int i = 0;

		while (i<16)
		{
			if ( i % 3 == 0 )
			System.out.println( i);
			else
			System.out.print( i );
			System.out.print('^');

			i += 2;
		}

	}
}