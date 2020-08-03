package mod3;

/*
 * Author:	Stephen Lovell
 * Date:	03 Aug 2020
 */
public class TestTriangle
{

	public static void main(String[] args)
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		double side1;
		double side2;
		double side3;
		while (true)
		{
			System.out.println("Enter side lengths for a triangle: ");
			side1 = input.nextDouble();
			side2 = input.nextDouble();
			side3 = input.nextDouble();
			
			if (new Triangle(side1, side2, side3).checkValid())
				break;
			else
			{
				System.out.println("Invalid side lengths\n");
				continue;
			}
		}
		
		
		System.out.println("What color? ");
		String color = input.next();
		
		boolean filled;
		while (true)
		{
			System.out.println("Is it filled ('Y' for yes, 'N' for no)?" );
			String choice = input.next();
			if (choice.equalsIgnoreCase("Y"))
			{
				filled = true;
				break;
			}
			else if (choice.equalsIgnoreCase("N"))
			{
				filled = false;
				break;
			}
			else
			{
				System.out.println("Invalid input\n");
				continue;
			}
		}
		
		System.out.println("\n" + new Triangle(side1, side2, side3, color, filled));
		
	}

}
