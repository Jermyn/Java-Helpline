
public class Lab1_6
{
    public static void main(String[] args)
    {
        int side1 = Integer.parseInt(args[0]);
        int side2 = Integer.parseInt(args[1]);
        int side3 = Integer.parseInt(args[2]);
        
        double sValue = (side1 + side2 + side3)/ (double) 2;
        
        double area = Math.sqrt(sValue * (sValue - side1) * (sValue - side2) * (sValue - side3) );
        
        System.out.printf("The area for the triangle is %.2f.\n", area);
    }
}
