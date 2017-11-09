
public class Lab1_7
{
    public static void main(String[] args)
    {
        double loanAmt = Double.parseDouble(args[0]);
        double duration = Double.parseDouble(args[1]);
        double intRate = Double.parseDouble(args[2]);

        double compoundInt = loanAmt * Math.pow(1+(intRate/100),duration);

        System.out.printf("Compound interest based on the loan amount of $%.2f and over the duration of %.2f years as well as at the %.2f%% rate of interest is %.2f.", loanAmt, duration, intRate, compoundInt);
    }
}
