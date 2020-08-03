package mod3;

/*
 * Author:	Stephen Lovell
 * Date:	03 Aug 2020
 */
public class CheckingAccount extends Account
{
	double overdraftLimit;
	
	//constructors
	public CheckingAccount()
	{
		setOverdraftLimit(0.0);
	}
	
	public CheckingAccount(double overdraftLimit)
	{
		setOverdraftLimit(overdraftLimit);
	}
	
	public CheckingAccount(int id, double balance, double overdraftLimit)
	{
		super(id, balance);
		setOverdraftLimit(overdraftLimit);
	}
		
	
	
	//getters and setters
	public double getOverdraftLimit()
	{
		return overdraftLimit;
	}
	
	public void setOverdraftLimit(double newLimit)
	{
		if (newLimit >= 0)
			overdraftLimit = newLimit;
		else
			overdraftLimit = 0.0;
	}
	
	
	
	//methods
	public String toString()
	{
		return "Account\nType:\t\t\tChecking\nID:\t\t\t" + getID()
		+ "\nCurrent Balance:\t" + this.getBalance() + "\nAnnual Interest Rate\t"
		+ getAnnualInterestRate() + "\nOverdraft Limit:\t"
		+ getOverdraftLimit() + "\nDate Created:\t\t" + getDateCreated();
	}
	
}
