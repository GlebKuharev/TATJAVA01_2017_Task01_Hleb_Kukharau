package task1_10;

import java.util.Scanner;

public class Task1_10 {

	public static boolean checkInput (String[] args) {
		Scanner n = new Scanner(args[0]);
		return (n.hasNextInt()) && (Integer.parseInt(args[0]) % 2 == 0);
	}

	public static int[][] makeMatrix (int n) {
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					matrix[i][j] = j+1;
				}
			}
			else {
				for (int j = 0; j<n; j++) {
					matrix[i][j] = n-j;
				}
			}
		}
		return matrix;
	}

	public static void main (String[] args) {
		if (args.length != 1) {
			System.out.println("Wrong number of agruments. Please supply one positive even int");
		}
		else {
			if (checkInput(args)) {
				int[][] A = makeMatrix(Integer.parseInt(args[0]));
				for (int i = 0; i < A.length; i++) {
					for (int j = 0; j < A.length; j++) {
						System.out.print(A[i][j] + "\t");
					}
					System.out.println();
				}
			}
			else {
				System.out.println("Supplied argument is not an even int. Please supply a positive even int");
			}
		}
	}

}
