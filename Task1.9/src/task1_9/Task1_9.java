package task1_9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1_9 {

	public static boolean checkInput (String[] args) {
		Scanner x = new Scanner(args[0]);
		Scanner y = new Scanner(args[1]);
		Scanner z = new Scanner(args[2]);
		return x.hasNextInt() && y.hasNextInt() && z.hasNextInt();
	}

	public static String merge (int[] A, int[] B, int k) {
		if (A.length <= k)
			return "Error: k must greater than the length of the 1st array";
		int[] C = new int[A.length + B.length];
		System.arraycopy(A, 0, C, 0, A.length);
		System.arraycopy(B, 0, C, k, B.length);
		System.arraycopy(A, k, C, k + B.length, A.length - k);
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		return Arrays.toString(C);
	}

	public static void main(String[] args) {
		if (args.length != 3 || !checkInput(args)) {
			System.out.println("Input three int arguments: 1st array size, 2nd array size, k");
		}
		else
		{
			int[] A = new int[Integer.parseInt(args[0])];
			int[] B = new int[Integer.parseInt(args[1])];
			for (int i = 0; i < A.length; i++) {
				int rand = new Random(System.currentTimeMillis()).nextInt();
				A[i] = rand;
			}
			for (int i = 0; i < B.length; i++) {
				int rand = new Random(System.currentTimeMillis()).nextInt() % 10;
				B[i] = rand;
			}
			System.out.println(merge(A, B, Integer.parseInt(args[2])));
		}
	}
}
