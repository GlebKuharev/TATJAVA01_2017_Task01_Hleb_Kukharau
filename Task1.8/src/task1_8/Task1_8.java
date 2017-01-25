package task1_8;

import java.util.Scanner;

public class Task1_8 {

	public static boolean checkInput (String[] args) {
		for (int i = 0; i < args.length; i++) {
			Scanner sc = new Scanner(args[i]);
			if (!sc.hasNextInt()) {
				return false;
			}
		}
		return true;
	}

	public static int sum (int[] A, int K) {
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			if ((A[i] % K) == 0)
				sum += A[i];
		}
		return sum;
	}

	public static void main (String[] args) {
		if (args.length >= 1) {
			if (checkInput(args)) {
				int K = Integer.parseInt(args[args.length-1]);
				int[] A = new int[args.length - 1];
				for (int i = 0; i < args.length - 1; i++) {
					A[i] = Integer.parseInt(args[i]);
				}
				System.out.println(sum(A, K));
			}
			else {
				System.out.println("Incorrect argument format. Please supply positive ints only");
			}
		}
		else
			System.out.println("Not enough arguments detected, please supply array[int] and K");
	}

}
