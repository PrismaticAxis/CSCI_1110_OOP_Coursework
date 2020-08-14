package mod5;

/*
 * Author:	Stephen Lovell
 * Date:	14 Aug 2020
 */
public class TestColorable
{
	public static void main(String[] args)
	{
		String[] colors = {"White", "Blue", "Black", "Red", "Green"};
		
		GeometricObject[] shapes = new GeometricObject[5];
		for (int i = 0; i < shapes.length; i++)
		{
			shapes[i] = new Triangle(colors[i], true, i + 2, i + 3, i + 4);
			System.out.println("Shape " + (i + 1) + "\nArea: " + shapes[i].getArea());
			System.out.print("How to color: ");
			shapes[i].howToColor();
			System.out.println();
		}
	}
}
