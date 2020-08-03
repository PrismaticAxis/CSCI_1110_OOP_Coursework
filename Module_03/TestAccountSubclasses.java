package mod3;

/*
 * Author:	Stephen Lovell
 * Date:	03 Aug 2020
 */
public class TestAccountSubclasses
{
	public static void main(String[] args)
	{
		System.out.println(new Account(1, 100) + "\n");
		System.out.println(new CheckingAccount(2, 150, 50) + "\n");
		System.out.println(new SavingsAccount(3, 200));
	}
}
