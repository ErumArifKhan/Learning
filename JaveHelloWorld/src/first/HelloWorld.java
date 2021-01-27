package first;

import java.util.Scanner;

public class HelloWorld {

//Hello World!	
/*	public static void main(String[] args) {
		System.out.println("Hello World!");

	}*/

//Temperature conversion
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
		

	}


}
