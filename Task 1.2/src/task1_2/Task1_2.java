package task1_2;

import java.util.Locale;
import java.util.Scanner;

public class Task1_2 {

	public static boolean checkInput(String[] args) {
		if (args.length != 3)
			return false;
		else{
			Scanner a = new Scanner(args[0]);
			a.useLocale(Locale.US);
			Scanner b = new Scanner(args[1]);
			b.useLocale(Locale.US);
			Scanner c = new Scanner(args[2]);
			c.useLocale(Locale.US);
			return (a.hasNextDouble() && b.hasNextDouble() && c.hasNextDouble());
		}
	}

	public static String calculate(double a, double b, double c) {
		if ((a == 0)||(b == 0)) {
			return "Error: division by 0";
		}
		else if (b*b + 4*a*c < 0) {
			return "Error: can't apply sqrt to negative number";
		}
		else {
			double result = (b + Math.sqrt(b*b + 4*a*c)) / (2*a) - Math.pow(a, 3)*c + Math.pow(b, -2);
			return Double.toString(result);
		}
	}

	public static void main(String[] args) {
		if (checkInput(args)) {
			System.out.println(calculate(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2])));
		}
		else
			System.out.println("Incorrect input, please supply 3 doubles");
	}

}
