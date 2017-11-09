public class Lab4_1
{
    public static void main(String[] args){
        String[] days = {"Monday", "Tuesday","Wednesday", "Thursday", "Friday","Saturday","Sunday"};
    //part a
    int n = Integer.parseInt(args[0]);
    System.out.println( days[n-1] );
    //part b
    for ( int d=0; d<7; d++)
    {
        System.out.println( (d+1) + " " + days[d]);
    }
}
}