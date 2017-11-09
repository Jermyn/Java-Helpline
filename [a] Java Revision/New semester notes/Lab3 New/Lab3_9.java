public class Lab3_9

{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        //first pattern
        for ( int i=n; i>=1; i--)
        {
            for ( int j=1; j<=i; j++)
                System.out.print("+");
            System.out.println();
        }
        //Second pattern
        for ( int i = 1; i<=n; i++)
        {
            for (int j=1; j<=n; j++)
            {
                if(i==j)
                    System.out.print("X");
                else
                    System.out.print("+");
            }
            System.out.println();
        }
        //Pattern 3
        for ( int i=1; i<=5; i++)
        {
            for (int j=0; j<5; j++)
                System.out.print( (i+j) );
            System.out.println();
        }
    }
}