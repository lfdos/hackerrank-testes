package com.rackerrank.exe05;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		// int[] ar = new int[] {5, 5, 5, 5, 5};
		// int[] ar = new int[] {5, 5, 5, 5, 4};
		// int[] ar = new int[] {3, 2, 1, 3};
		int[] ar = new int[] {18, 90, 90, 13, 90, 75, 90, 8, 90, 43};
		int tamAr = ar.length, ma = ar[0], qtMa = 0;
		for(int i = 0; i < tamAr; i++) {
			if(ar[i] > ma) {
				ma = ar[i];
			}
		}
		for(int i = 0; i < tamAr; i++) {
			if(ar[i] == ma)
				qtMa++;
		}
		System.out.println(qtMa);
	}

}
