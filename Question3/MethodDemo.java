
public class MethodDemo
{
    public static void main(String[] args)

    {
        int[] num = {2, 1, 5, 4, 3};

        displayArray(num);

        int sum = sumArray(num);
        //double x = Math.pow(2, 3); //cube root of 2
        //int sum = add(4, 5);

        //displayName("Jennifer", 10);
        //displayName("Peter", 5);
    }

    public static int sumArray(int[] num)
    {
        int total = 0;
        for(int n=0; n<num.length; n++)
        {
            total = total + num[n];
        }
        return total; //to return back to the main method. must put outside braces.
    }

    public static void displayArray(int[] num)
    {
        for(int n=0; n<num.length; n++)
        {
            System.out.print(num[0]+ " ");
        }
        System.out.println();
    }

    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }

    /*public static void displayName(String nam, int count)
    {
    for(int n=1; n<=count; n++)
    {
    System.out.println(name);
    }
    }*/
}
