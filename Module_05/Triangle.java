package mod5;

/*
 * Author:	Stephen Lovell
 * Date:	14 Aug 2020
 * 
 * Updated to implement Colorable
 */
public class Triangle extends GeometricObject implements Colorable
{
	double side1;
	double side2;
	double side3;
	
	
	
	public Triangle()
	{
		this(1, 1, 1);
	}
	
	public Triangle(double side1, double side2, double side3)
	{
		setSide1(side1);
		setSide2(side2);
		setSide3(side3);
	}
	
	public Triangle(String color, boolean filled)
	{
		this(color, filled, 1, 1, 1);
	}
	
	public Triangle(String color, boolean filled, double side1, double side2, double side3)
	{
		this(side1, side2, side3);
		setColor(color);
		setFilled(filled);
	}
	
	
	
	public double getSide1()
	{
		return side1;
	}
	
	public double getSide2()
	{
		return side2;
	}
	
	public double getSide3()
	{
		return side3;
	}
	
	public double getPerimeter()
	{
		return side1 + side2 + side3;
	}

	public double getArea()
	{
		double s = getPerimeter() / 2;
		
		return (Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));
	}
	
	public void setSide1(double side)
	{
		if (side > 0)
			side1 = side;
		else
			side1 = 1;
	}
	
	public void setSide2(double side)
	{
		if (side > 0)
			side2 = side;
		else
			side2 = 1;
	}
	
	public void setSide3(double side)
	{
		if (side > 0)
			side3 = side;
		else
			side3 = 1;
	}
	
	public String toString()
	{
		return "\tTriangle\nColor: " + color + "\nFilled: " + filled
				+ "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea();
	}

	@Override
	public void howToColor()
	{
		System.out.println("Color all three sides");
	}
}
