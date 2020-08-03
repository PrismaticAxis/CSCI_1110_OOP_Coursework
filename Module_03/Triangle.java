package mod3;

/*
 * Author:	Stephen Lovell
 * Date:	03 Aug 2020
 */
public class Triangle extends GeometricObject
{
	private double side1;
	private double side2;
	private double side3;
	
	//constructors
	public Triangle()
	{
		this(1.0, 1.0, 1.0, "White", false);
	}
	
	public Triangle(double side1, double side2, double side3)
	{
		this(side1, side2, side3, "White", false);
	}
	
	public Triangle(String color, boolean filled)
	{
		this(1.0, 1.0, 1.0, color, filled);
	}
	
	public Triangle(double side1, double side2, double side3, String color, boolean filled)
	{
		super();	//not actually necessary, but I had to try it once
		setSide1(side1);
		setSide2(side2);
		setSide3(side3);
		setColor(color);
		setFilled(filled);
	}
	
	
	//getters and setters
	public double getSide1()
	{
		return side1;
	}
	
	public void setSide1(double side)
	{
		if (side > 0)
			side1 = side;
		else
			side1 = 1.0;
	}
	
	public double getSide2()
	{
		return side2;
	}
	
	public void setSide2(double side)
	{
		if (side > 0)
			side2 = side;
		else
			side2 = 1.0;
	}
	
	public double getSide3()
	{
		return side3;
	}
	
	public void setSide3(double side)
	{
		if (side > 0)
			side3 = side;
		else
			side3 = 1.0;
	}
	
	
	//methods
	public boolean checkValid()
	{
		if (side1 + side2 > side3
				&& side2 + side3 > side1
				&& side3 + side1 > side2)
			return true;
		else
			return false;
	}
	
	public double getArea()
	{
		double s = (side1 + side2 + side3) / 2;
		
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	public double getPerimeter()
	{
		return side1 + side2 + side3;
	}
	
	public String toString()
	{
		return "Triangle\nSide 1:\t\t" + side1 + "\nSide 2:\t\t" + side2
				+ "\nSide 3:\t\t" + side3 + "\nColor:\t\t" + getColor()
				+ "\nFilled:\t\t" + isFilled() + "\nDate Created:\t"
				+ getDateCreated();
	}
}
