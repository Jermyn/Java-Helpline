import java.util.Scanner;
import java.util.ArrayList;

public class Question4
{
    public static void main (String [] args)
    {
    	String details;
    	ArrayList<Staff> staffList = new ArrayList<Staff>();
    	Staff firstStaff = new Staff("Dawn Ho", 14);
    	Staff secondStaff = new Staff("Alan Tan", 'S', 21, true);
    	staffList.add(firstStaff);
    	staffList.add(secondStaff);

    	staffList.get(0).changeIsAllowedMoneyExchanged();
    	staffList.get(1).setBalanceLeave(staffList.get(1).getBalanceLeave()-21);

    	for (int staff=0; staff<staffList.size(); staff++) {
    		if (staffList.get(staff).getBalanceLeave()>0)
    			System.out.println(staffList.get(staff).toString());
    	}
    }
}
