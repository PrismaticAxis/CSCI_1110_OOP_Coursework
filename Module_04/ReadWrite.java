package mod4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Author:	Stephen Lovell
 * Date:	05 Aug 2020
 */
public class ReadWrite
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//generate array of random numbers
		int[] numbers = new int[100];
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = (int)(Math.random() * 100 + 1);
		
		//create file (if it doesn't already exist)
		File file = new File("Exercise12_15");
		if (file.exists())
		{
			System.out.println("File already exists");
			System.exit(1);
		}
		
		//print to file (Exercise12_15)
		PrintWriter output = new PrintWriter(file);
		for (int i = 0; i < numbers.length; i++)
			output.println(numbers[i]);
		output.close();
		
		//store contents of Exercise12_15 in ArrayList
		Scanner input = new Scanner(file);
		ArrayList<Integer> unsortedList = new ArrayList<>();
		while (input.hasNext())
			unsortedList.add(input.nextInt());
		
		//sort list
		ArrayList<Integer> sortedList = new ArrayList<>();
		while (unsortedList.size() > 0)
		{
			int min = unsortedList.get(0);
			int minIndex = 0;
			for (int i = 0; i < unsortedList.size(); i++)
				if (unsortedList.get(i) < min)
				{
					min = unsortedList.get(i);
					minIndex = i;
				}
			sortedList.add(min);
			unsortedList.remove(minIndex);
		}
		
		//print sorted list
		System.out.println(sortedList);
	}
	
}
