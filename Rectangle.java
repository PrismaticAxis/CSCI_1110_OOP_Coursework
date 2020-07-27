package mod2;

/*
 * Author:	Stephen Lovell
 * Date:	27 Jul 2020
 */
public class Rectangle
{
	public double width;
	public double height;
	
	public Rectangle()
	{
		width = 1.0;
		height = 1.0;
	}
	
	public Rectangle(double width, double height)
	{
		if (width > 0)
			this.width = width;
		else
			this.width = 1.0;
		
		if (height > 0)
			this.height = height;
		else
			this.height = 1.0;
	}
	
	public double getArea()
	{
		return width * height;
	}
	
	public double getPerimeter()
	{
		return (2 * width) + (2 * height); 
	}
}
