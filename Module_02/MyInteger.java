package mod2;

/*
 * Author:	Stephen Lovell
 * Date:	29 Jul 2020
 */
public class MyInteger
{
	private int value;
	
	
	
	public MyInteger(int value)
	{
		this.value = value;
	}
	
	
	
	public int getValue()
	{
		return value;
	}
	
	
	
	public static boolean isEven(int value)
	{
		return value % 2 == 0;
	}
	
	public static boolean isOdd(int value)
	{
		return value % 2 != 0;
	}
	
	public static boolean isPrime(int value)
	{
		for (int i = 2; i < value / 2; i++)
			if (value % i == 0)
				return false;
		
		return true;
	}
	
	public static boolean isEven(MyInteger myInt)
	{
		return isEven(myInt.value);
	}
	
	public static boolean isOdd(MyInteger myInt)
	{
		return isOdd(myInt.value);
	}
	
	public static boolean isPrime(MyInteger myInt)
	{
		return isPrime(myInt.value);
	}
	
	public boolean isEven()
	{		
		return isEven(value);
	}
	
	public boolean isOdd()
	{
		return isOdd(value);
	}
	
	public boolean isPrime()
	{
		return isPrime(value);
	}
	
	public boolean equals(int n)
	{
		return n == value;
	}
	
	public boolean equals(MyInteger myInt)
	{
		return equals(myInt.value);
	}
	
	public int parseInt(char[] numbers)
	{
		String str = "";
		for (int i = 0; i < numbers.length; i++)
			str = str + numbers[i];
		
		return parseInt(str);
	}
	
	public int parseInt(String str)
	{
		int result = 0;
		
		for (int i = 0; i < str.length(); i++)
			result = (int) (result + (str.charAt(i) - '0') * (Math.pow(10, str.length() - (i + 1))));
		
		return result;
	}
}
