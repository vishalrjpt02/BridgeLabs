/*To the Util Class add temperaturConversion static function, given the temperature in fahrenheit as input outputs the
temperature in Celsius or viceversa using the formula
Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F
Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C
 */
package com.bridgelabz.junitTesting;

import java.util.*;

public class TemperaturConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double tem = sc.nextInt();
		Temprature(tem);
	}

	public static void Temprature(double temp) {
		double cel = 0.0;
		cel = (temp - 32) * 5 / 9;
		System.out.print(cel);

	}
}
