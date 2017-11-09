public int computeMethod(double amount, String name)
{
	
}

public boolean hasLeave()
{

}

public String toString()
{

}

public double computeLeaveToMoney(double rate)
{
	// double convertedAmt;

	if (canExchange == true)
	{
		// convertedAmt = balanceLeave * rate;
		return balanceLeave * rate;
		// return convertedAmt;
	}
	// else
	// {
	return -1.0;
	// }
}

public int compareTo(Staff newStaff)
{
		if (balanceLeave>newStaff.getBalanceLeave())
		{
			return 1;
		}
		else if (balanceLeave=newStaff.getBalanceLeave())
		{
			return 0;
		}
		else
		{
			return -1;
		}
}

String myStr = new String("hello");

Staff staff1 = new Staff("Dawn Ho",14);
Staff staff2 = new Staff("Alan Tan", 'S', 21, true);

staff1.changeIsAllowedMoneyExchanged();

int staff2Leave = staff2.getBalanceLeave(); //get current leave
staff2Leave = staff2Leave - 21 ; //subtract 21 from current leave
staff2.setBalanceLeave(staff2Leave); //change current leave

staff2.setBalanceLeave(staff2.getBalanceLeave()-21);