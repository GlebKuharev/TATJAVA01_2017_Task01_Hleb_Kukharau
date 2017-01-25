package task1_7;

import java.util.Locale;
import java.util.Scanner;

public class Task1_7 {

	public static boolean checkInput(String[] args) {
		if (args.length != 3)
			return false;
		Scanner sA = new Scanner(args[0]);
		sA.useLocale(Locale.US);
		Scanner sB = new Scanner(args[1]);
		sB.useLocale(Locale.US);
		Scanner sH = new Scanner(args[2]);
		sH.useLocale(Locale.US);
		if ((sA.hasNextDouble()) && (sB.hasNextDouble()) && (sH.hasNextDouble())) {
			double a = sA.nextDouble();
			double b = sB.nextDouble();
			double h = sH.nextDouble();
			if ((h<=0) || (b <= a) || (b-a < h)) {
				return false;
			}
			return true;
		}
		else {
			return false;
		}
	}

	public static double f (double x) {
		return (Math.pow(Math.sin(x), 2) - Math.cos(2*x));
	}

	public static void print (double a, double b, double h) {
		double x = a;
		while(x <= b) {
			System.out.println(x + " | " + f(x));
			x += h;
		}
	}

	public static void main(String[] args) {
		if (args.length != 0) {
			if (checkInput(args)) {
				double a = Double.parseDouble(args[0]);
				double b = Double.parseDouble(args[1]);
				double h = Double.parseDouble(args[2]);
				print(a, b, h);
			}
			else
				System.out.println("Incorrect input, please supply 3 doubles: a b h; please consider: b>a, b-a>h, h>0");
		}
		else
			System.out.println("No arguments detected, please supply 3 doubles");
	}

}
