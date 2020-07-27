package mod2;

/*
 * Author:	Stephen Lovell
 * Date:	27 Jul 2020
 */
public class TestRectangle
{

	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		System.out.println("Rectangle 1");
		System.out.println("\tWidth:\t\t" + r1.width);
		System.out.println("\tHeight:\t\t" + r1.height);
		System.out.println("\tArea:\t\t" + r1.getArea());
		System.out.println("\tPerimeter:\t" + r1.getPerimeter());
		
		System.out.println("Rectangle 2");
		System.out.println("\tWidth:\t\t" + r2.width);
		System.out.println("\tHeight:\t\t" + r2.height);
		System.out.println("\tArea:\t\t" + r2.getArea());
		System.out.println("\tPerimeter:\t" + r2.getPerimeter());
	}

}
