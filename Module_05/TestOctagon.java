package mod5;

public class TestOctagon
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		try
		{
			Octagon oct1 = new Octagon("Silver", true, 5.0);
			Octagon oct2 = (Octagon)oct1.clone();
			
			System.out.println(oct1.toString() + "\n\n" + oct2.toString() + "\n");
			
			System.out.println("oct1.compareTo(oct2) returns " + oct1.compareTo(oct2));
		}
		catch (CloneNotSupportedException ex)
		{
			ex.printStackTrace();
		}
		
	}
}
