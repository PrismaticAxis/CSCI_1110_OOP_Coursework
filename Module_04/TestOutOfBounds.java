package mod4;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Author:	Stephen Lovell
 * Date:	05 Aug 2020
 */
public class TestOutOfBounds
{
	public static void main (String[] args)
	throws ArrayIndexOutOfBoundsException, InputMismatchException
	{
		int[] numbers = new int[100];
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = (int)(Math.random() * 100 + 1); //random from 1-100
		
		Scanner in = new Scanner(System.in);
		
		try
		{
			System.out.print("Enter an index from 0-99: ");
			int choice = in.nextInt();
			System.out.println(
					"\nThe value at index " + choice + " is " + numbers[choice]);
		}
		catch (ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("\nOut of bounds");
		}
		catch (InputMismatchException ex)
		{
			System.out.println("\nInvalid input; please enter an integer");
		}
	}
}
