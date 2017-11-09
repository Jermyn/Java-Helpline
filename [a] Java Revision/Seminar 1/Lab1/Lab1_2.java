
public class Lab1_2
{
    public static void main(String [] args)
    {
        double farenheit = Double.parseDouble(args[0]);
        double centigrade = (double) 5/9 * (farenheit - 32);

        System.out.printf(farenheit + "F is %.2f" + "C\n", centigrade);
    }
}
