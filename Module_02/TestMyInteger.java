package mod2;

/*
 * Author:	Stephen Lovell
 * Date:	29 Jul 2020
 */
public class TestMyInteger
{
	public static void main(String[] args)
	{
		MyInteger myInt = new MyInteger(386);
		
		//test non-static methods
		System.out.println("Testing non-static methods:");
		System.out.println("Value:\t\t" + myInt.getValue());	//should return 386
		System.out.println("Even:\t\t" + myInt.isEven());		//should return true
		System.out.println("Odd:\t\t" + myInt.isOdd());			//should return false
		System.out.println("Prime:\t\t" + myInt.isPrime());		//should return false
		
		//test static methods with int argument
		System.out.println("\nTesting static methods with int argument:");
		System.out.println("Value:\t\t" + myInt.getValue());						//should return 386
		System.out.println("Even:\t\t" + MyInteger.isEven(myInt.getValue()));		//should return true
		System.out.println("Odd:\t\t" + MyInteger.isOdd(myInt.getValue()));			//should return false
		System.out.println("Prime:\t\t" + MyInteger.isPrime(myInt.getValue()));		//should return false
		
		//test static methods with MyInteger argument
		System.out.println("\nTesting static methods with MyInteger argument:");
		System.out.println("Value:\t\t" + myInt.getValue());						//should return 386
		System.out.println("Even:\t\t" + MyInteger.isEven(myInt));					//should return true
		System.out.println("Odd:\t\t" + MyInteger.isOdd(myInt));					//should return false
		System.out.println("Prime:\t\t" + MyInteger.isPrime(myInt));				//should return false
		
		//test equals() methods
		System.out.println("\nTesting equals(int) and equals(MyInteger)");
		System.out.println("Value:\t\t" + myInt.getValue());								//should return 386
		System.out.println("\nCompare to:\t\t447");
		System.out.println("equals(int):\t\t" + myInt.equals(447));							//should return false
		System.out.println("equals(MyInteger):\t" + myInt.equals(new MyInteger(447)));	//should return false
		
		System.out.println("\nCompare to:\t\t386");
		System.out.println("equals(int):\t\t" + myInt.equals(386));							//should return true
		System.out.println("equals(MyInteger):\t" + myInt.equals(new MyInteger(386)));	//should return true
		
	}
}
