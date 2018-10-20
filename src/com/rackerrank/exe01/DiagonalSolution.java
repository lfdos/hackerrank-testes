package com.rackerrank.exe01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DiagonalSolution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
    	/*
    	int[][] arr = new int[][] {
			new int[] {11, 2, 4},
			new int[] {4, 5, 6},
			new int[] {10, 8, -12}
		};
		*/
		int left = 0, right = arr[0].length - 1;
		int somaLeft = 0, somaRight = 0;
		
		for (int l = 0; l < arr.length; l++) {
			for (int c = 0; c < arr[0].length; c++) {
				if(left == c)
					somaLeft += arr[l][c];
			}
			left++;
			
			for (int r = right; r > -1 ; r--) {
				if(right == r)
					somaRight += arr[l][r];
			}
			right--;			
		}
		
		// System.out.println("Soma-left: "+somaLeft+" | Soma-right: "+somaRight+ " | Diferença: "+Math.abs(somaLeft-somaRight));
    	return Math.abs(somaLeft-somaRight);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
