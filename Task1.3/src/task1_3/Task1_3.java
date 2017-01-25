package task1_3;

import java.util.Locale;
import java.util.Scanner;

public class Task1_3 {

	public static boolean checkInput (String[] args) {
		if (args.length != 2) {
			return false;
		}
		Scanner sA = new Scanner(args[0]);
		sA.useLocale(Locale.US);
		Scanner sB = new Scanner(args[1]);
		sB.useLocale(Locale.US);
		if ((sA.hasNextDouble()) && (sB.hasNextDouble())) {
			double a = Double.parseDouble(args[0]);
			double b = Double.parseDouble(args[1]);
			return ((a > 0) && (b > 0));
		}
		else {
			return false;
		}
	}

	public static double getArea (double a, double b) {
		return (a*b/2);
	}
	
	public static double getPerimeter (double a, double b) {
		return (a + b + Math.sqrt(a*a + b*b));
	}

	public static void main (String[] args) {
		if (args.length != 0) {
			if (checkInput(args)) {
				double a = Double.parseDouble(args[0]);
				double b = Double.parseDouble(args[1]);
				System.out.println("Area: " + getArea(a, b) + "\n" + "Perimeter: " + getPerimeter(a, b));	
			}	
			else
				System.out.println("Incorrect input, please supply 2 positive doubles");
		}	
		else
			System.out.println("No arguments detected, please supply 2 positive doubles");
	}
}
