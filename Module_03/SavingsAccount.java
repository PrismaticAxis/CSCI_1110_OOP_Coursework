package mod3;

/*
 * Author:	Stephen Lovell
 * Date:	03 Aug 2020
 */
public class SavingsAccount extends Account
{
	
	
	public SavingsAccount()
	{
		
	}
	
	public SavingsAccount(int id, double balance)
	{
		super(id, balance);
	}
	
	
	
	public String toString()
	{
		return "Account\nType:\t\t\tSavings\nID:\t\t\t" + getID()
		+ "\nCurrent Balance:\t" + getBalance() + "\nAnnual Interest Rate\t"
		+ getAnnualInterestRate() + "\nDate Created:\t\t" + getDateCreated();
	}
}
