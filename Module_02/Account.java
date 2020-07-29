package mod2;

import java.util.Date;

/*
 * Author:	Stephen Lovell
 * Date:	27 Jul 2020
 */
public class Account
{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account()
	{
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
		dateCreated = new Date();
	}
	
	public Account(int id, double initialBalance)
	{
		this.id = id;
		balance = initialBalance;
		annualInterestRate = 0.0;
		dateCreated = new Date();
	}
	
	public int getID()
	{
		return id;
	}
	
	public void setID(int newID)
	{
		id = newID;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double newBalance)
	{
		balance = newBalance;
	}
	
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double newRate)
	{
		annualInterestRate = newRate;
	}
	
	public Date getDateCreated()
	{
		return dateCreated;
	}
	
	public double getMonthlyInterestRate()
	{
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest()
	{
		return balance * getMonthlyInterestRate();
	}
	
	public void withdraw(double amount)
	{
		if (amount <= balance)
			balance = balance - amount;
	}
	
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
}
