package t1;

import java.util.Scanner;

public class UnitConverter {

	public static void convertToFahrenheit(Double inputValue) {
		
		if (inputValue < -273.15) {
			System.out.println("Die angegebene Temperatur ist zu tief.");
		} else if(inputValue.isNaN()) {
			System.out.println("Bitte geben Sie eine definierte Zahl an!");
		} else {
			double fahrenheit = (9.0 / 5.0) * inputValue + 32.0;
			System.out.println(inputValue + " Grad Celsius sind " + fahrenheit + " Grad Fahrenheit!");
		}
	}

	public static void main(String[] args) {

		/*
		 * double celsius = 36.0; double fahrenheit = (9.0 / 5.0) * celsius + 32.0;
		 * 
		 * System.out.println(celsius + " Grad Celsius sind " + fahrenheit +
		 * " Grad Fahrenheit!");
		 */
		System.out.print("Bitte geben Sie eine Temperatur in Grad Celsius an:");
		Scanner scanner = new Scanner(System.in);
		try {
			convertToFahrenheit(scanner.nextDouble());
		} catch (Exception e) {
			System.out.println("Bitte geben Sie eine Zahl an!");
		}
	}
}
