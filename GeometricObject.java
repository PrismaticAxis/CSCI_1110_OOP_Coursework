package mod3;

/*
 * Author:	Stephen Lovell
 * Date:	03 Aug 2020
 */
import java.util.Date;

public class GeometricObject
{
	private String color;
	private boolean filled;
	private Date dateCreated;
	
	//constructors
	public GeometricObject()
	{
		color = "White";
		filled = false;
		dateCreated = new Date();
	}
	
	public GeometricObject(String color, boolean filled)
	{
		setColor(color);
		setFilled(filled);
	}
	
	
	//getters and setters
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		if (color != null)
			this.color = color;
		else
			this.color = "White";
	}
	
	public boolean isFilled()
	{
		return filled;
	}
	
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	public Date getDateCreated()
	{
		return dateCreated;
	}
	
	
	//methods
	public String toString()
	{
		return "Geometric Object\nColor:\t\t" + color + "\nFilled:\t\t" + filled
				+ "\nDate Created:\t" + dateCreated;
	}
	
}
