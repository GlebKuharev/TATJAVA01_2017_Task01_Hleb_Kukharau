package task1_5;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Task1_5 {

	public static boolean checkInput (String[] args){
		if (args.length != 3) {
			return false;
		}
		Scanner x = new Scanner(args[0]);
		x.useLocale(Locale.US);
		Scanner y = new Scanner(args[1]);
		y.useLocale(Locale.US);
		Scanner z = new Scanner(args[2]);
		z.useLocale(Locale.US);
		return x.hasNextDouble() && y.hasNextDouble() && z.hasNextDouble();
	}

	public static double[] calculate (double x, double y, double z) {
		double[] result = {x, y, z};
		for (int i = 0; i < 3; i++) {
			if (result[i] >= 0) {
				result[i] = Math.pow(result[i], 2);
			}
			else {
				result[i] = Math.pow(result[i], 4);
			}
		}
		return result;
	}

	public static void main (String[] args) {
		if (args.length != 0) {
			if (checkInput(args)) {
				double x = Double.parseDouble(args[0]);
				double y = Double.parseDouble(args[1]);
				double z = Double.parseDouble(args[2]);
				System.out.println(Arrays.toString(calculate(x, y, z)));
			}
			else
				System.out.println("Incorrect input, please supply 3 doubles");
		}
		else
			System.out.println("No arguments detected, please supply 3 doubles");
	}
}
