package mod2;

/*
 * Author:	Stephen Lovell
 * Date:	29 Jul 2020
 */
public class ATM
{
	public static void main(String[] args)
	{
		//create accounts
		Account[] accounts = new Account[10];
		for (int i = 0; i < accounts.length; i++)
			accounts[i] = new Account(i, 100);
		
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		//run ATM
		while (true)
		{
			//choose account
			boolean validID = false;	//used in conjuction with Back option in main
										//menu to avoid 'Invalid input' when selecting
										//Back
			System.out.println("\nEnter account id");
			System.out.print("> ");
			int id = input.nextInt();
			
			for (int i = 0; i < accounts.length; i++)
				if (id == accounts[i].getID())
					//enter main menu
					while (true)
					{
						System.out.println("\n\nMain Menu");
						System.out.println("1) Check Balance");
						System.out.println("2) Withdrawal");
						System.out.println("3) Deposit");
						System.out.println("4) Back");
						System.out.print("> ");
						int choice = input.nextInt();
						
						if (choice == 1)
							System.out.printf("Current balance: $%1.2f",
									accounts[id].getBalance());
						else if (choice == 2)
						{
							System.out.println("\nEnter amount to withdraw");
							System.out.print("> ");
							double amount = input.nextDouble();
							accounts[id].withdraw(amount);
							if (amount > accounts[id].getBalance())
								System.out.println("\n\nInsufficient funds");
							else
								System.out.printf("\n\nSuccessful withdrawal of $%1.2f", amount);
						}
						else if (choice == 3)
						{
							System.out.println("\nEnter amount to deposit");
							System.out.print("> ");
							double amount = input.nextDouble();
							accounts[id].deposit(amount);
							System.out.printf("\n\nSuccessful deposit of $%1.2f", amount);
						}
						else if (choice == 4)
						{
							validID = true;
							break;
						}
						else
							System.out.println("\n\nInvalid input");
						
						continue;
					}
			if (!validID)	//false by default, but made true when exiting
							//main menu to prevent error message
				System.out.println("\n\nInvalid id");
			continue;
		}
	}
}
