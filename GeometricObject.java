package mod5;

/*
 * Author:	Stephen Lovell
 * Date:	11 Aug 2020
 */
public abstract class GeometricObject
{
	String color;
	boolean filled;
	
	
	
	public GeometricObject()
	{
		this("White", false);
	}
	
	public GeometricObject(String color, boolean filled)
	{
		setColor(color);
		setFilled(filled);
	}



	public String getColor()
	{
		return color;
	}
	
	public boolean isFilled()
	{
		return filled;
	}
	
	public abstract double getArea();
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	
	
	public String toString()
	{
		return "\tGeometricObject\nColor: " + color + "\nFilled: " + filled;
	}
}
