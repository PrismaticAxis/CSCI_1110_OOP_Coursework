package mod1;
/*
 *	Author: Stephen Lovell
 *	Date:	27 Jul 2020
 *
 *	Has the user enter a password and checks whether that password is valid
 *	based on the following criteria:
 *	- contains at least eight characters
 *	- consists of only letters and numbers
 *	- contains at least two numbers
 */

import java.util.Scanner;

public class CreatePassword
{

	public static void main(String[] args)
	{
		//initial prompt
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a password: ");
		String password = input.next();
		
		//check for valid
		if (password.length() >= 8
				&& containsOnlyLettersAndNumbers(password)
				&& countDigits(password) >= 2)
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	}
	
	public static boolean containsOnlyLettersAndNumbers(String s)
	{
		for (int i = 0; i < s.length(); i++)
		{
			/*
			 * unicode digits:	48-57 (decimal representation)
			 * letters:			65-90, 97-122
			 */
			char ch = s.charAt(i);
			if (ch < 48 || (ch > 57 && ch < 65) || (ch > 90 && ch < 97) || ch > 122)
				return false;
		}
		
		return true;
	}
	
	public static int countDigits(String s)
	{
		int count = 0;
		
		for (int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if (ch >= 48 && ch <= 57)
				count++;
		}
		
		return count;
	}

}
