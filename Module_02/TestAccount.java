package mod2;

/*
 * Author:	Stephen Lovell
 * Date:	27 Jul 2020
 */
public class TestAccount
{

	public static void main(String[] args)
	{
		Account a = new Account(1122, 20000);
		a.setAnnualInterestRate(4.5);
		a.withdraw(2500);
		a.deposit(3000);
		
		print(a);
	}
	
	public static void print(Account account)
	{
		System.out.printf("Balance:\t\t$%1.2f\n", account.getBalance());
		System.out.println("Annual Interest Rate:\t" + 
				account.getAnnualInterestRate() + "%");
		System.out.println("Date created:\t\t" + account.getDateCreated());
	}

}
