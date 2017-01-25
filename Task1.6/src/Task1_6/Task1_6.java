package Task1_6;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Task1_6 {

	public static boolean checkInput (String[] args) {
		if (args.length != 3)
			return false;
		Scanner x = new Scanner(args[0]);
		x.useLocale(Locale.US);
		Scanner y = new Scanner(args[1]);
		y.useLocale(Locale.US);
		Scanner z = new Scanner(args[2]);
		z.useLocale(Locale.US);
		return x.hasNextDouble() && y.hasNextDouble() && z.hasNextDouble();
	}
	
	public static double calculate (double x, double y, double z) {
		double[] arr = {x, y, z};
		Arrays.sort(arr);
		return (arr[0] + arr[2]);
	}
	
	public static void main (String[] args) {
		if (args.length != 0) {
			if (checkInput(args)) {
				double x = Double.parseDouble(args[0]);
				double y = Double.parseDouble(args[1]);
				double z = Double.parseDouble(args[2]);
				System.out.println("Sum of Min and Max: " + calculate(x, y, z));
			}
			else
				System.out.println("Incorrect input, please supply 3 doubles");
		}
		else
			System.out.println("No arguments detected, please supply 3 doubles");
	}

}
