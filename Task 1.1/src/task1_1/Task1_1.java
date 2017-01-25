package task1_1;

import java.util.Scanner;

public class Task1_1 {
	
	public static boolean correctInput(String s) {
		Scanner sc = new Scanner(s);
		if (sc.hasNextInt()) {
			if ((s.length() == 4) || ((s.length() == 5) && (s.substring(0, 1).equals("-")))) {
				return true;
			}
		}
		return false;
	}

	public static boolean check(int num) {
		int[] digits = new int[4];
		num = Math.abs(num);
		for (int i = 0; i < digits.length; i++) {
			digits[i] = num % 10;
			num /= 10;
		}
		if ((digits[0] + digits[1]) == (digits[2] + digits[3]))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		if (args.length != 0) {
			if (correctInput(args[0]))
				System.out.println(check(Integer.parseInt(args[0])));
			else
				System.out.println("Incorrect input. Please input a 4-digit int argument");
		}
		else
			System.out.println("No input detected. Please input a 4-digit int argument");
	}

}
