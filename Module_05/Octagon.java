package mod5;

/*
 * Author:	Stephen Lovell
 * Date:	14 Aug 2020
 */
public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>
{
	double sideLength;
	
	
	
	public Octagon()
	{
		setSideLength(1);
	}
	
	public Octagon(double side)
	{
		setSideLength(side);
	}
	
	public Octagon(String color, boolean filled)
	{
		super(color, filled);
		setSideLength(1);
	}
	
	public Octagon(String color, boolean filled, double side)
	{
		super(color, filled);
		setSideLength(side);
	}
	
	
	
	public double getSideLength()
	{
		return sideLength;
	}
	
	public double getArea()
	{
		return (2 + (4 / Math.sqrt(2))) * sideLength * sideLength;
	}
	
	public void setSideLength(double side)
	{
		if (side > 0)
			sideLength = side;
		else
			sideLength = 1;
	}
	
	
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	@Override
	public int compareTo(Octagon oct)
	{
		if (getArea() < oct.getArea())
			return -1;
		else if (getArea() == oct.getArea())
			return 0;
		else
			return 1;
	}

	public String toString()
	{
		return "\tOctagon\nColor: " + color + "\nFilled: " + filled
				+ "\nArea: " + getArea();
	}
}
