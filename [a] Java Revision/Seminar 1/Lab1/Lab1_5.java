
public class Lab1_5
{
    public static void main(String[] args)
    {
        int time = Integer.parseInt(args[0]);
        
        int hour = time / 3600;
        int min = (time % 3600) / 60;
        int sec = time % 60;
        
        System.out.println(time + " seconds is actually " + hour + " hours, " + min + " mins and " + sec + " seconds.");
    }
}
