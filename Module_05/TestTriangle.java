package mod5;

/*
 * Author:	Stephen Lovell
 * Date:	11 Aug 2020
 */
import java.util.*;

public class TestTriangle
{
	public static void main(String[] args) throws InputMismatchException, Exception
	{
		try
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter side lengths for triangle: ");
			double side1 = input.nextDouble();
			double side2 = input.nextDouble();
			double side3 = input.nextDouble();
			if (!checkValid(side1, side2, side3))
				throw new Exception();
			System.out.println("Enter color: ");
			String color = input.next();
			System.out.println("Is it filled? ('Y' for yes, 'N' for no): ");
			String str = input.next();
			boolean filled = false;
			if (str.equalsIgnoreCase("y"))
				filled = true;
			
			System.out.println(new Triangle(color, filled, side1, side2, side3));
		}
		catch (InputMismatchException ex)
		{
			ex.printStackTrace();
		}
		catch (Exception ex)
		{
			System.out.println("Invalid side lengths");
		}
	}
	
	public static boolean checkValid(double side1, double side2, double side3)
	{
		if (side1 + side2 > side3
				&& side2 + side3 > side1
				&& side3 + side1 > side2)
			return true;
		return false;
	}
}
