
public class MetricImperialConversion
{

	public static void main(String[] args)
	{
		//print table header
		System.out.println("Feet\tMeters\t\tMeters\tFeet");
		System.out.println("____________________________________\n");
		
		//generate table body
		double[] feet1 = new double[10];
		for (int i = 0; i < 10; i++)
			feet1[i] = i + 1;
		
		double[] meters1 = new double[10];
		for (int i = 0; i < 10; i++)
			meters1[i] = footToMeter(feet1[i]);
		
		double[] meters2 = new double[10];
		for (int i = 0; i < 10; i++)
			meters2[i] = 5 * (i + 4);
		
		double[] feet2 = new double[10];
		for (int i = 0; i < 10; i++)
			feet2[i] = meterToFoot(meters2[i]);
		
		//print table body
		for (int i = 0; i < 10; i++)
		{
			System.out.printf("%2.1f\t%1.3f\t\t%2.1f\t%1.3f\n",
					feet1[i], meters1[i], meters2[i], feet2[i]);
		}
	}
	
	public static double footToMeter(double foot)
	{
		return foot * 0.305;
	}
	
	public static double meterToFoot(double meter)
	{
		return meter * 3.279;
	}

}
