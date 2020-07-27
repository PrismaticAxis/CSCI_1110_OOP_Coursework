import java.util.Scanner;

public class BuildTriangle
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("Enter lengths for the three sides of the triangle: ");
			double side1 = input.nextDouble();
			double side2 = input.nextDouble();
			double side3 = input.nextDouble();
			
			if (!isValid(side1, side2, side3))
			{
				System.out.println("Not a valid triangle\n\n");
				continue;
			}
			else
			{
				System.out.println("Side 1:\t" + side1);
				System.out.println("Side 2:\t" + side2);
				System.out.println("Side 3:\t" + side3);
				System.out.printf("Area:\t%1.1f", area(side1, side2, side3));
				break;
			}
		}
		
	}
	
	public static boolean isValid(double side1, double side2, double side3)
	{
		if (side1 + side2 > side3
			&& side2 + side3 > side1
			&& side3 + side1 > side2
			&& side1 > 0 && side2 > 0 && side3 > 0)
			return true;
		else
			return false;
	}
	
	public static double area(double side1, double side2, double side3)
	{
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

}
