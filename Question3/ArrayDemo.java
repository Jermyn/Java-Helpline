
public class ArrayDemo
{
    public static void main(String[] args)
    {
        int[] num = {2, 1, 5, 3, 4};

        //rotate the values in the array anticlockwise
        // 2 1 5 3 4 becomes 1 5 3 4 2
        int temp = num[0];
        for (int n=0; n<num.length-1; n++)
        {
            num[n] = num[n+1];
            num[num.length-1]=temp;
            
            /*temp = num[0];
            num[0] = num[1];
            num[1] = num[2];
            num[2] = num[3];
            num[3] = num[4];
            num[4] = temp;*/
        }
        
        for (int n=0; n<num.length; n++)
        {
            System.out.println(num[n]);
            //or num[n]++; // num[n] += 1;
        }

        //System.out.println(num.length);//count how many fields are there

        //search for number, display "Found" or "Not Found"
        int toFind=3;
        boolean found=false;
        for (int n=0; n<num.length; n++)
        {
            if (num[n]  == toFind)
            {
                System.out.println("Found");
                found = true;

                break;
            }
            /*else
            {
            System.out.println("Not Found");
            }*/
        }
        if (!found)
        {
            System.out.println("Not found!");
        }

        //find the max value in the array
        int max=num[0];
        for (int n=1; n<num.length; n++)
        {
            if (num[n] > max)
            {
                max = num[n];
            }
        }
        System.out.println("The highest no. is " + max);

        //print a count of number of even number in the array
        int count=0;

        for (int n=0; n<num.length; n++)
        {
            if (num[n]%2 == 0) //means no remainder, tells u it is a even number
            {
                count++;
            }
        }
        System.out.println(count);

        for (int n=0; n<num.length; n++)
        {
            num[n] = num[n]+1;
            //or num[n]++; // num[n] += 1;
        }

        //Add 1 to every element of the array
        for (int n=0; n<num.length; n++)
        {
            num[n] = num[n]+1;
            //or num[n]++; // num[n] += 1;
        }

        /*int num1, num2, num3, num4, num5;

        int[] num = new int[5];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;
        num[4]=5;

        //instead of listing down manually, can use the for loop with the arrays. assisgn number to array
        for(int n=0; n<5; n++)
        {
        num[n] = n+1;
        }

        int sum=0;
        for (int n=0; n<5; n++)
        {
        sum = sum + num[n];
        }
        System.out.println("Sum is " + sum);

        // to print array
        for(int n=0; n<5; n++)
        {
        System.out.print( num[n] + " " );
        }

        System.out.println();
         */

    }
}
