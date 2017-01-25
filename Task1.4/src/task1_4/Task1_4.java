package task1_4;

import java.util.Locale;
import java.util.Scanner;

public class Task1_4 {

	public static boolean checkInput(String[] args) {
		if (args.length != 2)
			return false;
		Scanner x = new Scanner(args[0]);
		x.useLocale(Locale.US);
		Scanner y = new Scanner(args[1]);
		y.useLocale(Locale.US);
		return x.hasNextDouble() && y.hasNextDouble();
	}
	
	public static boolean hitTargetZone(double x, double y) {
		if ((x>=-2 && x<=2 && y>=0 && y<=4) || (x>=-4 && x<=4 && y>=-3 && y<=0))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		if (args.length != 0) {
			if (checkInput(args)) {
				double x = Double.parseDouble(args[0]);
				double y = Double.parseDouble(args[1]);
				System.out.println(hitTargetZone(x, y));
			}
			else
				System.out.println("Incorrect input, please supply 2 doubles");
				
		}
		else
			System.out.println("No arguments detected, please supply 2 doubles");
	}

}
