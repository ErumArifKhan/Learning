package first;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

//Hello World!	
/*	public static void main(String[] args) {
		System.out.println("Hello World!");

	}*/

//Temperature conversion
	/*
	public static void main(String[] args) {
		try (Scanner input = new Scanner (System.in)) {
			System.out.println("Please enter the temperature: ");
			String temperatureString = input.nextLine();
			int temperature = Integer.parseInt(temperatureString);
			System.out.println("Is the temperature in (C)elcius or (F)ahrenheit? ");
			String temperatureScale = input.nextLine();
			double newTemperature;
			if (temperatureScale.compareToIgnoreCase("C") == 0)
			{
				newTemperature = temperature * 1.8 + 32;
				System.out.printf("%dC is %.2fF",temperature,newTemperature);
			}
			else if (temperatureScale.compareToIgnoreCase("F") == 0)
			{
				newTemperature = (temperature - 32) / 1.8;
				System.out.printf("%dF is %.2fC",temperature, newTemperature);
			}
			
		}
		

	}*/
	
	//use methods, arrays, lists
	/*
	public static List<String> convertArrayToString(String[] stringArray)
	{
		List<String> stringList = new ArrayList<String>();
		for(int i=0; i<stringArray.length; i++)
		{
			stringList.add(stringArray[i]);
		}
		return stringList;
	}
	
	public static void main(String[] args) {
		String[] stringArray = new String[4];
		stringArray[0] = "Erum";
		stringArray[1] = "Suleiman";
		stringArray[2] = "Samar";
		stringArray[3] = "Temur";
		
		List<String> stringList = new ArrayList<String>();
		stringList = convertArrayToString(stringArray);
		
		//display both array and list items
		for(int i=0; i<stringArray.length; i++)
		{
			System.out.println(stringArray[i]);
		}
		for(int i=0; i<stringList.size(); i++)
		{
			System.out.println(stringList.get(i));
		}
	}*/
	
	//reverse a list, use a stack
}
