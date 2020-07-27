import java.util.Scanner;

public class CountLetters
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		String c = "characters";
		String l = "letters";
		if (s.length() == 1)
			c = "character";
		if (countLetters(s) == 1)
			l = "letter";
		
		System.out.println("Your string is " + s.length() + " " + c + " long.");
		System.out.println("Your string contains " + countLetters(s) + " " + l + ".");
	}
	
	public static int countLetters(String s)
	{
		int count = 0;
		
		for (int i = 0; i < s.length(); i++)
		{
			//note: basic latin alphabet runs from \u0041 to \u005A
			//									and \u0061 to \u007A
			if ((s.charAt(i) >= '\u0041' && s.charAt(i) <= '\u005A')
					|| (s.charAt(i) >= '\u0061' && s.charAt(i) <= '\u007A'))
			{
				count++;
			}
		}
		
		return count;
	}

}
